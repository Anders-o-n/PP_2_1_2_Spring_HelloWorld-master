import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Is type 1 equal to type 2? " +  ( bean == bean1));

        Cat cat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());
        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Is cat  equal to cat 1? " +  ( cat == cat1));

    }
}