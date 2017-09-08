/*Esta clase tiene una relaci�n 1-N con Barrio
 * 	(En un barrio hay muchas direcciones y una direcci�n pertenece a un barrio)
 * 
 * Esta clase tiene una relaci�n N-1 con Comuna
 * 	(Muchos barrios pertenecen a una comuna y en una comuna hay mucho barrios)
 * 	- ESTA RELACI�N ESTA COMO BIDIRECCIONAL -*/

package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Barrio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idComuna")
	private Comuna comuna;
	
	private String nombre;
	
	public Barrio(){}
	
	public Barrio(String nombre, Comuna comuna){
		this.setNombre(nombre);
		this.comuna = comuna;
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

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comuna == null) ? 0 : comuna.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

/*WARNING: The field type 'ar.edu.unlam.tallerweb1.modelo.Comuna' does not implements 
 * equals() and hashCode() - the resulting code may not work correctly
 * (VER ESTO LUEGO..)*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barrio other = (Barrio) obj;
		if (comuna == null) {
			if (other.comuna != null)
				return false;
		} else if (!comuna.equals(other.comuna))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
}