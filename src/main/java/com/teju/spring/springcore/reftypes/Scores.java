package com.teju.spring.springcore.reftypes;

public class Scores {
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", Hindi=" + Hindi + ", English=" + English + "]";
	}
	private Double maths;
	private Double Hindi;
	private Double English;
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getHindi() {
		return Hindi;
	}
	public void setHindi(Double hindi) {
		Hindi = hindi;
	}
	public Double getEnglish() {
		return English;
	}
	public void setEnglish(Double english) {
		English = english;
	}
}
