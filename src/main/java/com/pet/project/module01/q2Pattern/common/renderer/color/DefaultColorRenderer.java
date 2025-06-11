package com.pet.project.module01.q2Pattern.common.renderer.color;

import com.pet.project.module01.q2Pattern.common.renderer.color.FontColorRenderer;

public class DefaultColorRenderer implements FontColorRenderer {
    @Override
    public String render(String text) {
        return "<default-color>" + text + "</default-color>";
    }
}
