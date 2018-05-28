package pl.ttpsc.factory.xml;

import pl.ttpsc.factory.AbstractDocumentFactory;

public class XmlDocumentFactory extends AbstractDocumentFactory {
    @Override
    public XmlPage createPage() {
        return new XmlPage();
    }

    @Override
    public XmlTable createTable() {
        return new XmlTable();
    }
}
