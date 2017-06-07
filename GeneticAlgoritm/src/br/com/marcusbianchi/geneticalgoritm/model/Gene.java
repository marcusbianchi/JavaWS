package br.com.marcusbianchi.geneticalgoritm.model;

//Creates a genericType of Gene
public class Gene<T> {
	private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }

}
