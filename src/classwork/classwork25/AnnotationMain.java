package classwork.classwork25;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {
    public void someMethod(){

    }
    @ExampleAnnotation
    public void myMethod() {
        System.out.println("hello");
    }


    public static void main(String[] args) throws NoSuchMethodException {
        //AnnotationMain.class.
        AnnotationMain annotationMain = new AnnotationMain();
        Method[] declaredMethods = annotationMain.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method name is: " + declaredMethod.getName());
            Annotation[] annotations = declaredMethod.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof ExampleAnnotation) {
                    System.out.println("our example annotation is present");
                }
                System.out.println(annotation);
            }
        }

    }
}
