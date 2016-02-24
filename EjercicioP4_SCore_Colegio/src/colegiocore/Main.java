package colegiocore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Crear el contenedor de beans
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("colegio.xml");

        Colegio colegio = (Colegio) contenedor.getBean("beanColegioList");
        System.out.println(colegio.getAlumnos());
        colegio = (Colegio) contenedor.getBean("beanColegioSet");
        System.out.println(colegio.getAlumnos());
        colegio = (Colegio) contenedor.getBean("beanColegioMap");
        System.out.println(colegio.getAlumnos2());
        colegio = (Colegio) contenedor.getBean("beanColegioProps");
        System.out.println(colegio.getAlumnos3());
         
	}

}
