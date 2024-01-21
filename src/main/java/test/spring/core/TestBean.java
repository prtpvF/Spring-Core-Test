package test.spring.core;

import org.springframework.context.annotation.Bean;


public class TestBean {
    private String name;

    public TestBean() {
    }

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
