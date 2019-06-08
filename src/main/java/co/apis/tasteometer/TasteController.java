package co.apis.tasteometer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TasteController {

	@Autowired
	private ApiService service;

	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView("index");

		mav.addObject("page1", service.movies(1));
		mav.addObject("page2", service.movies(2));
		mav.addObject("page3", service.movies(3));
		mav.addObject("page4", service.movies(4));
		mav.addObject("page5", service.movies(5));

		return mav;
	}

	@RequestMapping("/page2")
	public ModelAndView page2(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("page2");

		String[] count = { "", "" };
		if (request.getParameterValues("count") != null) {
			count = request.getParameterValues("count");
		}
		System.out.println(count.length);

		mav.addObject("count", 100 - count.length);
		mav.addObject("page1", service.movies(6));
		mav.addObject("page2", service.movies(7));
		mav.addObject("page3", service.movies(8));
		mav.addObject("page4", service.movies(9));
		mav.addObject("page5", service.movies(10));

		return mav;

	}

	@RequestMapping("/page3")
	public ModelAndView page3(HttpServletRequest request, @RequestParam("count") Integer count) {
		ModelAndView mav = new ModelAndView("page3");

		String[] num = request.getParameterValues("count");

		int total = count + (100 - num.length);

		mav.addObject("count", total);
		mav.addObject("page1", service.movies(11));
		mav.addObject("page2", service.movies(12));
		mav.addObject("page3", service.movies(13));
		mav.addObject("page4", service.movies(14));
		mav.addObject("page5", service.movies(15));

		return mav;

	}

	@RequestMapping("/page4")
	public ModelAndView page4(HttpServletRequest request, @RequestParam("count") Integer count) {
		ModelAndView mav = new ModelAndView("redirect:/page3");

		String[] num = request.getParameterValues("count");

		int total = count + (100 - num.length);

		mav.addObject("count", total);
		mav.addObject("page1", service.movies(16));
		mav.addObject("page2", service.movies(17));
		mav.addObject("page3", service.movies(18));
		mav.addObject("page4", service.movies(19));
		mav.addObject("page5", service.movies(20));

		return mav;

	}

}
