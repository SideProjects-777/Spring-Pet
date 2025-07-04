package com.pet.project.exam.module01.q2Pattern.after;

import com.pet.project.exam.module01.q2Pattern.common.renderer.Renderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.color.DefaultColorRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.color.FontColorRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.style.DefaultFontStyleRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.style.FontStyleRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.weight.DefaultFontWeightRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.weight.FontWeightRenderer;

class TextRenderer {

    private final FontStyleRenderer fontStyleRenderer;
    private final FontColorRenderer fontColorRenderer;
    private final FontWeightRenderer fontWeightRenderer;

    private TextRenderer(FontStyleRenderer fontStyleRenderer, FontColorRenderer fontColorRenderer, FontWeightRenderer fontWeightRenderer) {
        this.fontStyleRenderer = fontStyleRenderer;
        this.fontColorRenderer = fontColorRenderer;
        this.fontWeightRenderer = fontWeightRenderer;
    }

    void render(String text) {
        String renderedText = applyRendering(text, fontStyleRenderer, fontColorRenderer, fontWeightRenderer);

        System.out.println(renderedText);
    }

    private String applyRendering(String text, Renderer... renderers) {
        for (Renderer renderer : renderers) {
            text = renderer.render(text);
        }
        return text;
    }

    static class TextRendererBuilder {
        private FontStyleRenderer fontStyleRenderer = new DefaultFontStyleRenderer();
        private FontColorRenderer fontColorRenderer = new DefaultColorRenderer();
        private FontWeightRenderer fontWeightRenderer = new DefaultFontWeightRenderer();

        public TextRendererBuilder withFontStyleRenderer(FontStyleRenderer fontStyleRenderer) {
            this.fontStyleRenderer = fontStyleRenderer;
            return this;
        }

        public TextRendererBuilder withFontColorRenderer(FontColorRenderer fontColorRenderer) {
            this.fontColorRenderer = fontColorRenderer;
            return this;
        }

        public TextRendererBuilder withFontWeightRenderer(FontWeightRenderer fontWeightRenderer) {
            this.fontWeightRenderer = fontWeightRenderer;
            return this;
        }

        public TextRenderer build() {
            return new TextRenderer(fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
        }
    }
}
