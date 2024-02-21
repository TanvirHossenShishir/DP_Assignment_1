package Factory;

public class TVShowFactory implements VideoFactory {
    @Override
    public Video createVideo() {        
        System.out.println("Creating TV show...");
        return new TVShow();
    }
}