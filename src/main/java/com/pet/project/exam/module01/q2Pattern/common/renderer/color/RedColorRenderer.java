package com.pet.project.exam.module01.q2Pattern.common.renderer.color;

public class RedColorRenderer implements FontColorRenderer {
    @Override
    public String render(String text) {
        return "<red-color>" + text + "</red-color>";
    }
}
