package DTO;

public class DepartmentsDTO {
	private int depno;
	private String depname;
	private String deptel;
	public int getDepno() {
		return depno;
	}
	public void setDepno(int depno) {
		this.depno = depno;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getDeptel() {
		return deptel;
	}
	public void setDeptel(String deptel) {
		this.deptel = deptel;
	}
	@Override
	public String toString() {
		return "DepartmentsDTO [depno=" + depno + ", depname=" + depname + ", deptel=" + deptel + "]";
	}
	
	

}
