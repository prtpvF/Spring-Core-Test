package test.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.spring.core.interfaces.Music;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicBean", MusicPlayer.class);

        musicPlayer.playMusic();

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
