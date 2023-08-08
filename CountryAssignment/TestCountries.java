package com.techlabs.countryAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCountries {

	public static void main(String[] args) {
		
		List<Regions> regions=Arrays.asList(
				new Regions(1, "Europe"),
				new Regions(1, "Americas"),
				new Regions(1, "Asia"),
				new Regions(1, "Middle East and Africa"));
		List<Countries> countries=Arrays.asList(
				new Countries("IT", "Italy", 1),
				new Countries("JP", "Japan", 3),
				new Countries("CA", "Canada", 2),
				new Countries("CN", "China", 3),
				new Countries("IN", "India", 3),
				new Countries("AU", "Australia", 3),
				new Countries("ZW", "Zimbabwe",4),
				new Countries("SG", "Singapore", 3),
				new Countries("UK", "United Kingdom", 1),
				new Countries("FR", "France", 1),
				new Countries("DE", "Germany", 1),
				new Countries("ZM", "Zambia", 4),
				new Countries("EG", "Egypt", 4),
				new Countries("BR", "Brazil", 2),
				new Countries("CH", "Switzerland", 1),
				new Countries("NL", "Netherlands", 1),
				new Countries("MX", "Mexico", 2),
				new Countries("KW", "Kuwait", 4),
				new Countries("IL", "Israel", 4),
				new Countries("DK", "Denmark", 1),
				new Countries("HK", "HongKong", 3),
				new Countries("NG", "Nigeria", 4),
				new Countries("AR", "Argentina", 2),
				new Countries("BE", "Belgium", 1)
				);
		
		
//		1. Print countries RegionWise;
		regions.stream().forEach(region->{System.out.println(region.getName()+"->");
			countries.stream()
			.filter(country->country.getRegionId()==region.getId())
			.forEach(country->System.out.println(country.getCountryName()));
		});;

// 2. To get the countries by region code;
		System.out.println("Enter the region code that region countries you wan to print\n"
				+ "1, Europe\n"
				+ "2, Americas\n"
				+ "3. Asia\n"
				+ "4 Middle East and Africa\n");
		Scanner scanner=new Scanner(System.in);
		int code=scanner.nextInt();
		
		countries.stream().filter(country->country.getRegionId()==code).forEach(country->System.out.println(country.getCountryName()));
		
// 3 to print the count of countries in the given region
		
		List<Countries> cnameList=countries.stream().filter(country->country.getRegionId()==code).collect(Collectors.toList());
		System.out.println(cnameList.size());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
