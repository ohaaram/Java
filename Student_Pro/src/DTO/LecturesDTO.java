package DTO;

public class LecturesDTO {
	private String lecnno;
	private String prono;
	private String lecname;
	private int leccredit;
	private int lectime;
	private String lecclass;
	public String getLecnno() {
		return lecnno;
	}
	public void setLecnno(String lecnno) {
		this.lecnno = lecnno;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public String getLecname() {
		return lecname;
	}
	public void setLecname(String lecname) {
		this.lecname = lecname;
	}
	public int getLeccredit() {
		return leccredit;
	}
	public void setLeccredit(int leccredit) {
		this.leccredit = leccredit;
	}
	public int getLectime() {
		return lectime;
	}
	public void setLectime(int lectime) {
		this.lectime = lectime;
	}
	public String getLecclass() {
		return lecclass;
	}
	public void setLecclass(String lecclass) {
		this.lecclass = lecclass;
	}
	@Override
	public String toString() {
		return "LecturesDTO [lecnno=" + lecnno + ", prono=" + prono + ", lecname=" + lecname + ", leccredit="
				+ leccredit + ", lectime=" + lectime + ", lecclass=" + lecclass + "]";
	}
	
	

}
