package Strategy;

public class LowResolution implements ResolutionStrategy {
    @Override
    public void setResolution() {
        System.out.println("Setting video resolution to Low");
    }
}