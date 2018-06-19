package com.czz;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"helloMessage.xml"}
        );

        Person person = (Person) context.getBean("Person");
        System.out.println(person.sayHello());

    }
}
