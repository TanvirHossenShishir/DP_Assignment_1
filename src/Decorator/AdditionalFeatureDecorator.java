package Decorator;

public abstract class AdditionalFeatureDecorator implements AdditionalFeature {
    protected AdditionalFeature additionalFeature;

    public AdditionalFeatureDecorator(AdditionalFeature additionalFeature) {
        this.additionalFeature = additionalFeature;
    }

    @Override
    public void display() {
        additionalFeature.display();
    }
}