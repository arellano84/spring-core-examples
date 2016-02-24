package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext contenedor = new ClassPathXmlApplicationContext("spring.xml");

		 Saludo saludo = (Saludo)contenedor.getBean("beanSaludo");
		 saludo.getSaludo();
		
	}

}
