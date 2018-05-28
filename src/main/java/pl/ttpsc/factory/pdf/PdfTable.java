package pl.ttpsc.factory.pdf;

import pl.ttpsc.factory.Table;

public class PdfTable extends Table {
    @Override
    public PdfTableCell createTableCell() {
        return new PdfTableCell();
    }
}
