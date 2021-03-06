package org.jansu.now.object.obsoleteref;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    // 数组是对全体保持对象引用的，自己管理内存在java中是需要谨慎注意的

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY =16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
//        return elements[--size];
    }

    private void ensureCapacity(){
        if(elements.length == size)
            elements = Arrays.copyOf(elements,2 * size + 1);
    }
}
