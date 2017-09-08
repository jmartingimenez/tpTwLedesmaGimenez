package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

public class ControladorLogin2 {
	
	// La anotacion @Inject indica a Spring que en este atributo se debe setear (inyeccion de dependencias)
		// un objeto de una clase que implemente la interface ServicioLogin, dicha clase debe estar anotada como
		// @Service o @Repository y debe estar en un paquete de los indicados en applicationContext.xml
		@Inject
		private ServicioLogin servicioLogin;
	
		
		
	@RequestMapping("/validar-numeros")
	public ModelAndView irALogin() {

		ModelMap operacion = new ModelMap();
	
		int valor1;
		int valor2;
		int resultado = 0;
		operacion.put("suma", resultado);
		return new ModelAndView("NumerosValidados", operacion);
	}
	
	
	
	
}
