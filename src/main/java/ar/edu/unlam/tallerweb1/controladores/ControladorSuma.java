package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControladorSuma {	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView inicio() {
		return new ModelAndView("redirect:/sumar");
	}
	
	@RequestMapping(path = "/sumar", method = RequestMethod.GET)
	public ModelAndView irASuma(){
		return new ModelAndView("sumar");
	}
	
	@RequestMapping(path = "/sumar/{valor1}/{valor2}", method = RequestMethod.GET)
	public ModelAndView sumar(@PathVariable("valor1") String valor1,
								@PathVariable("valor2") String valor2){
		try{
			Integer.parseInt(valor1);
			Integer.parseInt(valor2);
		}catch(Exception e){
			return new ModelAndView("redirect:/error");
		}
		
		Integer numero1 = Integer.parseInt(valor1);
		Integer numero2 = Integer.parseInt(valor2);
		
		ModelMap modelo = new ModelMap();
		modelo.put("valor1", numero1);
		modelo.put("valor2", numero2);
		modelo.put("resultado", numero1 + numero2);
		return new ModelAndView("sumar", modelo);		
	}
	
	@RequestMapping(path = "/error", method = RequestMethod.GET)
	public ModelAndView irAError(){
		return new ModelAndView("error");
	}	
}