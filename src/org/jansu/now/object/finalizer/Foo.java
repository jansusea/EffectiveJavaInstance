package org.jansu.now.object.finalizer;

import java.io.FileInputStream;

public class Foo {

    // finalize 方法需要避免使用，因为jvm在执行这类方法时会延迟执行，你不知道哪个线程会来执行这个方法，时间上
    // 是没有保证的。一般的用途主要为保护网，如FileInputStream\FileOutputStream以及Timer和Connection等需要close的方法，
    // 如果用户忘记关闭了，那么
    // 这个类会有一个finalize的终结方法，这个过程中会执行close方法。另外注意子类继承父类的时候，应该调用父类的终结方法
    private final Object finalizerGuardian = new Object(){
        @Override
        protected void finalize() throws Throwable {
            super.finalize();


        }
    };
}
