package test.spring.core;

import org.springframework.stereotype.Component;
import test.spring.core.interfaces.Music;

@Component
public class RockMusic implements Music {

    @Override
    public String[] getSong() {
         String[] music = {"smells like a teen spirit", "rape me", "auslender"};
        return music;
    }
}
