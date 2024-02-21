package Factory;

public class AnimationFactory implements VideoFactory {
    @Override
    public Video createVideo() {
        System.out.println("Creating animation...");
        return new Animation();
    }
}