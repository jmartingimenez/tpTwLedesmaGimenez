/*Esta clase tiene una relación 1-1 con Farmacia (Atributo en Farmacia)
 * (Una farmacia se encuentra en una direccion y en una direccion se encuentra solo una farmacia)
 * 
 *Esta clase tiene una relación N-1 con Barrio
 * 	(Una dirección esta en un barrio y en un barrio hay muchas direcciones)*/

package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idBarrio")
	private Barrio barrio;	
	
	private String calle;
	private String numero;
	
	public Direccion(){}
	
	public Direccion(Long id, String calle, String numero, Barrio barrio){
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.barrio = barrio;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Barrio getBarrio() {
		return barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}	
}