package org.ioc;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext ap1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        System.out.println("----------------独立演示----------------");
        System.out.println("--------构造方法注入示例--------");
        MockBusinessObject1 ml1 = (MockBusinessObject1) ap1.getBean("mockBO1");
        System.out.println("type属性: " + ml1);
        MockBusinessObject2 ml2 = (MockBusinessObject2) ap1.getBean("mockBO2");
        System.out.println("index属性: " + ml2);

        System.out.println("--------set方法注入示例--------");
        MockBusinessObject3 ml3 = (MockBusinessObject3) ap1.getBean("mockBO3");
        System.out.println(ml3);


        System.out.println("\n----------------合并演示----------------");
        MockBusinessObject4 ml4 = (MockBusinessObject4) ap1.getBean("mockBO4");
        System.out.println(ml4);

    }
}


class MockBusinessObject4 {
    private final String dependency4_1;
    private String dependency4_2;

    public MockBusinessObject4(String dependency) {
        this.dependency4_1 = dependency;
    }

    public void setDependency4(String dependency4) {
        this.dependency4_2 = dependency4;
    }

    @Override
    public String toString() {
        return "MockBusinessObject4{" +
                "dependency4_1='" + dependency4_1 + '\'' +
                ", dependency4_2='" + dependency4_2 + '\'' +
                '}';
    }
}

class MockBusinessObject3 {
    private String dependency3;

    public void setDependency3(String dependency3) {
        this.dependency3 = dependency3;
    }

    @Override
    public String toString() {
        return "MockBusinessObject3{" +
                "dependency3='" + dependency3 + '\'' +
                '}';
    }
}

class MockBusinessObject2 {
    private final String dependency1;
    private final String dependency2;

    public MockBusinessObject2(String dependency1, String dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("dependency1", dependency1)
                .append("dependency2", dependency2).toString();
    }
}


class MockBusinessObject1 {
    private String dependency1;
    private int dependency2;


    public MockBusinessObject1(String dependency) {
        this.dependency1 = dependency;
    }

    public MockBusinessObject1(int dependency) {
        this.dependency2 = dependency;
    }


    public String toString() {
        return new ToStringBuilder(this)
                .append("dependency1", dependency1)
                .append("dependency2", dependency2).toString();
    }
}
