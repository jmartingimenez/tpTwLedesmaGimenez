/*Esta clase tiene una relación 1-1 con Punto
 * 	(Una farmacia se encuentra en un punto y en un punto se encuentra solo una farmacia)
 * 
 * Esta clase tiene una relación 1-1 con Direccion
 * 	(Una farmacia se encuentra en una dirección y en una dirección solo hay una farmacia)
 * 
 * Los atributos correspondientes a las dos clases, estan aca*/

package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Farmacia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Punto geoLocalizacion;
	
	@OneToOne
	private Direccion direccion;
	
	String nombre;
	String telefono;
	String diaDeTurno;	

	public Farmacia(){}
	
	public Farmacia(Long id, String nombre, String telefono, String diaDeTurno){
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.diaDeTurno = diaDeTurno;
	}	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDiaDeTurno() {
		return diaDeTurno;
	}
	public void setDiaDeTurno(String diaDeTurno) {
		this.diaDeTurno = diaDeTurno;
	}

	public Punto getGeoLocalizacion() {
		return geoLocalizacion;
	}

	public void setGeoLocalizacion(Punto geoLocalizacion) {
		this.geoLocalizacion = geoLocalizacion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}	
}