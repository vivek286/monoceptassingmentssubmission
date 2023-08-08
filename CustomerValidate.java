package com.techlabs.validate;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Customer {
		private int customerid;
		private String name;
		private String email;
		private String password;
		
		public Customer() {
		
		}
		
		public Customer(int customerid,String name,String email,String password) {
			this.customerid=customerid;
			this.name=name;
			this.email=email;
			this.password=password;
		}
		
		public String toString() {
			return "Customerid is:"+customerid+"\n"+"Name is:"+name+"Email is:"+email+"\n"+
					"passoword is:"+password;
		}
		
		public int getCustomerid() {
			return customerid;
		}
		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public boolean isvalid(String email) {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";
                      
					Pattern pat = Pattern.compile(emailRegex);
					if (email == null)
					    return false;
					return pat.matcher(email).matches();
		}
		
		public  static void sortByNames(Customer customers[],int n) {
			String names[]=new String[n];
			for(int i=0;i<n;i++) {
					names[i]=customers[i].name;
			}
			sortName(names);
			displaynames(names);
		}

		private static void displaynames(String[] names) {
			for(String nam:names) {
				System.out.print(nam+" ");
			}
			
		}

		private static void sortName(String[] names) {
			Arrays.sort(names);
		}
		
		
		
		
		
		
		
}
