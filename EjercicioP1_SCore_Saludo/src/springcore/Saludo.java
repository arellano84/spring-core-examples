package springcore;

public class Saludo {

	private String mensaje;
	
	
	private Saludo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	public void getSaludo() {
		System.out.println(mensaje);
	}
	

}
