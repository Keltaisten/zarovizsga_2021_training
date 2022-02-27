package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public void feedAll(){
        dogs.forEach(Dog::feed);
    }

    public Dog findByName(String name){
        return dogs.stream().filter(d->d.getName().equals(name)).findFirst().orElseThrow(()-> new IllegalArgumentException("Cannot find dog"));
    }

    public void playWith(String name, int hours){
        findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness){
        return dogs.stream().filter(d->d.happiness > minHappiness).map(Dog::getName).toList();
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
