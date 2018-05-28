package pl.ttpsc.factory.pdf;

import pl.ttpsc.factory.AbstractDocumentFactory;

public class PdfDocumentFactory extends AbstractDocumentFactory {
    @Override
    public PdfPage createPage() {
        return new PdfPage();
    }

    @Override
    public PdfTable createTable() {
        return new PdfTable();
    }
}
