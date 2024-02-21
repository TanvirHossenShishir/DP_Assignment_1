package Factory;

public class MovieFactory implements VideoFactory {
    @Override
    public Video createVideo() {
        System.out.println("Creating movie...");
        return new Movie();
    }
}
