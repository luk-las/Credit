package MainPack;

public class Calculation {
	private int amountCalc;
	private int repaymentPeriodCalc;
	private double bankRateCalc;
	private double summaryAmount;
	private double monthlyRate;
	private double cost;
	
	public int getAmountCalc() {
		return amountCalc;
	}
	public void setAmountCalc(DataCredit data) {
		this.amountCalc = Integer.parseInt(data.getAmount());
	}
	public int getRepaymentPeriodCalc() {
		return repaymentPeriodCalc;
	}
	public void setRepaymentPeriodCalc(DataCredit data) {
		this.repaymentPeriodCalc = Integer.parseInt(data.getRepaymentPeriod());
	}
	public double getBankRateCalc() {
		return bankRateCalc;
	}
	public void setBankRateCalc(DataCredit data) {
		this.bankRateCalc = Double.parseDouble(data.getBankRate());
	}
		
	public double getSummaryAmount() {
		return summaryAmount;
	}
	public void setSummaryAmount(Calculation c) {
		int AC = c.getAmountCalc();
		summaryAmount = AC+((AC*(Math.pow(1+c.getBankRateCalc()/100,c.getRepaymentPeriodCalc()/12.0))-AC)/2);
	}
	public double getMonthlyRate() {
		return monthlyRate;
	}
	public void setMonthlyRate(Calculation c) {
		monthlyRate = c.getSummaryAmount()/c.getRepaymentPeriodCalc();
		monthlyRate = (Math.round(monthlyRate*100))/100.0;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(Calculation c) {
		cost = c.getSummaryAmount() - c.getAmountCalc();
		cost = (Math.round(cost*100))/100.0;
	}	

}
