package DTO;

public class ProfessorsDTO {
	private String prono;
	private int depno;
	private String proname;
	private String projumin;
	private String prohp;
	private String proemail;
	private int propass;
	
	
	
	
	public int getPropass() {
		return propass;
	}
	public void setPropass(int propass) {
		this.propass = propass;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public int getDepno() {
		return depno;
	}
	public void setDepno(int depno) {
		this.depno = depno;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getProjumin() {
		return projumin;
	}
	public void setProjumin(String projumin) {
		this.projumin = projumin;
	}
	public String getProhp() {
		return prohp;
	}
	public void setProhp(String prohp) {
		this.prohp = prohp;
	}
	public String getProemail() {
		return proemail;
	}
	public void setProemail(String proemail) {
		this.proemail = proemail;
	}
	@Override
	public String toString() {
		return "ProfessorsDTO [prono=" + prono + ", depno=" + depno + ", proname=" + proname + ", projumin=" + projumin
				+ ", prohp=" + prohp + ", proemail=" + proemail + "]";
	}

}
