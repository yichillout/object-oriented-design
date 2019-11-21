package com.jasper.ood.hotel;

import java.util.Date;

public class SearchRequest {
	private Date startDate;
	private Date endDate;

	public SearchRequest(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	@Override
	public String toString() {
		String res = "Start date is: " + startDate.toLocaleString() + ", End date is: " + endDate.toLocaleString();
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof SearchRequest))
			return false;

		SearchRequest request = (SearchRequest) obj;

		return request.startDate.equals(this.startDate) && request.endDate.equals(this.endDate);
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + startDate.hashCode();
		result = 31 * result + endDate.hashCode();
		return result;
	}
}