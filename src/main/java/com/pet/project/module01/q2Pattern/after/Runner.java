package com.pet.project.module01.q2Pattern.after;

import com.pet.project.module01.q2Pattern.common.renderer.color.RedColorRenderer;
import com.pet.project.module01.q2Pattern.common.renderer.weight.BoldFontWeightRenderer;
import com.pet.project.module01.q2Pattern.after.TextRenderer.TextRendererBuilder;

public class Runner {
    public static void main(String... args) {
        TextRenderer textRenderer = new TextRendererBuilder().build();
        textRenderer.render("Default Rendering");

        TextRenderer redRenderer = new TextRendererBuilder()
                .withFontColorRenderer(new RedColorRenderer())
                .build();
        redRenderer.render("Red Color Rendering");

        TextRenderer boldRenderer = new TextRendererBuilder()
                .withFontWeightRenderer(new BoldFontWeightRenderer())
                .build();
        boldRenderer.render("Bold Rendering");
    }
}
