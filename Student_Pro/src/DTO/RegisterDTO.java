package DTO;

public class RegisterDTO {
	private String stdno;
	private String lecno;
	private String prono;
	private int regattenscore;
	private int regmidscore;
	private int regfinalscore;
	private int regtotal;
	private String reggrade;
	public String getStdno() {
		return stdno;
	}
	public void setStdno(String stdno) {
		this.stdno = stdno;
	}
	public String getLecno() {
		return lecno;
	}
	public void setLecno(String lecno) {
		this.lecno = lecno;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public int getRegattenscore() {
		return regattenscore;
	}
	public void setRegattenscore(int regattenscore) {
		this.regattenscore = regattenscore;
	}
	public int getRegmidscore() {
		return regmidscore;
	}
	public void setRegmidscore(int regmidscore) {
		this.regmidscore = regmidscore;
	}
	public int getRegfinalscore() {
		return regfinalscore;
	}
	public void setRegfinalscore(int regfinalscore) {
		this.regfinalscore = regfinalscore;
	}
	public int getRegtotal() {
		return regtotal;
	}
	public void setRegtotal(int regtotal) {
		this.regtotal = regtotal;
	}
	public String getReggrade() {
		return reggrade;
	}
	public void setReggrade(String reggrade) {
		this.reggrade = reggrade;
	}
	@Override
	public String toString() {
		return "RegisterDTO [stdno=" + stdno + ", lecno=" + lecno + ", prono=" + prono + ", regattenscore="
				+ regattenscore + ", regmidscore=" + regmidscore + ", regfinalscore=" + regfinalscore + ", regtotal="
				+ regtotal + ", reggrade=" + reggrade + "]";
	}
}
