package com.autoanotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employe {
		
		Address address;

		
		
		public Address getAddress() {
			return address;
		}
		@Autowired
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public Employe(Address address) {
			super();
			this.address = address;
		}

		public Employe() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employe [address=" + address.city + "]";
		}
}
