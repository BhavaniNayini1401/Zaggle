
public class FieldAddress {
	FieldAddress(){}
	
	static class Address{
		int SURVEYNO;
		String LOCALITY,TALUKA, DISTRICT, STATE;	
		Address(int surveyNo, String locality,String taluka,String district,String state){
			this.SURVEYNO = surveyNo;
			this.LOCALITY = locality;
			this.TALUKA = taluka;
			this.DISTRICT = district;
			this.STATE = state;
		}
		public int getSurveyNo() {
			return SURVEYNO;
		}
		public void setSurveyNo(int surveyNo) {
			this.SURVEYNO = surveyNo;
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
		public void displayFieldAddress() {
			System.out.println("Survey Number:"+SURVEYNO);
			System.out.println("Locality:"+LOCALITY);
			System.out.println("Taluka:"+TALUKA);
			System.out.println("District:"+DISTRICT);
			System.out.println("State:"+STATE);				
		}

	}
}

