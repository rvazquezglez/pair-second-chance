package com.nearsoft.workshop.visitor;

import com.nearsoft.workshop.*;
import com.nearsoft.workshop.visitor.html.HtmlVisitor;
import com.nearsoft.workshop.visitor.latex.LatexVisitor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class VisitorTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    Document document;

    @Before
    public void setUp() throws Exception {
        document = new Document();
        document.addPart(new BoldText("This text is in bold"));
        document.addPart(new Hiperlink("This goes to google", "http://google.com"));
        document.addPart(new PlainText("plain text"));

    }

    @Test
    public void testHtmlVisitor() throws Exception {
        Visitor visitor = new HtmlVisitor();

        document.accept(visitor);
        String result = visitor.getOutput();

        log.info(result);

        assertThat(result, is("<html><body>" +
                "<b>This text is in bold</b>" +
                "<a href=\"http://google.com\">This goes to google</a>" +
                "plain text" +
                "</body></html>"));
    }

    @Test
    public void testLatexVisitor() throws Exception {
        Visitor visitor = new LatexVisitor();

        document.accept(visitor);
        String result = visitor.getOutput();

        log.info(result);

        assertThat(result, is("\\textbf{This text is in bold}" +
                "\\href={http://google.com}" +
                "{This goes to google}" +
                "plain text"));
    }
}