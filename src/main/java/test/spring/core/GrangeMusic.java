package test.spring.core;

import test.spring.core.interfaces.Music;

public class GrangeMusic implements Music {
    @Override
    public String getSong() {
        return "nirvana - smells like a teen spirit";
    }
}
