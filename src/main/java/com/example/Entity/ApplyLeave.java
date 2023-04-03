package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
public class ApplyLeave {
	@Id
	private int empid;
	private String LeaveType;
	private int date;
	private String TeamEmail;
	private String Reason;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getLeaveType() {
		return LeaveType;
	}
	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getTeamEmail() {
		return TeamEmail;
	}
	public void setTeamEmail(String teamEmail) {
		TeamEmail = teamEmail;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public ApplyLeave(int empid, String leaveType, int date, String teamEmail, String reason) {
		super();
		this.empid = empid;
		LeaveType = leaveType;
		this.date = date;
		TeamEmail = teamEmail;
		Reason = reason;
	}
	public ApplyLeave() {

	}
	@Override
	public String toString() {
		return "ApplyLeave [empid=" + empid + ", LeaveType=" + LeaveType + ", date=" + date + ", TeamEmail=" + TeamEmail
				+ ", Reason=" + Reason + "]";
	}


}
