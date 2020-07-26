package org.example.behavioral;

interface Bird{
    public void fly();
    public void makeSound();
}

class Humming_Bird implements Bird{
    @Override
    public void fly() {
        System.out.println("Humming Bird is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirping....");
    }
}

interface Duck{
    public void squeak();
}

class PlasticDuck implements Duck{
    @Override
    public void squeak() {
        System.out.println("Squeakkkkkkuuuu....");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter(){

    }

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

public class Adapter{
    public static void main(String args[]){
        Humming_bird HB = new HB();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(HB);

        System.out.println("Humming Bird");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Duck");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}
