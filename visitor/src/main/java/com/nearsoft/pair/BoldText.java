package com.nearsoft.pair;

import com.nearsoft.pair.visitor.Visitor;

public class BoldText extends DocumentPart {

    public BoldText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}