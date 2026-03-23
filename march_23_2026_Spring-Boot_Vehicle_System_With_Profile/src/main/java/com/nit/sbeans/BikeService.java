package com.nit.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("bike")
public class BikeService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		ArrayList<Vehicle> Bikelist = new ArrayList<>();
		Bikelist.add(new Vehicle(101, "2 wheeler", "Pulsar"));
		Bikelist.add(new Vehicle(102, "2 wheeler", "Apache"));
		return Bikelist;
	}
}
