package main.java;

public class User {
    private String name;
    private boolean enabled;
    private String neptunkod;

    public User(String name, boolean enabled, String neptunkod) {
        this.name = name;
        this.enabled = enabled;
        this.neptunkod = neptunkod;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getNeptunkod() {
        return neptunkod;
    }
}
