import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SimpleProfiler {
    @Before("execution(* DefaultPersonService.*(..)) && args(name)")
    public void profile(String name) throws Throwable {
        System.out.println("profile");
    }
}