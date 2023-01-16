package javaBasic2.ch05.day2;

import java.util.Scanner;

public class k {


		
			
			 static void input(Banchan0 input) { //입력 메소드
					System.out.println("input");
					System.out.println("--------------");
					
					Scanner sc=new Scanner(System.in);
					System.out.println("kind> ");
					String kind1 =sc.next();
					System.out.println("make> ");
					input.make1=sc.nextInt();
					System.out.println("sale> ");
					input.sale1=sc.nextInt();
					System.out.println("last>"+input.last);
					
					
				}
				
				public static void main(String[] args) {
					//
					
					
					Banchan0 input1=new Banchan0();
					input(input1);
					Banchan0 input2=new Banchan0();
					input(input2);
					Banchan0 input3=new Banchan0();
					input(input3);
					
					System.out.println("kind"+" "+"make"+" "+"sale"+" "+"last");
					System.out.println("--------------------------------------");
					System.out.println(input1.kind1+input1.make1+input1.sale1+input1.last);
					System.out.println(input2.kind1+input2.make1+input2.sale1+input2.last);
					System.out.println(input3.kind1+input3.make1+input3.sale1+input3.last);
					
					System.out.println();
//					System.out.println("best> "+input.);
					
					//%
					int getlast1=input1.make1/input1.sale1;
					int getlast2=input2.make1/input2.sale1;
					int getlast3=input2.make1/input2.sale1;
					
					//best
					if (getlast1>getlast2 && getlast1>getlast3) {
						System.out.println("best> "+input1.kind1);
					} else if(getlast2>getlast1 && getlast2>getlast3) {
						System.out.println("best> "+input2.kind1);
					}else {
						System.out.println("best> "+input3.kind1);
					}
					
					//worst
					if (getlast1<getlast2 && getlast1<getlast3) {
						System.out.println("worst> "+input1.kind1);
					} else if(getlast2<getlast1 && getlast2<getlast3) {
						System.out.println("worst> "+input2.kind1);
					}else {
						System.out.println("worst> "+input3.kind1);
					}
					

				}//메인 끝

			}//클래스 끝


			class Banchan0{
				public int kind1;
				int make1=0;
				int sale1=0;
				int last=make1-sale1;
				int getlast1=make1/sale1;
			}