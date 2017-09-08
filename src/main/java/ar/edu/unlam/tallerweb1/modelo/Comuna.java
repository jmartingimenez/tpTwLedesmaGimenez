/* Esta clase tiene una relación 1-N con Barrio
 * 	(En una comuna hay muchos barrios y un barrio pertenece a una comuna)
 * 	- ESTA RELACIÓN ESTA COMO BIDIRECCIONAL -*/

package ar.edu.unlam.tallerweb1.modelo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comuna {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "comuna", cascade = CascadeType.ALL)
	private List<Barrio> barrios = new ArrayList<Barrio>();
	
	private String nombre;

	//No hay constructor en el diagrama, usara el vacio solamente..	
	
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
	
	public List<Barrio> getBarrios() {
		return barrios;
	}
	
	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}
	
	public void addBarrio(Barrio barrio){
		barrios.add(barrio);
	}
}