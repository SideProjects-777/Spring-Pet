package com.pet.project.exam.module01.q2Pattern.common.renderer.style;

public class DefaultFontStyleRenderer implements FontStyleRenderer {
    @Override
    public String render(String text) {
        return "<default-style>" + text + "</default-style>";
    }
}
