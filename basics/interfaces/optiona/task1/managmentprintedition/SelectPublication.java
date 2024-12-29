package basics.impl.optiona.task1.managmentprintedition;

import basics.impl.optiona.task1.book.Book;
import basics.impl.optiona.task1.magazine.Magazine;
import basics.impl.optiona.task1.printingedition.PrintingEdition;
import basics.impl.optiona.task1.printingedition.TypePublication;
import basics.impl.optiona.task1.tutorial.Tutorial;

import java.util.Scanner;

public class SelectPublication {
    private PrintingEdition printingEdition;
    private final Scanner scanner;
    private String answer;
    private final int SIZE_LETTERS = 10;

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
        if (printingEdition.isIssueAContract()) {
            selectPublication();
            selectEditPublication();
            selectTypeset();
            selectSendToPrint();
            selectCancelOfPublication();
            selectPayByPublication();
            selectResumePublication();
            selectClosePublication();

        }



    }

    private void selectIssueAContract() {
        System.out.println("Вы хотите оформить договор?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.setIssueAContract(true);
        } else {
            exit();
        }
    }

    private void selectPublication() {
        System.out.println("Хотите ли открыть издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.open();
        } else {
            exit();
        }

    }

    private void selectEditPublication(){
        System.out.println("Хотите редактировать издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.edit();
        }else {
            exit();
        }
    }

    private void selectTypeset() {
        System.out.println("Хотите ли верстать издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.typeset(SIZE_LETTERS);
        }else {
            exit();
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
        } else {
            exit();
        }
    }

    private void selectPayByPublication() {
        System.out.println("Хотите ли оплатить издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.payPublication();
        } else {
            exit();
        }
    }

    private void selectResumePublication() {
        System.out.println("Хотите ли возобновить издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.resume();
        } else {
            exit();
        }
    }

    private void selectClosePublication(){
        System.out.println("Хотите ли закрыть издание?");
        System.out.println("введите да или нет");

        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            printingEdition.closePublication();
            exit();
        }

    }
    private void exit(){
        scanner.close();
        System.exit(0);
    }

}

