package test.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.core.interfaces.Music;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
       // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        musicPlayer.playMusic();
//        secondMusicPlayer.playMusic();
       // boolean comparison = musicPlayer==secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(musicPlayer);
//        System.out.println(secondMusicPlayer);
//        musicPlayer.setVolume(0);

        //System.out.println(musicPlayer.getVolume());
        //System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
