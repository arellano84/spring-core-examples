package facturacioncore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Crear el contenedor de beans
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("facturacion.xml");

//        Cliente beanCliente= (Cliente) contenedor.getBean("beanCliente");
//        System.out.println(beanCliente);
        
        Factura factura = (Factura) contenedor.getBean("beanFacturaPropiedades");
        System.out.println(factura);
        factura = (Factura) contenedor.getBean("beanFacturaPosicion");
        System.out.println(factura);
        factura = (Factura) contenedor.getBean("beanFacturaNombre");
        System.out.println(factura);
        factura = (Factura) contenedor.getBean("beanFacturaNombre");
        System.out.println(factura);
        
	}

}
