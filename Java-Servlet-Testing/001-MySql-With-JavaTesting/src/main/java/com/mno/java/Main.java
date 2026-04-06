package com.mno.java;
import com.mno.java.dao.UsersDao;
public class Main {

	public static void main(String[] args) {
		UsersDao test = new UsersDao();
//		test.insertData("kk", "kk@gmail.com");
//		test.insertData("uu", "uu@gmail.com");
		test.readData();
//		test.updateData("oo", "oo@gmail.com",3);
		test.deleteData(3);
		System.out.println("==================");
		test.readData();
	}

}
