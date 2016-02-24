package facturacioncore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Crear el contenedor de beans
		AbstractApplicationContext contenedor =
                new ClassPathXmlApplicationContext("facturacion.xml");

        Factura factura1 = (Factura) contenedor.getBean("beanFacturaPropiedades");
        Factura factura2 = (Factura) contenedor.getBean("beanFacturaTipo");
        Factura factura3 = (Factura) contenedor.getBean("beanFacturaPosicion");
        Factura factura4 = (Factura) contenedor.getBean("beanFacturaNombre");
        
        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);
        System.out.println(factura4);
        
        contenedor.registerShutdownHook();
	}

}
