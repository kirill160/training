package basics.impl.optiona.task1.printingedition;

import basics.impl.optiona.task1.impl.Publication;
import basics.impl.optiona.task1.impl.RegistrationActions;

public abstract class PrintingEdition implements Publication, RegistrationActions {
    protected String name;
    protected int numberOfPages;
    protected TypePublication typePublication;
    protected boolean isIssueAContract;

    public PrintingEdition(String name, int numberOfPages, TypePublication typePublication) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.typePublication = typePublication;

    }

    public PrintingEdition() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public TypePublication getTypePublication() {
        return typePublication;
    }

    public void setTypePublication(TypePublication typePublication) {
        this.typePublication = typePublication;
    }



    public void setIssueAContract(boolean issueAContract) {
        isIssueAContract = issueAContract;
    }

    public boolean getIssueAContract(){
        return isIssueAContract;
    }


    @Override
    public void cancelThePublication() {

    }

    @Override
    public void payPublication() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void closePublication() {

    }

    @Override
    public abstract boolean isIssueAContract();

    @Override
    public void open() {

    }

    @Override
    public void edit(){

    }

    @Override
    public abstract void typeset(int size);


    @Override
    public void sendToPrint() {

    }

    @Override
    public String toString() {
        return "PrintingEdition{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", typePublication=" + typePublication +
                '}';
    }
}
