package colegiocore;

public class Alumnos {

	private String nombre;
	
	private Alumnos() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
    public String toString() {
        return "Alumnos{" + " nombre=" + nombre + '}';
    }
	
}
