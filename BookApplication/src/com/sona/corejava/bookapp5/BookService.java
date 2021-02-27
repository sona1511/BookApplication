	package com.sona.corejava.bookapp5;
	public class BookService  //6
	{
		                           /**
		                            *  100      corejava       250   
		                            * @param bookId
		                            * @param title
		                            * @param price
		                            * @return
		                            */
		public int addBookService(int bookId,String title,double price) //7
		{  System.out.println("I am in Service Layer..");  //8
			String grade="";
			if(price<=300)
			{
				grade="C";
				}
			else if(price<=600)
			{
				grade="B";
			}
			else
			{
				grade="A"; }
			BookDAO bookDAO=new BookDAO(); // 8 
			BookBean bookBean=new BookBean(); //9
			         bookBean.setBookId(bookId);
			         bookBean.setTitle(title);
			         bookBean.setPrice(price);
			         bookBean.setGrade(grade);
			    //15
			int getValueDAO=bookDAO.addBook(bookBean); //10
			
			
			
			
			return 1;
			
			
			
		}
	
	}
