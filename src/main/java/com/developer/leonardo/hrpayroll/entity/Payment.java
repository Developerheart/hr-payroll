package com.developer.leonardo.hrpayroll.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private BigDecimal dayleIncome;
	private Integer day;

	public Payment() {
	}

	public Payment(String name, BigDecimal dayleIncome, Integer days) {
		this.day = days;
		this.dayleIncome = dayleIncome;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getDayleIncome() {
		return dayleIncome;
	}

	public void setDayleIncome(BigDecimal dayleIncome) {
		this.dayleIncome = dayleIncome;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public BigDecimal getTotal() {
		return this.dayleIncome.multiply(new BigDecimal(day));
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Payment payment = (Payment) o;
		return Objects.equals(name, payment.name) && Objects.equals(dayleIncome, payment.dayleIncome) && Objects.equals(day, payment.day);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, dayleIncome, day);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Payment.class.getSimpleName() + "[", "]")
			.add("name='" + name + "'")
			.add("dayleIncome=" + dayleIncome)
			.add("day=" + day)
			.toString();
	}
}
