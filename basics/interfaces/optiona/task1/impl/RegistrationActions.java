package basics.impl.optiona.task1.impl;

import basics.impl.optiona.task1.printingedition.PrintingEdition;

public interface RegistrationActions {
    boolean isIssueAContract();
    void open();
    void edit();
    void typeset(int size);
    void sendToPrint();


}
