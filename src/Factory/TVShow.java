package Factory;

public class TVShow implements Video {
    @Override
    public void play() {
        System.out.println("Playing TV show...");
    }
}