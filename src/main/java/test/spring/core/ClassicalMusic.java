package test.spring.core;

import org.springframework.stereotype.Component;
import test.spring.core.interfaces.Music;

@Component
public class ClassicalMusic implements Music {


    @Override
    public String[] getSong() {
        String[] music = {"Moonlight Sonata", "Flight of the Bumblebee", "sonata no. 3"};
        return music;
    }

}
