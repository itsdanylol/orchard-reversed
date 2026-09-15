#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

uniform sampler2D Sampler0;

in vec2 texCoord0;
in vec3 shapeData;
in vec4 vertexColor;

out vec4 fragColor;

float median(float r, float g, float b) {
    return max(min(r, g), min(max(r, g), b));
}

void main() {
    vec3 sampleValue = texture(Sampler0, texCoord0).rgb;
    float sd = median(sampleValue.r, sampleValue.g, sampleValue.b) - 0.5;
    vec2 sz = vec2(textureSize(Sampler0, 0));
    // Each atlas is generated with its own distance range; text quads carry it
    // in shapeData.y. Rendering every atlas at a fixed range under-fills the
    // glyphs and makes bold faces look washed out.
    float distanceRange = shapeData.y >= 4.0 ? shapeData.y : 12.0;
    vec2 unitRange = vec2(distanceRange) / sz;
    vec2 screenTexSize = vec2(1.0) / max(fwidth(texCoord0), vec2(0.00001));
    float screenPxDistance = max(0.5 * dot(unitRange, screenTexSize), 1.0) * sd;
    float alpha = clamp(screenPxDistance + 0.5, 0.0, 1.0);

    vec4 color = vertexColor * ColorModulator;
    color.a *= alpha;
    if (color.a <= 0.001) {
        discard;
    }
    fragColor = color;
}
