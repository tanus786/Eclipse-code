package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Students {
	@Value("Tanu")
	private String name;
	
	@Value("Delhi")
	private String city;
	
	@Value("#{address}")
	private List<String> addresses;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", city=" + city + ", addresses=" + addresses + "]";
	}

}
