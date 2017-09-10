/*Esta clase no es necesaria persistirla. Va tomar los inputs del formulario y los 
 * va a setear. El constructor es vacio, pero con el action del form, se ejecutan los 
 * setters*/
package ar.edu.unlam.tallerweb1.modelo;

public class Suma{
	String valor1;
	String valor2;
	boolean sonNumeros;
	
	public Suma(){}
	
	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}

	public boolean getSonNumeros() {
		return sonNumeros;
	}

	//Setea el booleano sonNumeros
	public void checkearSiSonNumeros() {
		if(esParseable(valor1, valor2)) this.sonNumeros = true;
		else this.sonNumeros = false;
	}
	
	//Revisa si son números
	private static boolean esParseable(String valor1, String valor2){
		boolean sonParseables = true;
		try{
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
		}catch(Exception e){
			sonParseables = false;
		}
		return sonParseables;
	}
	
	//Hace la suma o retorna null
	public Integer getResultado(){
		if(esParseable(valor1, valor2))
			return Integer.parseInt(valor1) + Integer.parseInt(valor2);
		return null;
	}	
}