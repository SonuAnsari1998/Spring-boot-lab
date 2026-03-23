package com.nit.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("car")
public class CarService implements VehicleService {

	@Override
	public List<Vehicle> getVehicles() {
		ArrayList<Vehicle> Carlist = new ArrayList<>();
		Carlist.add(new Vehicle(501, "4 wheeler", "Swift"));
		Carlist.add(new Vehicle(502, "4 wheeler", "Innova"));
		return Carlist;
	}

}
