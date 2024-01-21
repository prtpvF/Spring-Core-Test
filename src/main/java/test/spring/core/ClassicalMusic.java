package test.spring.core;

import test.spring.core.interfaces.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "bohemian rhapsody";
    }
}
