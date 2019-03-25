package MainPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class DataValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {	
		return DataCredit.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		DataCredit data = (DataCredit) target;
		
		validate(ValidatorEnum.AMOUNT, data.getAmount(), "amount", errors);
		validate(ValidatorEnum.PERIOD, data.getRepaymentPeriod(), "repaymentPeriod", errors);
		validate(ValidatorEnum.RATE, data.getBankRate(), "bankRate", errors);
	}

	private void validate(ValidatorEnum validator, String value, String fieldName, Errors errors) {
		String patternReg = validator.getPattern();
		Pattern pattern = Pattern.compile(patternReg);
		Matcher matcher = pattern.matcher(value);
		if (!matcher.matches()) {
			errors.rejectValue(fieldName, validator.getErrCode(), validator.getErrMessage());
		}
}

}
