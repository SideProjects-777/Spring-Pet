package com.pet.project.module01.q2Pattern.common.renderer.weight;

public class BoldFontWeightRenderer implements FontWeightRenderer {
    @Override
    public String render(String text) {
        return "<bold-weight>" + text + "</bold-weight>";
    }
}
