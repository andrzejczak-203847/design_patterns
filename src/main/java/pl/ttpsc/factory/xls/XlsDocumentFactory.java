package pl.ttpsc.factory.xls;

import pl.ttpsc.factory.AbstractDocumentFactory;

public class XlsDocumentFactory extends AbstractDocumentFactory {
    @Override
    public XlsPage createPage() {
        return new XlsPage();
    }

    @Override
    public XlsTable createTable() {
        return new XlsTable();
    }
}
