package com.iaktech.weddingweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iaktech.weddingweb.model.Rsvp;
import com.iaktech.weddingweb.repo.RsvpRepository;

@Service
public class RsvpService {
	
	@Autowired
	private RsvpRepository rsvpRepository;
	
	public  List<Rsvp> getAll(){
		return rsvpRepository.findAll();
	}

	public Rsvp addRsvp( Rsvp rsvp) {

		return rsvpRepository.save(rsvp);
	}
}
