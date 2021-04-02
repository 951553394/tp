package seedu.easylog.commands.itemscommands;

import seedu.easylog.parser.ItemsParser;
import seedu.easylog.ui.Ui;

/**
 * ItemsCommand class constructor.
 */
public abstract class ItemsCommand {

    public Ui ui = new Ui();
    public ItemsParser itemsParser = new ItemsParser();
}
