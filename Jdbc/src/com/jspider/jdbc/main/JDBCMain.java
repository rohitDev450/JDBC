package com.jspider.jdbc.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jspider.jdbc.operations.JDBCService;

public class JDBCMain {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("============== Login/SingUp Page ==================\n"
					+ "1.Singup\n2.Login\n3.Exit");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				JDBCService.singUp(scanner);
				break;
			case 2:
				JDBCService.login(scanner);
				break;

			case 3:
				flag = false;
				break;

			default:
				System.out.println("=================== Thank you for Visiting!!!=============");

			}
			
		}
		scanner.close();

	}

}
