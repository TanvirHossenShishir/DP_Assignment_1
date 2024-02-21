package Strategy;

public class VideoPlayer {
    private ResolutionStrategy resolutionStrategy;

    public void setResolutionStrategy(ResolutionStrategy resolutionStrategy) {
        this.resolutionStrategy = resolutionStrategy;
    }

    public void changeResolution() {
        if (resolutionStrategy != null) {
            resolutionStrategy.setResolution();
        } else {
            System.out.println("Resolution strategy is not set.");
        }
    }
}