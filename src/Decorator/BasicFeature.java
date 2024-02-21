package Decorator;

public class BasicFeature implements AdditionalFeature {
    @Override
    public void display() {
        System.out.println("Displaying base information");
    }
}