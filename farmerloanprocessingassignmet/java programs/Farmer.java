import java.util.Arrays;

public class Farmer {
	private String FIRSTNAME,LASTNAME;
	private boolean[] LOANSTAKEN = new boolean[3];
	private String AADHARNUMBER;
	static int TOTALLOANAMOUNT;
	static int REPAIDLOANAMOUNT;
	
	Loan obj1;
	int EMICOUNT[] = {0,0,0};
	boolean LOANTAKEN[] = new boolean[3];
	PermanentAddress.Address obj;
	FieldAddress.Address objf;
	public Farmer(String firstName, String lastName, String aadharNumber,String Address, int surveyNo,String locality,String taluka,String district,String state) {
		this.FIRSTNAME = firstName;
		this.LASTNAME = lastName;
		this.AADHARNUMBER = aadharNumber;
		obj  = new PermanentAddress.Address(Address,locality,taluka,district,state);
		objf = new FieldAddress.Address(surveyNo,locality,taluka,district,state);
		obj1 = new Loan();
	}
	
	public String getFirstName() {
		return FIRSTNAME;
	}
	
	public void setFirstName(String firstName) {
		this.FIRSTNAME = firstName;
	}
	
	public String getLastName() {
		return LASTNAME;
	}
	
	public void setLastName(String lastName) {
		this.LASTNAME = lastName;
	}
	
	public String getAadharNumber() {
		return AADHARNUMBER;
	}
	
	public void setAadharNumber(String aadharNumber) {
		this.AADHARNUMBER = aadharNumber;
	}
	public void DISPLAYFARMER() {
		System.out.println("First Name :"+FIRSTNAME);
		System.out.println("Last Name :"+LASTNAME);
		System.out.println("Adhar Number :"+AADHARNUMBER);
		System.out.println("Address :-");
		obj.displayPermanentAddress();
		System.out.println("Loans taken by farmer is:");
		if(LOANTAKEN[0]!=false) {
			System.out.println("Crop Loan");
		}
		if(LOANTAKEN[1]!=false) {
			System.out.println("Water Pipe Line Loan");
		}
		if(LOANTAKEN[2]!=false) {
			System.out.println("Tractor Loan");
		}			
	}
	public void TAKELOAN(String s) {		
		if(s.equals("Crop Loan")) {			
			CropLoan obj = new CropLoan("Cotton",200000);
			obj.displaySimpleIntrestOfCropLoan();
			LOANSTAKEN[0] = true;
			EMICOUNT[0] = 12;
			TOTALLOANAMOUNT += 200000;
		}else if(s.equals("Water Pipe Loan")) {
			WaterPipeLineLoan obj = new WaterPipeLineLoan("Falcon",30);
			obj.displayWaterPipeLineLoan();
			LOANSTAKEN[1] = true;
			EMICOUNT[1] = 12;
			TOTALLOANAMOUNT += 350000;
		}else {
			TractorLoan obj = new TractorLoan("Mahindra","2022");
			obj.displayTractorLoan();
			LOANSTAKEN[2] = true;
			EMICOUNT[2] = 12;
			TOTALLOANAMOUNT += 500000;
		}
	}
	public void PAYEMI(int count,String cropName) {
		
		CropLoan loan1 = null;
		WaterPipeLineLoan loan2 = null;
		TractorLoan loan3 = null;
		if(cropName.equals("Crop Loan")) {
			loan1 = new CropLoan(cropName, count);
			EMICOUNT[0] -= count;
			REPAIDLOANAMOUNT += loan1.displaySimpleIntrestOfCropLoan();
		}else if(cropName.equals("Water Pipe Loan")) {			
			EMICOUNT[1] -= count;
			loan2 = new WaterPipeLineLoan(cropName, count);
			REPAIDLOANAMOUNT += loan2.displaySimpleIntrestOfWaterPipelineLoan();			
		}else {			
			EMICOUNT[2] -= count;
			loan3 = new TractorLoan(cropName, cropName);
			REPAIDLOANAMOUNT += loan3.displaySimpleIntrestOfTractorLoan();
		}		
	}
	public int[] GETEMIARRAY() {
		return EMICOUNT;
	}

	@Override
	public String toString() {
		return "Farmer [firstName=" + FIRSTNAME + ", lastName=" + LASTNAME + ", loansTaken="
				+ Arrays.toString(LOANSTAKEN) + ", aadharNumber=" + AADHARNUMBER + ", obj1=" + obj1 + ", emiCount="
				+ Arrays.toString(EMICOUNT) + ", loantaken=" + Arrays.toString(LOANTAKEN) + ", obj=" + obj + "]";
	}

	
	
	
}
