package com.cts.pss.service.proxy;

import java.time.LocalDate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.pss.entity.Flight;

@FeignClient(name="api-gateway")
public interface SearchServiceProxy {

	
	@GetMapping("/search-service/api/pss/search/find/{origin}/{destination}/{flightDate}/{flightNumber}")
	public Flight findAllFlightsV2(@PathVariable String origin, @PathVariable String destination,
			@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate, @PathVariable String flightNumber);


}
