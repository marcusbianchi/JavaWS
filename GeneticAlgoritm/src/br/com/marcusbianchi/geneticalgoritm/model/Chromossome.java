package br.com.marcusbianchi.geneticalgoritm.model;

import java.util.ArrayList;

public class Chromossome<T> {
	private ArrayList<Gene<T>> Genes;

	private T t;

	public Chromossome() {
		setGenes(new ArrayList<Gene<T>>());
	}
	
	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}


	private ArrayList<Gene<T>> getGenes() {
		return Genes;
	}

	private void setGenes(ArrayList<Gene<T>> genes) {
		Genes = genes;
	}

}
