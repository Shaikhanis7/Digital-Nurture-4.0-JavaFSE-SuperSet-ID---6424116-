package Design_Patterns_and_Principles.FactoryMethodPattern;


import Design_Patterns_and_Principles.FactoryMethodPattern.documents.Document;
import Design_Patterns_and_Principles.FactoryMethodPattern.factories.DocumentFactory;
import Design_Patterns_and_Principles.FactoryMethodPattern.factories.ExcelDocumentFactory;
import Design_Patterns_and_Principles.FactoryMethodPattern.factories.PdfDocumentFactory;
import Design_Patterns_and_Principles.FactoryMethodPattern.factories.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
