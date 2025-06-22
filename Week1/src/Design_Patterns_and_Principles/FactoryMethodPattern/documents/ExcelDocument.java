package Design_Patterns_and_Principles.FactoryMethodPattern.documents;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
}
