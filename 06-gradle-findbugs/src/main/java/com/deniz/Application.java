package com.deniz;

/**
 * Created by Coşkun on 6.2.2017.
 */
public class Application {

    public static void main(String[] args) {
        //Sen göremezsin ama findbug yakalar hacı ;)
        forAlwaysTrue();
        System.out.println("Türkiye");
    }

    private static void forAlwaysTrue() {
        Object value = Double.valueOf(1.0);
        System.out.println("   - " + (value instanceof Double));
    }

}
