package basics.interfaces.optiona.task1.printingedition;

import basics.interfaces.optiona.task1.interfaces.Manageable;


import java.util.Scanner;

public abstract class PrintingEdition implements Manageable {
    protected String name;
    protected int numberOfPages;
    protected TypePublication typePublication;

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

    @Override
    public abstract void issueAContract();

    @Override
    public abstract void open();

    @Override
    public abstract void edit();

    @Override
    public abstract void typeset();

    @Override
    public abstract void sendToPrint();

    @Override
    public abstract void cancelThePublication();

    @Override
    public abstract void payPublication();

    @Override
    public abstract void resume();

    @Override
    public abstract void closePublication();

    @Override
    public String toString() {
        return "PrintingEdition{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", typePublication=" + typePublication +
                '}';
    }
}
