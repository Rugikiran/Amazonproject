package org.datatypes;
import java.util.Scanner;
 class Scannerclass {

		
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
						
			System.out.println("Age  = ");
			byte age=s.nextByte();
			
			System.out.println("ATMPIN = ");
			short atmpin=s.nextShort();
			
			System.out.println("Landline no = ");
			int landline = s.nextInt();
			
			System.out.println("Address");
			String address = s.next();
			
			System.out.println("Your name pls");
			String name=s.next();
			
			System.out.println("----------------------");
			System.out.println("Age  = "+age);
			System.out.println("ATMPIN = "+atmpin);
			System.out.println("Landline no = "+landline);
			System.out.println("Address = "+address);
			System.out.println("Your name pls= " +name);
		} 
		}


