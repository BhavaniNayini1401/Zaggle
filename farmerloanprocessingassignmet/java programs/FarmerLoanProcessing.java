
public class FarmerLoanProcessing {

	public static void main(String[] args) {
		int surveyNo = 121;
		Farmer farmer1 = new Farmer("Bhavani","Nayini","123456781335","1-2-3",surveyNo++,"Kompally","Hyderabd","Hyderabad","Telangana");
		farmer1.TAKELOAN("Crop Loan");		
		farmer1.TAKELOAN("Tractor Loan");
		farmer1.DISPLAYFARMER();
		farmer1.PAYEMI(1,"Crop Loan");
		farmer1.PAYEMI(2,"Tractor Loan");
		
		int ar[] = farmer1.GETEMIARRAY();
		for(int i=0;i<3;i++) {
			if(ar[i] == 0) {
				continue;
			}else {
				if(i==0) 
					System.out.println("Crop Loan");
				else if(i == 1) 
					System.out.println("Water Pipe Loan");
				else 
					System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar[i]);
				System.out.println();
			}
		}
		
		Farmer farmer2 = new Farmer("Ram","Krishna","567891234538","5-6-7",surveyNo++,"Simhapuri colony","Pragatinagar","Hyderabad","Telangana");
		farmer2.TAKELOAN("Crop Loan");
		farmer2.TAKELOAN("Tractor Loan");
		farmer2.TAKELOAN("Water Pipe Loan");
		farmer2.DISPLAYFARMER();
		
		farmer2.PAYEMI(3,"Water Pipe Loan");
		farmer2.PAYEMI(2,"Crop Loan");
		
		
		
		int ar1[] = farmer2.GETEMIARRAY();
		for(int i=0;i<3;i++) {
			if(ar1[i] == -12) {
				
			}else {
				if(i==0) System.out.println("Crop Loan");
				else if(i == 1) System.out.println("Water Pipe Loan");
				else System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar1[i]);
			}
		}
		System.out.println("Total no of loans by company is:"+Loan.NOOFLOANS);
		System.out.println("Total amount disbursed is:"+Farmer.TOTALLOANAMOUNT);
		System.out.println("Total amount repaid is:"+Farmer.REPAIDLOANAMOUNT);
		
	}
}
