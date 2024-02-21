package Factory;

public class Animation implements Video {
    @Override
    public void play() {
        System.out.println("Playing animation...");
    }
}