package Model;

public class Medicamentos {
	
	private long codigoBarra;
	private String nombre;
	private float precio;
	private boolean status;
	public Medicamentos(long codigoBarra, String nombre, float precio, boolean status) {
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		this.precio = precio;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Medicamentos [codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", precio=" + precio + ", status="
				+ status + "]\n";
	}
	public long getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
