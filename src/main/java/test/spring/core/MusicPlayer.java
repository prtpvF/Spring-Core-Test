package test.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import test.spring.core.interfaces.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

  private ClassicalMusic music1;
  private RockMusic music2;

    @Autowired

    public MusicPlayer(@Qualifier ("classicalMusic") ClassicalMusic music1, @Qualifier ("rockMusic")RockMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(TypeOfMusic typeOfMusic) {
        if(typeOfMusic==TypeOfMusic.CLASSICAL) {
           String[] music = music1.getSong();
            Random random = new Random();
            String song = music[random.nextInt(0,3)];
            System.out.println(song);
        }
        else{
            String[] music = music2.getSong();
            Random random = new Random();
            String song = music[random.nextInt(0,3)];
            System.out.println(song);
        }
    }


}
