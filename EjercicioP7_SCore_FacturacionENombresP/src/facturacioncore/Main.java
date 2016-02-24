package facturacioncore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Crear el contenedor de beans
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("facturacion.xml");
        
        Factura factura4 = (Factura) contenedor.getBean("beanFacturaNombre");
        
        System.out.println(factura4);
        
	}

}
