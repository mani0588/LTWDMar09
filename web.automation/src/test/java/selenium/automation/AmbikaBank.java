package selenium.automation;

public class AmbikaBank implements PaymentGW {

	public long getFromAccount() {
		// reading from acct from oracle DB
		return 0;
	}

	public long getToAccount() {
		return 0;
	}

	public float getBillAmount() {
		// internet banking UI
		return 0;
	}

	public String getPaymentNote() {
		// internet banking UI
		return null;
	}

}
