package MainPack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CalculationController {	
	
	@GetMapping(value="/calculation")
	public String calculation(Model model, @SessionAttribute("dataImplemented") DataCredit data, Calculation calc) {
		
		calc.setAmountCalc(data);
		calc.setRepaymentPeriodCalc(data);
		calc.setBankRateCalc(data);
		calc.setSummaryAmount(calc);
		calc.setMonthlyRate(calc);
		calc.setCost(calc);
		
		model.addAttribute("CAL",calc );
		return "calculation";
	}

}
