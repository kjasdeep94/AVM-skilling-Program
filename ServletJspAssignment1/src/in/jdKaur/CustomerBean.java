package in.jdKaur;

public class CustomerBean {
	private String customerId,customerName,gender,accountNumber;

	public CustomerBean()
	{
		
	}
	public CustomerBean(String customerId, String customerName, String gender,
			String accountNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.accountNumber = accountNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
