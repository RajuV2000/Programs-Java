package com.xworkz.gymapp.dto;

public class EquipmentsDTO {
		public EquipmentsDTO() {
			// TODO Auto-generated constructor stub
			System.out.println(this.getClass().getSimpleName() + " object is created...");
		}
		
		private String eqpName;
		private int eqpWeight;
		private int eqpPrice;
		
		public String getEqpName() {
			return eqpName;
		}
		public void setEqpName(String eqpName) {
			this.eqpName = eqpName;
		}
		public int getEqpWeight() {
			return eqpWeight;
		}
		public void setEqpWeight(int eqpWeight) {
			this.eqpWeight = eqpWeight;
		}
		public int getEqpPrice() {
			return eqpPrice;
		}
		public void setEqpPrice(int eqpPrice) {
			this.eqpPrice = eqpPrice;
		}
		@Override
		public String toString() {
			return "EquipmentsDTO [eqpName=" + eqpName + ", eqpWeight=" + eqpWeight + ", eqpPrice=" + eqpPrice + "]";
		}
		
		
		
}
