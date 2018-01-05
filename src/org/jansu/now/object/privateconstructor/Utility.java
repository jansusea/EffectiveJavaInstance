package org.jansu.now.object.privateconstructor;

public class Utility {

    private Utility(){
        // 子类没有可访问的超类构造器可调用了
        throw new AssertionError();
    }
}
