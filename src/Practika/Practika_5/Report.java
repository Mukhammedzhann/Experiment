package Practika.Practika_5;

import java.lang.reflect.Type;

interface IDocument{
    void open();
}
public class Report implements IDocument {
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

enum DocType{
     Repurt, Resume, Letter
}
/*class Program{
public static IDocument GetDocument(DocType type){
    DocumentCreator creator = null;
    IDocument document = null;
    switch (type) {
        case DocType.Repurt:
            creator = new ReportCreator();
            break;
        case DocType.Resume:
            creator = new ResumeCreator();

        case DocType.Letter:
            creator = new LetterCreator();
            break;
    }

}
}*/
