package test.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.core.interfaces.Music;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//           musicPlayer.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(TypeOfMusic.CLASSICAL);
        musicPlayer.playMusic(TypeOfMusic.ROCK);


        context.close();
    }
}
