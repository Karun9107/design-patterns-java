package com.app.client;

import java.util.Scanner;

import com.app.factory.PostFactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("Enter the product type");
		try(Scanner scan = new Scanner(System.in)) {
			// valid inputs: news, blog, post
			System.out.println("You have created a post of type" + PostFactory.createPost(scan.nextLine()).getClass().getName());
		}
	}

}
