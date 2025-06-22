package Design_Patterns_and_Principles.FactoryMethodPattern.factories;

import Design_Patterns_and_Principles.FactoryMethodPattern.documents.Document;
import Design_Patterns_and_Principles.FactoryMethodPattern.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}