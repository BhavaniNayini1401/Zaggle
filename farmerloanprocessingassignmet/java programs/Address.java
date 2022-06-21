
public class Address {
	
	private String LOCALITY,TALUKA,DISTRICT,STATE;
	private String HOUSENO,SURVEYNO;
	
	public Address(String houseNo, String locality, String taluka, String district, String state, String surveyNumber, String SURVEYNO) {
		this.LOCALITY=locality;
		this.TALUKA=taluka;
		this.DISTRICT=district;
		this.STATE=state;
		this.setHOUSENO(houseNo);
		this.setSURVEYNO(SURVEYNO);
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

	
	@Override
	public String toString() {
		return "Address [locality=" + LOCALITY + ", taluka=" + TALUKA + ", district=" + DISTRICT + ", state=" + STATE
				+ "]";
	}


	void displayAddress()
	{
		System.out.println("Address is:");
		System.out.println("Locality:"+getLocality());
		System.out.println("Taluka:"+getTaluka());
		System.out.println("District:"+getDistrict());
		System.out.println("State:"+getState());
	}

	public String getHOUSENO() {
		return HOUSENO;
	}
	public void setHOUSENO(String hOUSENO) {
		HOUSENO = hOUSENO;
	}
	public String getSURVEYNO() {
		return SURVEYNO;
	}
	public void setSURVEYNO(String sURVEYNO) {
		SURVEYNO = sURVEYNO;
	}

}
