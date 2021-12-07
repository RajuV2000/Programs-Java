package com.xworkz.cloneable;

import com.xworkz.cloneable.bottle.BottleDto;
import com.xworkz.cloneable.canteen.Canteen;
import com.xworkz.cloneable.hospitals.Hospitals;
import com.xworkz.cloneable.institutes.Institutes;
import com.xworkz.cloneable.laptop.Laptop;
import com.xworkz.cloneable.mobiles.Mobile;
import com.xworkz.cloneable.pens.Pen;
import com.xworkz.cloneable.showrooms.Showroom;
import com.xworkz.cloneable.stadium.Stadium;
import com.xworkz.cloneable.travelAgency.TravelAgency;

public class Commence {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BottleDto bottle = new BottleDto();
		bottle.setName("Sprite");
		bottle.setType("Cooldrink");
		bottle.setSize(2);
		bottle.setPrice(25);
		bottle.setMake("Plastic");
		
		BottleDto bottle1 = (BottleDto)bottle.clone();
		System.out.println(bottle1);
		
		Canteen canteen = new Canteen();
		canteen.setName("Sai Dosa Center");
		canteen.setLoc("Prakash Nagar");
		canteen.setNoOfDishes(60);
		canteen.setAvgPrice(60);
		canteen.setCrowd(true);
		
		Canteen canteen1 =(Canteen) canteen.clone();
		System.out.println("\n"+canteen1);
		
		Hospitals hos = new Hospitals();
		hos.setName("JC Hospital");
		hos.setLocation("Teerthalli");
		hos.setType("General");
		hos.setBeds(100);
		hos.setContactNum(8036542318l);
		
		Hospitals hos1 =(Hospitals)hos.clone();
		System.out.println("\n"+hos1);
		
		Institutes ins = new Institutes();
		ins.setName("X-workz");
		ins.setLocation("Rajajinagar");
		ins.setType("Software Development");
		ins.setStrength(80);
		ins.setContactNum(9986667354l);
		
		Institutes ins1 = (Institutes)ins.clone();
		System.out.println("\n"+ins1);
		
		Laptop pc = new Laptop();
		pc.setBrand("HP");
		pc.setModelNum(45684224l);
		pc.setProcessor("core i3");
		pc.setGeneration(7);
		pc.setPrice(36000);
		
		Laptop pc1 = (Laptop)pc.clone();
		System.out.println("\n"+pc1);
		
		Mobile mbl = new Mobile();
		mbl.setBrand("Realme");
		mbl.setModel("C3");
		mbl.setOperatingSys("Andriod");
		mbl.setStorage(64);
		mbl.setPrice(9000);
		
		Mobile mbl1 = (Mobile)mbl.clone();
		System.out.println("\n"+mbl1);
		
		Pen pen = new Pen();
		pen.setBrand("Reynolds");
		pen.setType("Ballpen");
		pen.setColor("Black");
		pen.setSerNum(465321);
		pen.setPrice(5);
		
		Pen pen2 = (Pen) pen.clone();
		System.out.println("\n"+pen2);
		
		Showroom sh = new Showroom();
		sh.setName("Honda");
		sh.setType("Bike Showrrom");
		sh.setCollections(15);
		sh.setLocation("Nagarahalli");
		sh.setContact(6354759832l);
		
		Showroom sh1 = (Showroom) sh.clone();
		System.out.println("\n"+sh1);
		
		Stadium std = new Stadium();
		std.setName("Apj Abdul Kalam Stadium");
		std.setCapacity(10000);
		std.setGates(3);
		std.setLocation("Shimogga");
		std.setOutdoor(true);
		
		Stadium std1 = (Stadium) std.clone();
		System.out.println("\n"+std1);
		
		TravelAgency ta = new TravelAgency();
		ta.setName("Mathrusri");
		ta.setNoOfPackages(8);
		ta.setAvgPrice(30000);
		ta.setContactNum(7354236598l);
		ta.setLoc("Gopala");
		
		TravelAgency ta2 = (TravelAgency)ta.clone();
		System.out.println("\n"+ta2);
	}
}
