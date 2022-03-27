package lod.design.patterns.services.factory;

public class AnimalFactory implements Factory<Animal>{
    @Override
    public Animal createAnimal(AnimalType animalType) {
        switch (animalType) {
            case DOG:
                return new Dog(AnimalType.DOG);
            case DUCK:
                return new Duck();
            default:
                throw new UnsupportedOperationException("Animal Type not supported");
        }
    }
}
