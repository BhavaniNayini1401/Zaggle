
public class PermanentAddress {
	PermanentAddress(){}
	
	static class Address{
		String HOUSENO;
		String LOCALITY,TALUKA, DISTRICT, STATE;	
		Address(String houseNo, String locality,String taluka,String district,String state){
			this.HOUSENO = houseNo;
			this.LOCALITY = locality;
			this.TALUKA = taluka;
			this.DISTRICT = district;
			this.STATE = state;
		}
		public String getHouseNo() {
			return HOUSENO;
		}
		public void setHouseNo(String houseNo) {
			this.HOUSENO = houseNo;
		}
		public String getLocality() {
			return LOCALITY;
		}
		public void setLocality(String locality) {
			this.LOCALITY = locality;
		}
		public String getTaluka() {
			return TALUKA;
		}
		public void setTaluka(String taluka) {
			this.TALUKA = taluka;
		}
		public String getDistrict() {
			return DISTRICT;
		}
		public void setDistrict(String district) {
			this.DISTRICT = district;
		}
		public String getState() {
			return STATE;
		}
		public void setState(String state) {
			this.STATE = state;
		}
		public void displayPermanentAddress() {
			System.out.println("House Number:"+HOUSENO);
			System.out.println("Locality:"+LOCALITY);
			System.out.println("Taluka:"+TALUKA);
			System.out.println("District:"+DISTRICT);
			System.out.println("State:"+STATE);				
		}

	}
}
