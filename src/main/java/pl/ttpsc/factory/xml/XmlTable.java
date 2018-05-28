package pl.ttpsc.factory.xml;

import pl.ttpsc.factory.Table;

public class XmlTable extends Table {
    @Override
    public XmlTableCell createTableCell() {
        return new XmlTableCell();
    }
}
