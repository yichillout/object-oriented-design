package com.jasper.ood.restaurant;

public class NoTableException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoTableException(Party p) {
		super("No table available for party size: " + p.getSize());
	}
}
