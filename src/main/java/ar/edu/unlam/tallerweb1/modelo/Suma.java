/*Esta clase no es necesaria persistirla. Va tomar los inputs del formulario y si 
 * efectivamente son números enteros, los va a setear*/
package ar.edu.unlam.tallerweb1.modelo;

public class Suma {
	Integer valor1;
	Integer valor2;
	
	public Suma(){}
	
	public Suma(String valor1, String valor2){
		if((esParseable(valor1)) && (esParseable(valor2))){
			this.valor1 = Integer.parseInt(valor1);
			this.valor2 = Integer.parseInt(valor2);
		}
		else{
			this.valor1 = null;
			this.valor2 = null;
		}
	}
	
	private static boolean esParseable(String valor){
		boolean esParseable = true;
		try{
			Integer.parseInt(valor);
		}catch(NumberFormatException e){
			esParseable = false;
		}
		return esParseable;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		if(esParseable(valor1)) this.valor1 = Integer.parseInt(valor1);
		else this.valor1 = null;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		if(esParseable(valor2)) this.valor2 = Integer.parseInt(valor2);
		else this.valor2 = null;
	}
	
	public Integer getResultado(){
		if((esParseable(valor1.toString())) && (esParseable(valor2.toString())))
			return valor1 + valor2;
		return null;
	}
}