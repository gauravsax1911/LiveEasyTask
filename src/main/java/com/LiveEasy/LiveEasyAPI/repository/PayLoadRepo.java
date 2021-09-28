package com.LiveEasy.LiveEasyAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.LiveEasy.LiveEasyAPI.entity.Payload;

@Repository
public interface PayLoadRepo extends CrudRepository<Payload,Long>{
        
	@Query("select pd FROM Payload pd WHERE pd.shipperID =:pds")
	public List<Payload> getPayloadfromshipperID(@Param("pds") String shipperid);
	
	     
}
