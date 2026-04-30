package jp.co.aforce.sample.Java5Sample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation { // 他のファイルから見えるようにpublicにする
    String value() default "";
}

public class AnnotationSample {
	public static void main(String[] args) {
		try {
            // MyClass.javaが同じフォルダにあれば、自動的に認識されます
            Class<Myclass> clazz = Myclass.class;
            Method method = clazz.getDeclaredMethod("method1");
            
            MyAnnotation ann = method.getAnnotation(MyAnnotation.class);

            if (ann != null) {
                System.out.println("取得した値: " + ann.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	

}
