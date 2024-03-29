package com.jasper.ood.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
	private Date startDate;
	private Date endDate;
	private List<Room> rooms;

	public Reservation(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
		rooms = new ArrayList<>();
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		String res = "Start date is: " + startDate.toLocaleString() + ", End date is: " + endDate.toLocaleString()
				+ ", rooms are: ";

		for (Room room : rooms) {
			res += room.getId() + "; ";
		}
		res += ". ";

		return res;
	}
}