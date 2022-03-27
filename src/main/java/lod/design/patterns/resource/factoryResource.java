package lod.design.patterns.resource;

import lod.design.patterns.services.factory.Animal;
import lod.design.patterns.services.factory.AnimalFactory;
import lod.design.patterns.services.factory.AnimalType;
import lod.design.patterns.services.factory.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adopt")
public class factoryResource {

    private Animal animal;

    @GetMapping(value = "/{type}/{name}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Animal adoptAnimal(@PathVariable String type, @PathVariable String name) {
        animal = new AnimalFactory()
                .createAnimal(AnimalType.valueOf(type.toUpperCase()));
        animal.name(name);
        animal.color("White");
        return animal;
    }
}
