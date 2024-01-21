package test.spring.core;

import test.spring.core.interfaces.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "nothing else meter";
    }
}
