import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//房客、中介、房主
//具体实现类
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("beans.xml");

        HouseOwner ho = (HouseOwner) applicationContext.getBean("ho");
        ho.sell();

    }
}
