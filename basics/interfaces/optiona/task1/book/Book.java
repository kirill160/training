package basics.impl.optiona.task1.book;

import basics.impl.optiona.task1.printingedition.PrintingEdition;
import basics.impl.optiona.task1.printingedition.TypePublication;

public class Book extends PrintingEdition {
    public Book(String name, int numberOfPages, TypePublication typePublication) {
        super(name, numberOfPages, typePublication);
    }
    public Book(){

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getNumberOfPages() {
        return super.getNumberOfPages();
    }

    @Override
    public void setNumberOfPages(int numberOfPages) {
        super.setNumberOfPages(numberOfPages);
    }

    @Override
    public TypePublication getTypePublication() {
        return super.getTypePublication();
    }

    @Override
    public void setTypePublication(TypePublication typePublication) {
        super.setTypePublication(typePublication);
    }

    @Override
    public void setIssueAContract(boolean issueAContract) {
        super.setIssueAContract(issueAContract);
    }

    @Override
    public boolean getIssueAContract() {
        return super.getIssueAContract();
    }

    @Override
    public void typeset(int size) {
        System.out.println("издание " + this + " улучшено на размер " + size);
    }

    @Override
    public boolean isIssueAContract() {
        if(getIssueAContract()){
            System.out.println("договор " + this + " оформлен");
            return true;
        }
        System.out.println("договор " + this + " не оформлен");
        return false;
    }

    @Override
    public void open() {
        System.out.println("издание " + this + " открыто");
    }

    @Override
    public void edit() {
        System.out.println("издание " + this + " отредактировано");
    }

    @Override
    public void sendToPrint() {
        System.out.println("издание " + this + " напечатано");
    }

    @Override
    public void cancelThePublication() {
        System.out.println("издание " + this + "отменено к публикации");
    }

    @Override
    public void payPublication() {
        System.out.println("за издание " + this + " заплачено");
    }

    @Override
    public void resume() {
        System.out.println("издание " + this + " возобновлено");
    }

    @Override
    public void closePublication() {
        System.out.println("издание " + this + " закрыто");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", typePublication=" + typePublication +
                '}';
    }
}
