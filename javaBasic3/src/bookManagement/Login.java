package bookManagement;

import java.util.Scanner;

public class Login {

	
		public static boolean result() {
			Scanner sc = new Scanner(System.in);
			System.out.print("�缭: ");
			String librarian = sc.nextLine();
			
			System.out.println("ID> ");
			sc.nextLine();
			
			/*
			System.out.print("�缭ID: ");
			int libid = sc.nextInt();
			sc.nextLine();
			System.out.print("PASSWORD: ");
			int libPwd = sc.nextInt();
			sc.nextLine();
			*/

			if(librarian.equals("������")) {
				return true;
			} else return false;
			
			/*
			if(librarian.equals("������")&&libid==0104&&libPwd==5488) {
				return true;
			} else if (librarian.equals("������")&&libid==0000&&libPwd==1111){
				return true;
			} else if (librarian.equals("�̼���")&&libid==2222&&libPwd==3333){
				return true;
			} else return false;
			*/

	}

}

