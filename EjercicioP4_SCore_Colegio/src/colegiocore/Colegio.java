package colegiocore;

import java.util.Collection;
import java.util.Map;

public class Colegio {
	
	private Collection<Alumnos> alumnos;
	private Map<String,Alumnos> alumnos2;
	public Map<String, String> alumnos3;
	
	
	public Collection<Alumnos> getAlumnos() {
		return alumnos;
	}




	public void setAlumnos(Collection<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}




	public Map<String, Alumnos> getAlumnos2() {
		return alumnos2;
	}




	public void setAlumnos2(Map<String, Alumnos> alumnos2) {
		this.alumnos2 = alumnos2;
	}




	public Map<String, String> getAlumnos3() {
		return alumnos3;
	}




	public void setAlumnos3(Map<String, String> alumnos3) {
		this.alumnos3 = alumnos3;
	}




	@Override
    public String toString() {
        return "Colegio{" + " alumnos=" + alumnos + " alumnos2=" + alumnos2 + " alumnos=" + alumnos + '}';
    }
	
}
