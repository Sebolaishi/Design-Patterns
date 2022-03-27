package lod.design.patterns.services.factory;

public class Duck implements Animal {

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public String color(String color) {
        return color;
    }
}
