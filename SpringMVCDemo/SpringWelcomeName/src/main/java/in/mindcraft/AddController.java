package in.mindcraft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/name")
	public ModelAndView add(@RequestParam String name) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result"); // Specify the view name without ".jsp"
		mv.addObject("c", name);
		return mv;
	}
}
