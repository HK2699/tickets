package com.ticket.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.entity.Ticket;
import com.ticket.service.TicketService;

@RestController
@RequestMapping("/api")
public class TicketController 
{
	@Autowired
	private TicketService ticketService;
	@GetMapping("/alltickets")
	public List<Ticket> fetchAllStudents()
	{
		return this.ticketService.findAll();
	}
	
	@GetMapping("/deleteticket/{theId}")
	public Map<String,String> deleteById(@PathVariable int theId)
	{
		return this.ticketService.deleteById(theId);
		
		
	}
	@PostMapping("/addticket")
	public Map<String,String> addTicket(@RequestBody Ticket ticket)
	{
		return this.ticketService.addTicket(ticket);
		
	}
	@PostMapping("/updateticket")
	public Map<String,String> updateEmployee(@RequestBody Ticket ticket)
	{
		return this.ticketService.updateTicket(ticket);
		
	}
	@GetMapping("/findticket/{theId}")
	public Map<String, Object> findById(@PathVariable int theId)
	{
		return this.ticketService.findById(theId);
	}
	
	@GetMapping("/resolve/{theResolved}")
	public Map<String, Object> findByResolved(@PathVariable int theResolved)
	{
		return this.ticketService.findByResolved(theResolved);
	}
	

}
