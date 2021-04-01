package selenium.automation;

public class MinaBank implements PaymentGW {

	public long getFromAccount() {
		// reading from acct from XYZ DB
		return 0;
	}

	public long getToAccount() {
		return 0;
	}

	public float getBillAmount() {
		// mobile / API banking UI
		return 0;
	}

	public String getPaymentNote() {
		// internet banking UI
		return null;
	}
}
