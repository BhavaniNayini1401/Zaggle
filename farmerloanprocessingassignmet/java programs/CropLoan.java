public class CropLoan extends Loan{
	String cropName;
	int estYield;
	double INTREST_RATE=6.5;
	CropLoan(String cropName,int estYield){
		this.cropName = cropName;
		this.estYield = estYield;
		
	}	
	public double displaySimpleIntrestOfCropLoan() {
		double si=200000*12*INTREST_RATE/100;
		System.out.println("Simple intrest for Crop Loan is :"+si);
		double totalCLEmiAmount = si + 200000;
		double monthlyCLEmi = totalCLEmiAmount/12;
		System.out.println("Monthly crop loan Emi Amount is:"+monthlyCLEmi);
		return monthlyCLEmi;
	}
	public void displayCropLoan() {
		System.out.println("Crop Name:"+cropName);
		System.out.println("Estimated Yield:"+estYield);
		System.out.println("Rate Of Interest:"+INTREST_RATE);
	}

}



