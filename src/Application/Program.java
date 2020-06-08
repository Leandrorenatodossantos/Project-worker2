package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.Worker;
import Entities.enums.Worklevel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter departament's name: ");
		String departamentname = sc.nextLine();
		System.out.print("Enter worker data: ");
		System.out.print("Nome: ");
		String workername = sc.nextLine();
		System.out.print("Level: ");
		String workerlevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workername, Worklevel.valueOf(workerlevel), baseSalary, new Department(departamentname));
		
		System.out.print("How Many contracts to this worker? ");
		int n = sc.nextInt()
		for (int i = 0; i <= n; i++) {
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
