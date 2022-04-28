import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot {

    public static void main(final String[] args) throws Exception {
        BeanFactory ctx = new ClassPathXmlApplicationContext("beans.xml");
        DefaultPersonService person = (DefaultPersonService) ctx.getBean("personService");
        person.getPerson("Pengo");
    }
}