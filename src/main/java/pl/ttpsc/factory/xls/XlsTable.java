package pl.ttpsc.factory.xls;

import pl.ttpsc.factory.Table;

public class XlsTable extends Table {
    @Override
    public XlsTableCell createTableCell() {
        return new XlsTableCell();
    }
}
