package com.nearsoft.pair;

import com.nearsoft.pair.visitor.Visitor;

public abstract class DocumentPart {
    private String text;

    public DocumentPart(String text) {
        this.text = text;
    }

    public abstract void accept(Visitor visitor);


    public String getText() {
        return text;
    }
}
