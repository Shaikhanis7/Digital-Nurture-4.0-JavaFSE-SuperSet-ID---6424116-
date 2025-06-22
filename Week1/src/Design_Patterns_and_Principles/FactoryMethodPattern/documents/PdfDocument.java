package Design_Patterns_and_Principles.FactoryMethodPattern.documents;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
