import com.traffic.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by pk4 on 10/24/17.
 */
public class TrafficMain {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:com/traffic/traffic.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.name);
        System.out.println(person.getCar().getModel());
        System.out.println(person.getStock());
    }
}
