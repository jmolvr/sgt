package br.unifap.escritoriomodelo.sgt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Representa o controlador home
 * @author thiago <thiagopinhero.nascimento@ggmail.com>
 * @since 1.0
 */
@Controller
public class HomeController {
	
	/**
	 * Chama a view index
	 * @return ModelAndView contendo a view index
	 */
	@RequestMapping("/")
	public ModelAndView index () {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}
