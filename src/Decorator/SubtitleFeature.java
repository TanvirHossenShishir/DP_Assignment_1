package Decorator;

public class SubtitleFeature extends AdditionalFeatureDecorator {
    public SubtitleFeature(AdditionalFeature additionalFeature) {
        super(additionalFeature);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Displaying subtitles");
    }
}
