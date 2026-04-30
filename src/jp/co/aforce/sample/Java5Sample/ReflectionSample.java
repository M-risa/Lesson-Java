package jp.co.aforce.sample.Java5Sample;

import java.lang.reflect.Method;

public class ReflectionSample {
	public static void main(String[] args) {
        try {
        	Class<Sample> clazz = Sample.class;

            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("Sampleクラスのメソッド一覧:");
            for (Method m : methods) {

                System.out.println("・" + m.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
