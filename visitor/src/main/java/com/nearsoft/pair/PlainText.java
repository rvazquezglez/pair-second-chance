package com.nearsoft.pair;

import com.nearsoft.pair.visitor.Visitor;

public class PlainText extends DocumentPart {

    public PlainText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
