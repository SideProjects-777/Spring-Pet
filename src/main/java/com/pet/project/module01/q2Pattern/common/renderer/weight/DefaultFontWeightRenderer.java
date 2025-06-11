package com.pet.project.module01.q2Pattern.common.renderer.weight;

public class DefaultFontWeightRenderer implements FontWeightRenderer {
    @Override
    public String render(String text) {
        return "<default-weight>" + text + "</default-weight>";
    }
}
