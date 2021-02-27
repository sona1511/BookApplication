	package com.sona.corejava.bookapp5;
	
	import java.util.ArrayList;
	
	public class BookDAO   //11
	{
		                  /**
		                   * 100   corejava 250 C
		                   * @param bookBean
		                   * @return
		                   */
		 public int addBook(BookBean bookBean)  //12
		 {
			 System.out.println("We are in DAO Layer..."); //13
			 ArrayList bookList=new ArrayList();
			 bookList.add(bookBean.getBookId());
			 bookList.add(bookBean.getTitle());
			 bookList.add(bookBean.getPrice());
			 bookList.add(bookBean.getGrade());
			 
			 System.out.println(bookList);
			 
			System.out.println("Book ID :"+bookBean.getBookId());
			System.out.println("BookTitile :"+bookBean.getTitle());
			System.out.println("BookPRice : "+bookBean.getPrice());
			System.out.println("BookGrade :"+bookBean.getGrade());
			 
			 return 1; //14
		 }
	
	}
