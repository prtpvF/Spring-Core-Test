package test.spring.core;

import org.springframework.stereotype.Component;
import test.spring.core.interfaces.Music;

@Component
public class GrangeMusic implements Music {

    @Override
    public String[] getSong() {
        return new String[0];
    }
}
