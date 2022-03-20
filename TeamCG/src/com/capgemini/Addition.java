package com.capgemini;
class Bik{
	private int v;

	public Bik(int v) {
		super();
		this.v = v;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
}

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		System.out.println(obj.add(5,6));
		System.out.println(obj.add(2,5,4));
	}
	///compile time polymorphism, method overloading
	public int add(int i, int j) {
		int k= i+j;
		return k;
	}
	public int add(int i, int j,int l) {
		int k= i+j+l;
		return k;
	}

}
