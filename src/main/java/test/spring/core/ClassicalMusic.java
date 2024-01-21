package test.spring.core;

import test.spring.core.interfaces.Music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
    return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "bohemian rhapsody";
    }

    public void init() {
        System.out.println("doing my initialization");
    }

    public void destroy() {
        System.out.println("doing my destruction");
    }
}
