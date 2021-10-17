package com.app.client;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.dto.UserDTO;
import com.app.dto.UserDTO.UserDTOBuilder;
import com.app.model.Address;
import com.app.model.User;

public class Client {
	
	public static void main(String[] args) {
		System.out.println(buildDirector(UserDTO.getBuilder(), new User()));
	}
	
	private static UserDTO buildDirector(UserDTOBuilder builder, User user) {
		Address address  = createAddress();
		return builder.withFirstName("Eren").withLastName("Yeager").withBirthday(LocalDate.of(2000, 10, 10)).withAddress(address).build();
	}
	
	private static Address createAddress() {
		System.out.println("Enter HouseNumber\nStreet\nCity\nState\nZIP");
		Address address = new Address();
		try(Scanner scan = new Scanner(System.in)) {
			address.setHouseNumber(scan.nextLine());
			address.setStreet(scan.nextLine());
			address.setCity(scan.nextLine());
			address.setState(scan.nextLine());
			address.setZipcode(scan.nextLine());
		} 
		return address;
	}

}
