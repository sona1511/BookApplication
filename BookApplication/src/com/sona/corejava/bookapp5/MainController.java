package com.sona.corejava.bookapp5;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {  //1
		int bookId=0;
		String title="";
		double price=0;
		
		Scanner sin=new Scanner(System.in);   //2
		
		System.out.println("Enter Book ID :");
		bookId=sin.nextInt();
		System.out.println("Enter Book Title :");
		title=sin.next();
		System.out.println("Enter Book Price :");
		price=sin.nextDouble();
		
		BookService bookService=new BookService(); //3
		    //16                                       
		int returnValue=bookService.addBookService(bookId, title, price); //4
		//17
		System.out.println("I am in Main controller :Got Value form DAO LAYER :"+returnValue);
		
		
		 

	} //18

} //19
