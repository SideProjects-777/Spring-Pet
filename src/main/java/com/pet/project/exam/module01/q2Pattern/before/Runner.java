package com.pet.project.exam.module01.q2Pattern.before;


import com.pet.project.exam.module01.q2Pattern.common.renderer.color.DefaultColorRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.color.RedColorRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.style.DefaultFontStyleRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.weight.BoldFontWeightRenderer;
import com.pet.project.exam.module01.q2Pattern.common.renderer.weight.DefaultFontWeightRenderer;

public class Runner {
    public static void main(String... args) {
        TextRenderer textRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer());
        textRenderer.render("Default Rendering");

        TextRenderer redRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new RedColorRenderer(), new DefaultFontWeightRenderer());
        redRenderer.render("Red Color Rendering");

        TextRenderer boldRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new BoldFontWeightRenderer());
        boldRenderer.render("Bold Rendering");
    }
}
