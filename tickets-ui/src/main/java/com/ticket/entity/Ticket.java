package com.ticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ticket")
public class Ticket
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 int ticket_id;
	@Column(name="raisedby_employee_id")
	int raisedby;
	@Column(name="type_of_issue")
	String typeOfIssue;
	
	@Column(name="priority")
	int priority;

	@Column(name="raised_on")
	String rasiedon;
	
	@Column(name="resolved")
	int resolved;
	
	@Column(name="resolved_on")
	String resolvedon;
	
	@Column(name="resolved_by_id")
	int resolvedby;

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getRaisedby() {
		return raisedby;
	}

	public void setRaisedby(int raisedby) {
		this.raisedby = raisedby;
	}

	public String getTypeOfIssue() {
		return typeOfIssue;
	}

	public void setTypeOfIssue(String typeOfIssue) {
		this.typeOfIssue = typeOfIssue;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRasiedon() {
		return rasiedon;
	}

	public void setRasiedon(String rasiedon) {
		this.rasiedon = rasiedon;
	}

	public int getResolved() {
		return resolved;
	}

	public void setResolved(int resolved) {
		this.resolved = resolved;
	}

	public String getResolvedon() {
		return resolvedon;
	}

	public void setResolvedon(String resolvedon) {
		this.resolvedon = resolvedon;
	}

	public int getResolvedby() {
		return resolvedby;
	}

	public void setResolvedby(int resolvedby) {
		this.resolvedby = resolvedby;
	}
	

}
