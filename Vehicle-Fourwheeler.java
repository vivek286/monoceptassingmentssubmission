package Vehicle.techlabs.car;

public class Vehicle {
		private static String companyname;
		
		Vehicle(){
			
		}
		Vehicle(String companyname){
			Vehicle.companyname=companyname;
		}
		
		public static String getCompanyName() {
			return Vehicle.companyname;
		}
}
--------------------------------------------------------------------------------------------------------------
  
  package Vehicle.techlabs.car;

public class FourWheeler extends Vehicle{
			private static float mileage;
			
			FourWheeler(){
				
			}
			FourWheeler(String companyname,float mileage){
				super(companyname);
				FourWheeler.mileage=mileage;
				
				
			}
			public static float getMileage() {
				return mileage;
			}
}
-------------------------------------------------------------------------------------------------------------
  
  
  package Vehicle.techlabs.car;

public class Car extends FourWheeler {
		private static int price;
		
		Car(){
			
		}
		
		Car(String companyname,float mileage,int price){
			super(companyname,mileage);
			Car.price=price;
		}

		public static int getPrice() {
			return price;
		}

		public static void setPrice(int price) {
			Car.price = price;
		}
		
		
}
-------------------------------------------------------------------------------
  
  
  
  package Vehicle.techlabs.car;

public class TestVehicleClass {

	public static void main(String[] args) {
		Car car=new Car("Hero",1212,666);
		System.out.println("Company name is:-"+car.getCompanyName());
		System.out.println("Car mileage is"+car.getMileage());
		System.out.println("Car price is:- "+ car.getPrice());
	}

}
