package spring.bean.definition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("BeanDefinition.xml");
      //SIMPLE APPLICATION CONTEXT
      
      //getting bean class from contextcontext.getBean(beanname) and cast it to class

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      //implementing method on bean class
      obj.getMessage();
   }
}