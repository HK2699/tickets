package com.ticket.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.entity.Ticket;
import com.ticket.repo.TicketRepository;
@Service
public class TicketServiceImpl implements TicketService
{

	@Autowired
	private TicketRepository ticketRepository;
	

	public TicketServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Ticket> findAll() {
		return this.ticketRepository.findAll();
		
	}

	@Override
	public Map<String, String> deleteById(int theId) {
		this.ticketRepository.deleteById(theId);

		HashMap<String,String> response= new HashMap<String,String>();

		response.put("status", "0");
		response.put("message","Deleted ticket Successfully");
		return response;
		
	}

	@Override
	public Map<String,String> addTicket(Ticket ticket) {
		ticket.setTicket_id(0);
		Ticket t=this.ticketRepository.save(ticket);
		HashMap<String,String> response= new HashMap<String,String>();
		if(t!=null)
		{
			response.put("status","0");
			response.put("message", "added new ticket sucessfully");
		}
		else
		{
			response.put("status","1");
			response.put("message", "failed to added new ticket");
		}
			return response;
	}

	@Override
	public Map<String, String> updateTicket(Ticket ticket) {
		Ticket t=this.ticketRepository.save(ticket);
		HashMap<String,String> response= new HashMap<String,String>();
		if(t!=null)
		{
			response.put("status","0");
			response.put("message", "updated new ticket sucessfully");
		}
		else
		{
			response.put("status","1");
			response.put("message", "failed to update ticket");
		}
			return response;
	}

	@Override
	public Map<String, Object> findById(int theid) {
		Map<String, Object> response= new HashMap<String,Object>();
		Optional<Ticket> ticket=this.ticketRepository.findById(theid);
		if(ticket.isPresent())
		{
			response.put("ticket",ticket);
			
		}
		else
		{
			response.put("status","1");
			response.put("message", "failed to fetch ticket");
			response.put("error", "given id didnot ticket");
		}
		return response;
	}

	@Override
	public Map<String, Object> findByResolved(int theResolved) {
		List<Ticket> ticket  = this.ticketRepository.findByResolved(theResolved);
		Map<String, Object> response = new HashMap<String,Object>();
		if(theResolved==1) {
			response.put("ticket",ticket);
		}else if(theResolved==0)
		{
			response.put("ticket",ticket);
		}
		return response;
	}

	
}
