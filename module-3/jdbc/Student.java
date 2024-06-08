package com.swing.jdbc;


	
public	class Student {
		private int sNo;
		private int id;
		private String name;
		private String gender;
		private String address;
		private String contact;

		public Student() {

		}

		public Student(String name, String gender, String address, String contact) {
			this.name = name;
			this.gender = gender;
			this.address = address;
			this.contact = contact;
		}
		
		public Student(int id, String name, String gender, String address, String contact) {
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.address = address;
			this.contact = contact;
		}

		public Student(int id, String name, String address, String contact) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.contact = contact;
		}

		public void setsNo(int sNo) {
			this.sNo = sNo;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;

		}

		public void setGender(String gender) {
			this.gender = gender;

		}

		public void setAddress(String address) {
			this.address = address;

		}

		public void setContact(String contact) {
			this.contact = contact;

		}

		public int getsNo() {
			return sNo;

		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getGender() {
			return gender;
		}

		public String getAddress() {
			return address;
		}

		public String getContact() {
			return contact;
		}

	}


