package pl.ttpsc.factory.html;

import pl.ttpsc.factory.Table;

public class HtmlTable extends Table {
    @Override
    public HtmlTableCell createTableCell() {
        return new HtmlTableCell();
    }
}
