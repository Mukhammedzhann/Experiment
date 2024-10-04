package Practika.Practika_5;

import java.lang.reflect.Type;

interface IDocument{
    void open();
}
 class Report implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a Report doc.");
    }
}

 class Resume implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a Resume doc.");
    }
}

 class Letter implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a Letter doc.");
    }
}

interface DocumentCreator{
    IDocument CreateDocument();
}

class ReportCreator implements DocumentCreator{
    @Override
    public IDocument CreateDocument() {
        return new Report();
    }
}

class ResumeCreator implements DocumentCreator{
    @Override
    public IDocument CreateDocument() {
        return new Resume();
    }
}

class LetterCreator implements DocumentCreator{
    @Override
    public IDocument CreateDocument() {
        return new Letter();
    }
}

 class Invoice implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening an Invoice document.");
    }
}

class InvoiceCreator implements DocumentCreator {
    @Override
    public IDocument CreateDocument() {
        return new Invoice();
    }
}


enum DocType {
    REPORT, RESUME, LETTER, INVOICE
}

class Program {
    public static IDocument getDocument(DocType type) {
        DocumentCreator creator = null;
        switch (type) {
            case REPORT:
                creator = new ReportCreator();
                break;
            case RESUME:
                creator = new ResumeCreator();
                break;
            case LETTER:
                creator = new LetterCreator();
                break;
            case INVOICE:
                creator = new InvoiceCreator();
                break;
            default:
                throw new IllegalArgumentException("Invalid document type");
        }
        return creator.CreateDocument();
    }

    public static void main(String[] args) {
        IDocument reportDoc = getDocument(DocType.REPORT);
        reportDoc.open();

        IDocument resumeDoc = getDocument(DocType.RESUME);
        resumeDoc.open();

        IDocument letterDoc = getDocument(DocType.LETTER);
        letterDoc.open();

        IDocument invoiceDoc = getDocument(DocType.INVOICE);
        invoiceDoc.open();
    }

}

