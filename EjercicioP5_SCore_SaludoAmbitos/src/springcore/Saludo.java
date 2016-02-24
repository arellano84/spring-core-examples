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
	
	
//	public void getSaludo() {
//		System.out.println(mensaje);
//	}
	
	@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Saludo other = (Saludo) obj;
        if ((this.mensaje == null) ? (other.mensaje != null) : !this.mensaje.equals(other.mensaje)) {
            return false;
        }
        return true;
    }
	
	 @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 61 * hash + (this.mensaje != null ? this.mensaje.hashCode() : 0);
	        return hash;
	    }
	

}
