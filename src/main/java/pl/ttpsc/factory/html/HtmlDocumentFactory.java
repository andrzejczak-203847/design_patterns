package pl.ttpsc.factory.html;

import pl.ttpsc.factory.AbstractDocumentFactory;

public class HtmlDocumentFactory extends AbstractDocumentFactory {
    @Override
    public HtmlPage createPage() {
        return new HtmlPage();
    }

    @Override
    public HtmlTable createTable() {
        return new HtmlTable();
    }
}
