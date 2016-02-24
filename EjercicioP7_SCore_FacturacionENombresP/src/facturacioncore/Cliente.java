package facturacioncore;

public class Cliente {

	private String nombre;
	private String nif;
	private String direccion;
	
	private Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
    public String toString() {
        return "Cliente{" + " nombre=" + nombre + " nif=" + nif +" direccion=" + direccion + '}';
    }
	
}
