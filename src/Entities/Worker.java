package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.enums.Worklevel;

public class Worker {
	private String name;
	private Worklevel level;
	private Double basesalary;
	
	//assossiaçoes
	private Department department;// o departamento vai receber 1 departamento;
	private List<Hourcontract> contracts = new ArrayList<>(); //1 contrato vai receber uma lista com varios contratos, não inclui no construtor, inicia a lista vazia nas assossiações
	//Construtor
	public Worker() {
	}
	public Worker(String name, Worklevel level, Double basesalary, Department department
			) {
		this.name = name;
		this.level = level;
		this.basesalary = basesalary;
		this.department = department;
		}
	//get e sets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Worklevel getLevel() {
		return level;
	}
	public void setLevel(Worklevel level) {
		this.level = level;
	}
	public Double getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Hourcontract> getContracts() {
		return contracts;
	}
	
	//inicio da formula
	
	public void addContract(Hourcontract contract) {
		contracts.add(contract);
	}
	public void removeContract (Hourcontract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month ) {
		double soma = basesalary;
		Calendar cal = Calendar.getInstance();
		for (Hourcontract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_mont = 1 + cal.get(Calendar.MONTH);		
			if (year == c_year && month == c_mont) {
			soma += c.totalValue();
			}
		}
		return soma;
	}
}
