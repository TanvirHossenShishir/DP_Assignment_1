package Strategy;

public class MediumResolution implements ResolutionStrategy {
    @Override
    public void setResolution() {
        System.out.println("Setting video resolution to Medium");
    }
}