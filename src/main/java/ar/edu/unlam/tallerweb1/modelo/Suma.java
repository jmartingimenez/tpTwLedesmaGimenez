/*Esta clase no es necesaria persistirla. Va tomar los inputs del formulario y si 
 * efectivamente son números enteros, los va a setear*/
package ar.edu.unlam.tallerweb1.modelo;

public class Suma {
	Integer valor1;
	Integer valor2;
	boolean sonNumeros;
	
	public Suma(){}
	
	public Suma(String valor1, String valor2){
		if((sonParseables(valor1, valor2))){
			this.valor1 = Integer.parseInt(valor1);
			this.valor2 = Integer.parseInt(valor2);
			sonNumeros = true;
		}
		else{
			this.valor1 = null;
			this.valor2 = null;
			sonNumeros = false;
		}
	}
	
	private static boolean sonParseables(String valor1, String valor2){
		boolean sonParseables = true;
		try{
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
		}catch(Exception e){
			sonParseables = false;
		}
		return sonParseables;
	}

	public Integer getValor1() {
		return valor1;
	}

	public Integer getValor2() {
		return valor2;
	}
	
	public boolean getSonNumeros(){
		return sonNumeros;
	}	
}