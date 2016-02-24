# spring-core-examples
Ejemplos de Spring Core.


EJERCICIO 1

Declarar un bean de la clase Saludo con una propiedad de tipo String que contenga un mensaje de bienvenida.
Recuperar el bean creado desde la clase Main y mostrar el mensaje de bienvenida.


EJERCICIO 2

Crear la clase Cliente con las propiedades: nombre, nif y dirección todas ellas de tipo String.
Crear la clase Factura con las propiedades: cliente de tipo Cliente, importe de tipo double y fecha de tipo Date.
Declarar varios beans de tipo Factura inyectando las propiedades de la siguiente forma:
	Haciendo referencia a sus propiedades
	A través del constructor:
		Por tipo de datos
		Por posición
		Por nombre
La propiedad fecha se debe inyectar con un bean interno.


EJERCICIO 3

Rehacer el ejercicio anterior utilizando un método en la clase Cliente de tipo factoría, esto es que me devuelva instancias de Cliente.


EJERCICIO 4

Crear la clase Colegio con una propiedad de tipo colección para sus alumnos. Rellenar esta propiedad con el nombre de los alumnos utilizando un List, Set, Map y Properties.
Recuperar los beans declarados y mostrar los alumnos por pantalla.


EJERCICIO 5

Modificar el ejercicio 1 para declarar dos beans, uno será de tipo Singleton y otro Prototype.
Recuperar los beans varias veces desde la clase principal y comprobar si son el mismo o diferentes utilizando el método equals y el operador ==.


EJERCICIO 6

Agregar métodos de ciclo de vida al ejercicio 2 y forzar la eliminación de estos en el método main.


EJERCICIO 7

Rehacer el ejercicio 2 generando un solo bean de Cliente y Factura e inyectando las propiedades con el espacio de nombres p.

