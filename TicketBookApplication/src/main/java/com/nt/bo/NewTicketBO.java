package com.nt.bo;

public class NewTicketBO {
	
	private String FromPlace;
	private String ToPlace;
	private String Date;
	private int people;
	
	public NewTicketBO() {
		// TODO Auto-generated constructor stub
	}

	public NewTicketBO(String fromPlace, String toPlace, String date, int people) {
		super();
		FromPlace = fromPlace;
		ToPlace = toPlace;
		Date = date;
		this.people = people;
	}



	public String getFromPlace() {
		return FromPlace;
	}
	public void setFromPlace(String fromPlace) {
		FromPlace = fromPlace;
	}
	public String getToPlace() {
		return ToPlace;
	}
	public void setToPlace(String toPlace) {
		ToPlace = toPlace;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "NewTicketBO [FromPlace=" + FromPlace + ", ToPlace=" + ToPlace + ", Date=" + Date + ", people=" + people
				+ "]";
	}

	
	
	

}
