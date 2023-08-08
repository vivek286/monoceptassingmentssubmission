package com.techlabs.countryAssignment;

public class Countries {
		private String abbrevation;
		private String countryName;
		private int RegionId;
		public Countries(String abbrevation, String countryName, int regionId) {
			super();
			this.abbrevation = abbrevation;
			this.countryName = countryName;
			RegionId = regionId;
		}
		public String getAbbrevation() {
			return abbrevation;
		}
		public void setAbbrevation(String abbrevation) {
			this.abbrevation = abbrevation;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public int getRegionId() {
			return RegionId;
		}
		public void setRegionId(int regionId) {
			RegionId = regionId;
		}
		@Override
		public String toString() {
			return "Countries [abbrevation=" + abbrevation + ", countryName=" + countryName + ", RegionId=" + RegionId
					+ "]";
		}
		
		
		
		
}
