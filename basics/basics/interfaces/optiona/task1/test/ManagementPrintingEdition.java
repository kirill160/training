package basics.interfaces.optiona.task1.test;

import basics.interfaces.optiona.task1.managmentprintedition.SelectPublication;
import basics.interfaces.optiona.task1.printingedition.PrintingEdition;
import basics.interfaces.optiona.task1.printingedition.TypePublication;

public class ManagementPrintingEdition {
    public static void main(String[] args) {
        SelectPublication selectPublication = new SelectPublication(TypePublication.BOOK);
        selectPublication.show();

    }
}
