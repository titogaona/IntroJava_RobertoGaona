package py.edu.uaa.pooj.legislador;

public class Persona {

	public int cedulaIdentidad;
	public String nombre;
	public String partidoAlQuePertenece;
	
	
	
	public String getPartidoAlQuePertenece() {
		return partidoAlQuePertenece;
	}
	public void setPartidoAlQuePertenece(String partidoAlQuePertenece) {
		this.partidoAlQuePertenece = partidoAlQuePertenece;
	}
	public int getCedulaIdentidad() {
		return cedulaIdentidad;
	}
	public void setCedulaIdentidad(int cedulaIdentidad) {
		this.cedulaIdentidad = cedulaIdentidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
