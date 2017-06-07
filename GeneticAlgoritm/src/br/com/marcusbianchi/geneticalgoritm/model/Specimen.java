package br.com.marcusbianchi.geneticalgoritm.model;

import java.util.List;

public abstract class Specimen {
	private Chromossome geneticMaterial;
	
	private double Fitness = 0;
	
	public List Alphabet;
	
	public abstract void defineGeneticType();
	
	public abstract void calculateFitness();
	
	public abstract void setAlphabet();	
	
	public abstract Specimen Mutate();
	
	public abstract void generateGeneticMaterial();
	
	public abstract void DoCrossover();
	
	public  Specimen Reproduce(){
		return this;
	}
	
	

}
