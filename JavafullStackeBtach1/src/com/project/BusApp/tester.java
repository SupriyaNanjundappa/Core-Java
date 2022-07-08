package com.project.BusApp;

public class tester {
	public static void main(String[] args) {
		BusApp bus = new BusApp(); // Object creation
		bus.SlNo=01;
		bus.Name="KSRTC";
		//bus.brand="TATA";
		bus.color= "RED";
		bus.isHornWorking=true;
		bus.price=20000;
		
		System.out.println("Bus number is:"+bus.SlNo);
		System.out.println("Bus Name is:"+bus.Name);
		//System.out.println("Bus brand is:"+bus.brand);
		System.out.println("Bus color is:"+bus.color);
		System.out.println("Bus HornWorking:"+bus.isHornWorking);
		System.out.println("BUs price is:"+bus.price);
		System.out.println("########################################");
		System.out.println("Bus brand is:"+BusApp.brand);
		
		BusApp bus1 = new BusApp();
		bus1.SlNo=02;
		bus1.Name="APSRTC";
		//bus1.brand="TATA";
		bus1.color="Green";
		bus1.isHornWorking= true;
		bus1.price = 40000;
		
	 System.out.println("Bus NUmber is:"+bus1.SlNo);
	 System.out.println("Bus Name is:"+bus1.Name);
	// System.out.println("Bus brand is:"+bus1.brand);
	 System.out.println("Bus color is:"+bus1.color);
	 System.out.println("Bus Horn is:"+bus1.isHornWorking);
	 System.out.println("Bus Price is:"+bus1.price);
	 System.out.println("BUs brand is:"+BusApp.brand);
	}

}
