import java.util.Arrays;

public class Loan {

	static int NOOFLOANS;
	private int LOANNUMBER,LOANAMOUNT,TENURE,EMIAMOUNT,NOOFEMIS, REPAIDAMOUNT;
	protected boolean[] isEMIpaid;
	boolean[] isEmiPaid = new boolean[NOOFEMIS];
	int c = 0;
	
		
	public Loan() {
		NOOFLOANS++;
	}

	public int getLoanNumber() {
		return LOANNUMBER;
	}

	public void setLoanNumber(int loanNumber) {
		this.LOANNUMBER = loanNumber;
	}

	public int getLoanAmount() {
		return LOANAMOUNT;
	}

	public void setLoanAmount(int loanAmount) {
		this.LOANAMOUNT = loanAmount;
	}

	public int getTenure() {
		return TENURE;
	}

	public void setTenure(int tenure) {
		this.TENURE = tenure;
	}

	public int getEmiAmount() {
		return EMIAMOUNT;
	}

	public void setEmiAmount(int emiAmount) {
		this.EMIAMOUNT = emiAmount;
	}

	public int getNoOfEmis() {
		return NOOFEMIS;
	}

	public void setNoOfEmis(int noOfEmis) {
		this.NOOFEMIS = noOfEmis;
	}
	
	public int getRepaidAmount() {
		return REPAIDAMOUNT;
	}

	public void setRepaidAmount(int repaidAmount) {
		this.REPAIDAMOUNT = repaidAmount;
	}
	public void totalLoanTaken()
	{
		
		System.out.println(LOANAMOUNT);
	}

	public boolean[] getIsEmiPaid() {
		return isEmiPaid;
	}

	public void setIsEmiPaid(boolean[] isEmiPaid) {
		this.isEmiPaid = isEmiPaid;
	}
	
	@Override
	public String toString() {
		return "Loan [loanNumber=" + LOANNUMBER + ", loanAmount=" + LOANAMOUNT + ", tenure=" + TENURE + ", emiAmount="
				+ EMIAMOUNT + ", noOfEmis=" + NOOFEMIS + ", repaidAmount=" + REPAIDAMOUNT + ", isEmiPaid="
				+ Arrays.toString(isEmiPaid) + "]";
	}
	public void payEmi(int emiAmount) {
		isEmiPaid[c++] = true;	
	}
	
}

