package org.jansu.now.object.staticfactory;

public class DogProvider implements Provider{

    @Override
    public Service newService() {
        return new DogService();
    }

}
