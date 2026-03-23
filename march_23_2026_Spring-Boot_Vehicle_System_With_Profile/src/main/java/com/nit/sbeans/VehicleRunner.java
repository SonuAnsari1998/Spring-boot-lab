package com.nit.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class VehicleRunner implements CommandLineRunner {

	@Autowired
	VehicleService vService;

	@Override
	public void run(String... args) throws Exception {
		List<Vehicle> vehicles = vService.getVehicles();
		for(Vehicle v: vehicles) {
			System.out.println(v);
		}
	}
}
