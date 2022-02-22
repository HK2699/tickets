package com.ticket.service;

import java.util.List;
import java.util.Map;


import org.springframework.transaction.annotation.Transactional;

import com.ticket.entity.Ticket;

public interface TicketService
{
	public List<Ticket> findAll();
	@Transactional
	public Map<String,String> deleteById(int theId);
	@Transactional
	public Map<String,String> addTicket(Ticket ticket);
	public Map<String,String> updateTicket(Ticket ticket);
	public Map<String,Object> findById(int theid);
	public Map<String, Object> findByResolved(int theResolved);
	
	
}
