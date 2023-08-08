package com.techlabs.countryAssignment;

import java.util.List;

public class Regions {
			private int id;
			private String name;
			public Regions(int id, String name) {
				super();
				this.id = id;
				this.name = name;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			@Override
			public String toString() {
				return "Regions [id=" + id + ", name=" + name + "]";
			}
			
			
			
			
			
}
