package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Suma;


@Controller
public class ControladorSuma {
	
	// Escucha la url /, y redirige a la URL /calculo, es lo mismo que si se invoca la 
	// url /calculo directamente.
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/calculo");
	}
	
	// Escucha la URL /calculo por GET, y redirige a una vista.
	@RequestMapping(path = "/calculo", method = RequestMethod.GET)
	public ModelAndView irACalculo(){
		ModelMap modelo = new ModelMap();
		Suma suma = new Suma();
		modelo.put("operacion", suma);
		return new ModelAndView("calculo", modelo);
	}
	
	@RequestMapping(path = "/validar-numeros", method = RequestMethod.POST)
	public ModelAndView controlarResultado() {			
		/*Revisar esta primera parte luego, se supone que en vez de 3 y 6, esas 2 
		 * variables guardaran los inputs del user. La clase Suma ya en su constructor 
		 * se fija si los valores son enteros o no. Si ambos no son enteros, se setearan 
		 * como nulos*/
		String input1 = "3";
		String input2 = "6";//Poner un String no n�merico para ver que redirecciona a error
		
		Suma suma = new Suma(input1, input2);
		if(!suma.getSonNumeros()) return new ModelAndView("redirect:/error");
		
		//A partir de aca, se sabe que los 2 datos ingresados son n�meros
		ModelMap operacion = new ModelMap();		
		Integer valor1 = suma.getValor1();
		Integer valor2 = suma.getValor2();
		
		operacion.put("valor1",valor1);
		operacion.put("valor2", valor2);
		operacion.put("resultado",valor1 + valor2);
		
		/*Parametros: (Nombre de la vista, Nombre del modelo, Objeto del modelo)
		 * Lo hice de esta manera, para en la vista resultado poder poner... 
		 * ${operacion.valor1}, ${operacion.valor2}, ${operacion.resultado}*/
		return new ModelAndView("resultado", "operacion", operacion);
	}
	
	// Escucha la URL /resultado por GET, y redirige a una vista.
	@RequestMapping(path = "/resultado", method = RequestMethod.GET)
	public ModelAndView irAResultado(){		
		return new ModelAndView("resultado");
	}	
	// Escucha la URL /error por GET, y redirige a una vista.
	@RequestMapping(path = "/error", method = RequestMethod.GET)
	public ModelAndView irAError(){
		return new ModelAndView("error");
	}	
}