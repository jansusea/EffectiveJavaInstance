package org.jansu.now.object.staticfactory;

public class Demo {

    public static void main(String[] args){
        Services.registerProvider("dog",new DogProvider());

        Service service = Services.newInstance("dog");
        service.makeProduct();
    }

}
