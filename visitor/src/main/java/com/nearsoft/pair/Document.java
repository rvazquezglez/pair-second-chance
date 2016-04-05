package com.nearsoft.pair;

import com.nearsoft.pair.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentPart> parts = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (DocumentPart part : parts) {
            part.accept(visitor);
        }
    }

    public void addPart(DocumentPart part) {
        parts.add(part);
    }
}
