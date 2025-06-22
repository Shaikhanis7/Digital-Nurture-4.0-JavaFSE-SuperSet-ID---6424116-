package Design_Patterns_and_Principles.FactoryMethodPattern.factories;

import Design_Patterns_and_Principles.FactoryMethodPattern.documents.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}