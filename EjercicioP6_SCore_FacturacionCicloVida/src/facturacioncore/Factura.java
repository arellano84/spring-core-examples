package facturacioncore;

import java.util.Date;

public class Factura {

	private Cliente cliente;
	private double importe;
	private Date fecha;
	
	private Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(Cliente cliente, double importe, Date fecha) {
        this.cliente = cliente;
        this.importe = importe;
        this.fecha = fecha;
        
    }
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
    public String toString() {
        return "Factura{" + " cliente=" + cliente + " importe=" + importe + " fecha=" + fecha + '}';
    }
	
	
	public void iniciar() {
		System.out.println("Inicializa Factura");
	}
	
	public void destruir() {
		System.out.println("Termina Factura");
	}
}
