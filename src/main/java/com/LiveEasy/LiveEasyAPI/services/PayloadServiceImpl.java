package com.LiveEasy.LiveEasyAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LiveEasy.LiveEasyAPI.entity.Payload;
import com.LiveEasy.LiveEasyAPI.repository.PayLoadRepo;

import java.util.ArrayList;
import java.util.List;


@Service
public class PayloadServiceImpl implements PayloadService {
	
	@Autowired
	private PayLoadRepo payloadrepo;
	
	public Payload savedetails(Payload payld)
	{
		return payloadrepo.save(payld);
	}
	
	

	@Override
	public Payload getload(long id) {
//	    Payload ans = null;
//		List<Payload> load = new ArrayList<Payload>();
//		payloadrepo.findAll().forEach(load1 -> load.add(load1)); 
//		for(Payload pd : load)
//		{
//			if(pd.getId() == id)
//			{
//				ans = pd;
//				break;
//			}
//		}
//		return ans;
		
		return payloadrepo.findById(id).get();
		
		
	}



	@Override
	public List<Payload> getfulldetails() {
		List<Payload> load = new ArrayList<Payload>();  
		payloadrepo.findAll().forEach(load1 -> load.add(load1));  
		return load; 
		
	}



	@Override
	public void removeload(long id) {
		
		payloadrepo.deleteById(id);
		
	}



	@Override
	public Payload update(long id,Payload pd) {
	
		payloadrepo.deleteById(id);
		payloadrepo.save(pd);
		return pd;
	}

	
	public List<Payload> getloadwithShipperID()
	{  
	   String x = "shipper<23x45>";
	   List<Payload> pd = payloadrepo.getPayloadfromshipperID(x);
	   return pd;
	}
	
	
	
}
