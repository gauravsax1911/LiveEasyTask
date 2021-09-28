package com.LiveEasy.LiveEasyAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LiveEasy.LiveEasyAPI.entity.Payload;
import com.LiveEasy.LiveEasyAPI.repository.PayLoadRepo;
import com.LiveEasy.LiveEasyAPI.services.PayloadService;



@RestController
@RequestMapping("/load")
public class MyController {
	
	@Autowired
	private PayloadService pds;
    
	@RequestMapping(value = "",method = RequestMethod.POST)
	public Payload adddetails(@RequestBody Payload pd)
	{
		return pds.savedetails(pd);
	}
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public List<Payload> getloaddetailfromshipperId()
	{
		return pds.getloadwithShipperID();
	}
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public Payload getloaddetails(@PathVariable("id") long id)
	{
		return pds.getload(id);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public Payload updateload(@PathVariable("id") long id,@RequestBody Payload pd)
	{
		return pds.update(id,pd);
	}
	

	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public void deleteLoad(@PathVariable("id") long id)
	{
	      pds.removeload(id);	
	}
	
}
