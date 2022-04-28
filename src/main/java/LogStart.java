import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogStart implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我是中介,带你看房");

    }
}
