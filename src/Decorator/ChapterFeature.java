package Decorator;

public class ChapterFeature extends AdditionalFeatureDecorator {
    public ChapterFeature(AdditionalFeature additionalFeature) {
        super(additionalFeature);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Displaying chapters");
    }
}
