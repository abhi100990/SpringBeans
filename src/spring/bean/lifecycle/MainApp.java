package spring.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {

	   //AbstractApplicationContext class object has been created because of need to gracefully shutdown application and to call destroy method at the end
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifecycle.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      HelloAbhishek obj2 = (HelloAbhishek) context.getBean("helloAbhishekInterface");
      obj2.getMessage();
      
      //register shutdown hook to call destroy method while shutdown in the end
      context.registerShutdownHook();
   }
}