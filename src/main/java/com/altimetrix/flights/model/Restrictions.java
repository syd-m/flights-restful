package com.altimetrix.flights.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restrictions {
	private String refundable;
	@JsonProperty("change_penalties")
	private String changePenalties;

	public String getRefundable() {
		return refundable;
	}

	public void setRefundable(String refundable) {
		this.refundable = refundable;
	}

	public String getChangePenalties() {
		return changePenalties;
	}

	public void setChangePenalties(String changePenalties) {
		this.changePenalties = changePenalties;
	}

	@Override
	public String toString() {
		return "Restrictions [refundable=" + refundable + ", changePenalties=" + changePenalties + "]";
	}
}
