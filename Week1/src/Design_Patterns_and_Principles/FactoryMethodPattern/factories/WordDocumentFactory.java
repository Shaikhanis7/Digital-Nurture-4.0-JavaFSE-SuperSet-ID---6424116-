package Design_Patterns_and_Principles.FactoryMethodPattern.factories;

import Design_Patterns_and_Principles.FactoryMethodPattern.documents.Document;
import Design_Patterns_and_Principles.FactoryMethodPattern.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}