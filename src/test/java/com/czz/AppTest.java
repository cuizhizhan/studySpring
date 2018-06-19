package com.czz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1(){
        // 1 ApplicationContext 的方式
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "helloMessage.xml"
        );

//        Person person =  context.getBean("Person",Person.class);
//        HelloChina person =  context.getBean("HelloChina",HelloChina.class);

        //利用反射直接创建对象
        try{
            Class aClass =  Class.forName("com.czz.HelloChina");
            HelloChina person = (HelloChina) aClass.newInstance();
             System.out.println(person.sayHello());
        }catch (Exception e){
            System.out.println("error");
        }

    }
    @Test
    public void test2(){
        // 2 BeanFactory  依赖注入
        Resource cr = new ClassPathResource("helloMessage.xml");
        @SuppressWarnings("deprecation")
        BeanFactory bf = new XmlBeanFactory(cr);
        Person person = bf.getBean("Person", Person.class);
        System.out.println(person.sayHello());
    }
}
