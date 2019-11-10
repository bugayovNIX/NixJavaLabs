package com.nixsolutions.javalabs.lab02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainLab02 {

    public void getAnyMethod() {
        try {
            Method aMethod = Class.forName("com.nixsolutions.javalabs.lab02.FractionOps").getMethod("toStringValue");
            System.out.println(aMethod.invoke(new FractionOps()));
        } catch (ClassNotFoundException |
                 NoSuchMethodException  |
                 IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FractionNumberOperation anObl = new FractionOps();
        anObl = (FractionNumberOperation) anObl.add(new FractionOps(), new FractionOps());
        MainLab02 aMain = new MainLab02();
        aMain.getAnyMethod();
        System.out.println(anObl.toStringValue());
    }
}
