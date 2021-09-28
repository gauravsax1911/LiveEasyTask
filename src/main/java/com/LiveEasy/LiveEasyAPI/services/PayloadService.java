package com.LiveEasy.LiveEasyAPI.services;

import java.util.List;

import com.LiveEasy.LiveEasyAPI.entity.Payload;

public interface  PayloadService {
	
	public Payload savedetails(Payload payld);
	public Payload getload(long id);
	public List<Payload> getfulldetails();
	public void removeload(long id);
	
	public Payload update(long id,Payload pd);
	
	public List<Payload> getloadwithShipperID();
	

}
