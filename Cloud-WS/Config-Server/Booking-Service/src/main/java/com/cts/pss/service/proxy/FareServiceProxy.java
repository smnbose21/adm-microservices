package com.cts.pss.service.proxy;

import java.time.LocalDate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.pss.entity.Fare;

@FeignClient(name="fare-service", url = "localhost:8081")
public interface FareServiceProxy {

	@GetMapping("api/pss/fare/{flightNumber}/{origin}/{destination}/{flightDate}")
	public Fare getFare(@PathVariable String flightNumber,
						@PathVariable String origin,
						@PathVariable String destination,
						@PathVariable @DateTimeFormat(iso = ISO.DATE) LocalDate flightDate);
}
