package com.nearsoft.pair.visitor.html;

import com.nearsoft.pair.BoldText;
import com.nearsoft.pair.Hiperlink;
import com.nearsoft.pair.PlainText;
import com.nearsoft.pair.Visitor;

public class HtmlVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "<b>" + docPart.getText() + "</b>";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "<a href=\"" + docPart.getUrl() + "\">" + docPart.getText() + "</a>";
    }

    public String getOutput() {
        return "<html><body>"+output+"</body></html>";
    }
}
