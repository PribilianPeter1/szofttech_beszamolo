package sajat;

public class dolg {
	
	private String userName;
	private Integer payment;
	private Integer workExperience;
	
	public enum beosztas {JUNIOR, SENIOR, MANAGER}
	public beosztas beoszt;

	
	public beosztas getBeoszt() {
		return beoszt;
	}

	

	public dolg(String userName, Integer payment, Integer workExperience, beosztas beoszt) {
		super();
		this.userName = userName;
		this.payment = payment;
		this.workExperience = workExperience;
		this.beoszt = beoszt;
	}

		
	



	
	


	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Integer getPayment() {
		return payment;
	}



	public void setPayment(Integer payment) {
		this.payment = payment;
	}



	public Integer getWorkExperience() {
		return workExperience;
	}



	public void setWorkExperience(Integer workExperience) {
		this.workExperience = workExperience;
	}



	


	@Override
	public String toString() {
		return "userName=" + userName + ", payment=" + payment + ", workExperience=" + workExperience+ ", beoszt=" + beoszt + "\n";
	}



	public static dolg osszehasonlit(dolg a, dolg b){
	if(a.payment/a.workExperience> b.payment/b.workExperience)
		return a;
			else
	    return b;

			}
}