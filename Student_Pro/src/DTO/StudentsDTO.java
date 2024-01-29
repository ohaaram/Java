package DTO;

public class StudentsDTO {
	private String stdno;
	private int depno;
	private String prono;
	private String stdname;
	private String stdjumin;
	private String stdhp;
	private String stdemail;
	private String stdaddr;
	private String stdpass;
	
	
	

	public String getStdpass() {
		return stdpass;
	}

	public void setStdpass(String stdpass) {
		this.stdpass = stdpass;
	}

	public String getStdno() {
		return stdno;
	}

	public void setStdno(String stdno) {
		this.stdno = stdno;
	}

	public int getDepno() {
		return depno;
	}

	public void setDepno(int depno) {
		this.depno = depno;
	}

	public String getProno() {
		return prono;
	}

	public void setProno(String prono) {
		this.prono = prono;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStdjumin() {
		return stdjumin;
	}

	public void setStdjumin(String stdjumin) {
		this.stdjumin = stdjumin;
	}

	public String getStdhp() {
		return stdhp;
	}

	public void setStdhp(String stdhp) {
		this.stdhp = stdhp;
	}

	public String getStdemail() {
		return stdemail;
	}

	public void setStdemail(String stdemail) {
		this.stdemail = stdemail;
	}

	public String getStdaddr() {
		return stdaddr;
	}

	public void setStdaddr(String stdaddr) {
		this.stdaddr = stdaddr;
	}

	@Override
	public String toString() {
		return "StudentsDTO [stdno=" + stdno + ", depno=" + depno + ", prono=" + prono + ", stdname=" + stdname
				+ ", stdjumin=" + stdjumin + ", stdhp=" + stdhp + ", stdemail=" + stdemail + ", stdaddr=" + stdaddr
				+ ", stdpass=" + stdpass + "]";
	}



}
