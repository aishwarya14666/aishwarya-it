package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Passenger;
import com.example.binding.Ticket;

@RestController
public class TicketController {
	
	@PostMapping(value="/details",consumes= {"application/json"},
			produces={"application/json"})
	public ResponseEntity<Ticket> GetDetailsOfPassenger(@RequestBody Passenger passenger){
		System.out.println(passenger);
		//logic to book ticket
		Ticket t=new Ticket();
		t.setBookingStatus("booked");
		t.setTicketPrice(555.00);
		
		return new ResponseEntity<>(t,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> UpdateTicket(@RequestBody Passenger passenger){
		System.out.println(passenger);
		//logic to update
		return new ResponseEntity<>("Ticket updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketid}")
	public ResponseEntity<String> DeleteTicket(@PathVariable ("ticketid") Integer ticketid){
		//logic to delete
		return new ResponseEntity<>("Ticket Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/ticket/{ticketid}")
	public ResponseEntity<Ticket> GetDetails(@PathVariable ("ticketid") Integer ticketid){
		//logic to get
		Ticket t=new Ticket();
		t.setTicketid(ticketid);
		t.setBookingStatus("booked");
		t.setTicketPrice(555.00);
		return new ResponseEntity<>(t,HttpStatus.OK);
	}
}
