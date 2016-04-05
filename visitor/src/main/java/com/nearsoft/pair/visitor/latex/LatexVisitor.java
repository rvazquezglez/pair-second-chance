package com.nearsoft.pair.visitor.latex;

import com.nearsoft.pair.BoldText;
import com.nearsoft.pair.Hiperlink;
import com.nearsoft.pair.PlainText;
import com.nearsoft.pair.Visitor;

public class LatexVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "\\textbf{" + docPart.getText() + "}";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "\\href={" + docPart.getUrl() + "}{" + docPart.getText() + "}";
    }

    @Override
    public String getOutput() {
        return output;
    }
}
