package co.apis.tasteometer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TasteController {

	@Autowired
	private ApiService service;

	@RequestMapping("/")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("index");

		mav.addObject("page1", service.movies(1));
		mav.addObject("page2", service.movies(2));
		mav.addObject("page3", service.movies(3));

		return mav;
	}

}
