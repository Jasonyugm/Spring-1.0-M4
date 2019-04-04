import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by J.K.Yu on 4/2/2019.
 */
public class T {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.getBean("dataSource");
    }
}
