package anshul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		Restruant restruntobj= (Restruant)context.getBean("restruntbean");
		restruntobj.greetCustomer();
	}

}