package org.jansu.now.object.singleton;

public class TwoElvis {

    private static final TwoElvis INSTANCE = new TwoElvis();

    private TwoElvis(){}

    public static TwoElvis getINSTANCE() {
        return INSTANCE;
    }
}
