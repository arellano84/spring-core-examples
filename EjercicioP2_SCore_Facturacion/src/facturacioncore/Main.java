package facturacioncore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Crear el contenedor de beans
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("facturacion.xml");

        Factura factura = (Factura) contenedor.getBean("beanFacturaPropiedades");
        Factura factura2 = (Factura) contenedor.getBean("beanFacturaTipo");
        Factura factura3 = (Factura) contenedor.getBean("beanFacturaPosicion");
        Factura factura4 = (Factura) contenedor.getBean("beanFacturaNombre");
        
        System.out.println(factura);
        System.out.println(factura2);
        System.out.println(factura3);
        System.out.println(factura4);
        
	}

}
