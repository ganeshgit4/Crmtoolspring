package com.CRMVCUBEUSERAPI.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employe_id;
	@Column(name="employe_First_Name")
	private String employe_First_Name;
	@Column(name="employe_Last_Name")
	private String employe_Last_Name;
	@Column(name="employe_MobileNO")
	private String employe_MobileNO;
	@Column(name="employe_mail")
	private String employe_mail;
	@Column(name="employe_designation")
	private String employe_designation;
	@Column(name="employe_Qualification")
	private String employe_Qualification;
	@Column(name="employe_SSC_Mark_Memo")
	private int employe_SSC_Mark_Memo;
	@Column(name="employe_HSC_Mark_Memo")
	private int employe_HSC_Mark_Memo;
	@Column(name="employe_graduation")
	private String employe_graduation;
	@Column(name="employe_PG")
	private String employe_PG;
	@Column(name="employe_Gender")
	private String employe_Gender;
	@Column(name="employe_Created_Date")
	private String employe_Created_Date;
	@Column(name="employe_Updated_date")
	private String employe_Updated_date;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmploye_id() {
		return employe_id;
	}
	public void setEmploye_id(long employe_id) {
		this.employe_id = employe_id;
	}
	public String getEmploye_First_Name() {
		return employe_First_Name;
	}
	public void setEmploye_First_Name(String employe_First_Name) {
		this.employe_First_Name = employe_First_Name;
	}
	public String getEmploye_Last_Name() {
		return employe_Last_Name;
	}
	public void setEmploye_Last_Name(String employe_Last_Name) {
		this.employe_Last_Name = employe_Last_Name;
	}
	public String getEmploye_MobileNO() {
		return employe_MobileNO;
	}
	public void setEmploye_MobileNO(String employe_MobileNO) {
		this.employe_MobileNO = employe_MobileNO;
	}
	public String getEmploye_mail() {
		return employe_mail;
	}
	public void setEmploye_mail(String employe_mail) {
		this.employe_mail = employe_mail;
	}
	public String getEmploye_designation() {
		return employe_designation;
	}
	public void setEmploye_designation(String employe_designation) {
		this.employe_designation = employe_designation;
	}
	public String getEmploye_Qualification() {
		return employe_Qualification;
	}
	public void setEmploye_Qualification(String employe_Qualification) {
		this.employe_Qualification = employe_Qualification;
	}
	public int getEmploye_SSC_Mark_Memo() {
		return employe_SSC_Mark_Memo;
	}
	public void setEmploye_SSC_Mark_Memo(int employe_SSC_Mark_Memo) {
		this.employe_SSC_Mark_Memo = employe_SSC_Mark_Memo;
	}
	public int getEmploye_HSC_Mark_Memo() {
		return employe_HSC_Mark_Memo;
	}
	public void setEmploye_HSC_Mark_Memo(int employe_HSC_Mark_Memo) {
		this.employe_HSC_Mark_Memo = employe_HSC_Mark_Memo;
	}
	public String getEmploye_graduation() {
		return employe_graduation;
	}
	public void setEmploye_graduation(String employe_graduation) {
		this.employe_graduation = employe_graduation;
	}
	public String getEmploye_PG() {
		return employe_PG;
	}
	public void setEmploye_PG(String employe_PG) {
		this.employe_PG = employe_PG;
	}
	public String getEmploye_Gender() {
		return employe_Gender;
	}
	public void setEmploye_Gender(String employe_Gender) {
		this.employe_Gender = employe_Gender;
	}
	public String getEmploye_Created_Date() {
		return employe_Created_Date;
	}
	public void setEmploye_Created_Date(String employe_Created_Date) {
		this.employe_Created_Date = employe_Created_Date;
	}
	public String getEmploye_Updated_date() {
		return employe_Updated_date;
	}
	public void setEmploye_Updated_date(String employe_Updated_date) {
		this.employe_Updated_date = employe_Updated_date;
	}
	
	

}
