package com.pet.project.exam.module01.q2Pattern.common.renderer.style;

public class ItalicStyleRenderer implements FontStyleRenderer {
    @Override
    public String render(String text) {
        return "<italic-style>" + text + "</italic-style>";
    }
}
