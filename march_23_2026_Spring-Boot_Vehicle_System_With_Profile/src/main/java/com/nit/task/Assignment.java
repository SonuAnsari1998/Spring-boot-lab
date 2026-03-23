/*✅ Task 2: Vehicle System with @Profile

Step 1: Create Model Class

Vehicle

Fields: id, name, type.

Step 2: Define Interface

VehicleService

Method: getVehicles() returns list of vehicles.

Step 3: Implement Profile-Specific Services

Dev Profile

BikeService (@Profile("dev"))

Returns 2 bikes → e.g., Pulsar, Apache.

Test Profile

CarService (@Profile("test"))

Returns 2 cars → e.g., Swift, Innova.

Prod Profile

TruckService (@Profile("prod"))

Returns 2 trucks → e.g., Tata Truck, Ashok Leyland.

Step 4: 


Autowire VehicleService.

Print the vehicles on startup.

Output changes with profile.*/
