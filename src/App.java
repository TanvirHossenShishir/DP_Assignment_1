import Decorator.AdditionalFeature;
import Decorator.BasicFeature;
import Decorator.ChapterFeature;
import Decorator.SubtitleFeature;

import Factory.AnimationFactory;
import Factory.MovieFactory;
import Factory.TVShowFactory;
import Factory.Video;
import Factory.VideoFactory;

import Strategy.HighResolution;
import Strategy.LowResolution;
import Strategy.MediumResolution;
import Strategy.VideoPlayer;

public class App {
    public static void main(String[] args) throws Exception {

        // Factory Pattern Usage
        VideoFactory movieFactory = new MovieFactory();
        Video movie = movieFactory.createVideo();
        movie.play();

        VideoFactory tvshowFactory = new TVShowFactory();
        Video tvshow = tvshowFactory.createVideo();
        tvshow.play();

        VideoFactory animationFactory = new AnimationFactory();
        Video animation = animationFactory.createVideo();
        animation.play();
        System.out.println("\n");


        // Strategy Pattern Usage
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.setResolutionStrategy(new LowResolution());
        videoPlayer.changeResolution();

        videoPlayer.setResolutionStrategy(new MediumResolution());
        videoPlayer.changeResolution();

        videoPlayer.setResolutionStrategy(new HighResolution());
        videoPlayer.changeResolution();
        System.out.println("\n");


        // Decorator Pattern Usage
        AdditionalFeature basicFeature = new BasicFeature();
        basicFeature.display(); // Basic

        AdditionalFeature chapter = new ChapterFeature(basicFeature);
        chapter.display(); // Basic + Chapter

        AdditionalFeature subtitle = new SubtitleFeature(chapter);
        subtitle.display(); // Basic + Chapter + Subtitle
        
    }
}
