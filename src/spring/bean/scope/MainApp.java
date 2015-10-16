package spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
	   singletonBeanScope();
	   prototypeBeanScope();
   }
   
   public static void singletonBeanScope()
   {
	   	ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");

	   	System.out.println("Using singleton scope for bean class : ");
	    HelloWorld objA = (HelloWorld) context.getBean("helloWorldSingle");
	
	    //here I have set message in bean class instance
	    objA.setMessage("I'm object A");
	    objA.getMessage();
	
	    //creating new object from bean class instance which will not create new instance instead uses the same instance
	    HelloWorld objB = (HelloWorld) context.getBean("helloWorldSingle");
	    objB.getMessage();
   }
   
   public static void prototypeBeanScope()
   {
	   	ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");

	   	//new object instance is created every time application tries to get bean class from xml beans
	   	System.out.println("Using prototype scope for bean class : ");
	    HelloWorld objA = (HelloWorld) context.getBean("helloWorldPrototype");
	
	    objA.setMessage("I'm object A");
	    objA.getMessage();
	
	    HelloWorld objB = (HelloWorld) context.getBean("helloWorldPrototype");
	    objB.getMessage();
   }
}