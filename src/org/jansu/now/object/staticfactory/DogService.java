package org.jansu.now.object.staticfactory;

public class DogService implements Service{

    @Override
    public void makeProduct() {
        System.out.println("I make dog.");
    }
}
