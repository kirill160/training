package basics.interfaces.optiona.task1.managmentprintedition;

import basics.interfaces.optiona.task1.book.Book;
import basics.interfaces.optiona.task1.magazine.Magazine;
import basics.interfaces.optiona.task1.printingedition.PrintingEdition;
import basics.interfaces.optiona.task1.printingedition.TypePublication;
import basics.interfaces.optiona.task1.tutorial.Tutorial;

import java.util.Scanner;

public class SelectPublication {
    private PrintingEdition printingEdition;
    private final Scanner scanner;
    private String answer;

    public SelectPublication(TypePublication typePublication) {
        this.printingEdition = selectTypePublication(typePublication);
        this.scanner = new Scanner(System.in);
    }

    private PrintingEdition selectTypePublication(TypePublication typePublication) {
        printingEdition = null;
        switch (typePublication) {
            case BOOK -> printingEdition = new Book("Букварь", 125, TypePublication.BOOK);
            case MAGAZINE -> printingEdition = new Magazine("сад и огород", 225, TypePublication.MAGAZINE);
            case TUTORIAL -> printingEdition = new Tutorial("самоучитель по джава", 1250, TypePublication.TUTORIAL);
        }
        return printingEdition;
    }

    public void show() {
        selectIssueAContract();
        selectPublication();
        selectTypeset();
        selectSendToPrint();
        selectCancelOfPublication();
        selectPayByPublication();
        selectResumePublication();
        selectClosePublication();



    }

    private void selectIssueAContract() {
        System.out.println("Вы хотите оформить договор?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.issueAContract();
        } else {
            scanner.close();
            System.exit(0);
        }
    }

    private void selectPublication() {
        System.out.println("Хотите ли открыть издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.open();
        }
        System.out.println("Хотите редактировать издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.edit();
        }
    }

    private void selectTypeset() {
        System.out.println("Хотите ли верстать издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.typeset();
        }
    }

    private void selectSendToPrint() {
        System.out.println("Хотите ли отправить на печать?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.sendToPrint();
        }
    }

    private void selectCancelOfPublication() {
        System.out.println("Хотите ли отказаться от печати?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.cancelThePublication();
        }
    }

    private void selectPayByPublication() {
        System.out.println("Хотите ли оплатить издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.payPublication();
        }
    }

    private void selectResumePublication() {
        System.out.println("Хотите ли возобновить издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.resume();
        }
    }

    private void selectClosePublication(){
        System.out.println("Хотите ли закрыть издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.closePublication();
            scanner.close();
        }
    }

}

