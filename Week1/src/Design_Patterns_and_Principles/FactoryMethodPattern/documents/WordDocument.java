package Design_Patterns_and_Principles.FactoryMethodPattern.documents;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}


