package selenium.automation;

public interface PaymentGW {

	public long getFromAccount();

	public long getToAccount();

	public float getBillAmount();

	public String getPaymentNote();

}
