package lod.design.patterns.services.factory;

public interface Factory<T> {
    T createAnimal(AnimalType animalType);
}
