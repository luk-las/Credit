package MainPack;

public enum ValidatorEnum {

	AMOUNT("[0-9]+", "err_code", "Tylko liczby"),
	PERIOD("[0-9]+", "err_code", "Tylko liczby"), 
	RATE("[0-9]+[.]{0,1}[0-9]{0,2}", "err_code", "Niepoprawne dane");

	private String pattern;
	private String errCode;
	private String errMessage;

	private ValidatorEnum(String pattern, String errCode, String errMessage) {
		this.pattern = pattern;
		this.errCode = errCode;
		this.errMessage = errMessage;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

}
