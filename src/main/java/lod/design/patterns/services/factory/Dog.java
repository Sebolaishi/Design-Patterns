package lod.design.patterns.services.factory;

public class Dog implements Animal{

    public Dog(AnimalType type) {
        System.out.println(type);
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public String  color(String color) {
        return color;
    }
}


