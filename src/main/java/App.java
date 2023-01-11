import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld Secondbean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(Secondbean.getMessage());
        System.out.println(bean == Secondbean);

        Cat catBean = (Cat) applicationContext.getBean("cat");
//        System.out.println(catBean.getName());

        Cat catBeanSecond = (Cat) applicationContext.getBean("cat");
//        System.out.println(catBeanSecond.getName());

        System.out.println(catBean == catBeanSecond);
    }
}