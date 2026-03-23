package com.nit.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("truck")
public class TruckService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		ArrayList<Vehicle> Trucklist = new ArrayList<>();
		Trucklist.add(new Vehicle(701, "18 wheeler", "Tata Truck"));
		Trucklist.add(new Vehicle(802, "12 wheeler", "Ashok Leyland"));
		return Trucklist;
	}

}
