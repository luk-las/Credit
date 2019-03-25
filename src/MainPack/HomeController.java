package MainPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("dataImplemented")
public class HomeController {

	@Autowired
	DataValidator dataValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {

		binder.addValidators(dataValidator);
	}

	@PostMapping(value = "/")
	public String postDataImplement(Model model, @ModelAttribute("data") @Validated DataCredit data, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			return "home";
		}
		model.addAttribute("dataImplemented", data);
		return "redirect:calculation";
	}

	@GetMapping(value = "/")
	public String dataImplement(Model model) {

		model.addAttribute("data", new DataCredit());
		return "home";
	}
}
