
public class Instructor extends User {
	
	String certifications;

	public Instructor() {
		
	}
	
	public Instructor(String certifications) {
		super();
		this.certifications = certifications;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

}
