package Strategy;

public class HighResolution implements ResolutionStrategy {
    @Override
    public void setResolution() {
        System.out.println("Setting video resolution to High");
    }
}