package in.jdKaur;

public class AccountBean {

	private String accountNumber,ifsc,bankName,branchName,amount;
	
	
	
	public AccountBean(String accountNumber, String ifsc, String bankName,
			String branchName, String amount) {
		super();
		this.accountNumber = accountNumber;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.branchName = branchName;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public AccountBean() {
		// TODO Auto-generated constructor stub
	}

}
