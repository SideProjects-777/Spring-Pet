package com.pet.project.exam.module01.q2Pattern.common.renderer.color;



public class DefaultColorRenderer implements FontColorRenderer {
    @Override
    public String render(String text) {
        return "<default-color>" + text + "</default-color>";
    }
}
