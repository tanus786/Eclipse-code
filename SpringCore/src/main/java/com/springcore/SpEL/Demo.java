package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{121+76}")
	private int x;
	
	@Value("#{T(java.lang.Math).PI}")
	private double y;

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{ new java.lang.String('Tanu Soni')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean temp;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTemp() {
		return temp;
	}

	public void setTemp(boolean temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", temp=" + temp + "]";
	}



}
