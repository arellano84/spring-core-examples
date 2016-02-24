package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext contenedor = new ClassPathXmlApplicationContext("spring.xml");

		 Saludo saludo = (Saludo)contenedor.getBean("beanSaludoSingl");
		 Saludo saludo2 = (Saludo)contenedor.getBean("beanSaludoSingl");
		 
		 System.out.println("Singleton:"+(saludo==saludo2));
		 System.out.println("Singleton:"+(saludo.equals(saludo2)));
		 System.out.println("Prototype:"+(saludo.hashCode()));
		 System.out.println("Prototype:"+(saludo2.hashCode()));
		 
		 Saludo saludo3 = (Saludo)contenedor.getBean("beanSaludoProto");
		 Saludo saludo4 = (Saludo)contenedor.getBean("beanSaludoProto");
		 
		 System.out.println("Prototype:"+(saludo3==saludo4));
		 System.out.println("Prototype:"+(saludo3.equals(saludo4)));
		 System.out.println("Prototype:"+(saludo3.hashCode()));
		 System.out.println("Prototype:"+(saludo4.hashCode()));
		 
		 //saludo.getSaludo();
		
	}

}
