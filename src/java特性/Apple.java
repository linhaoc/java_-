package javaÌØÐÔ;

public class Apple {
	private String color;
	private double weight;
	
	public Apple(String color ,double weight) {
		this.color = color;
		
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	public void setweight(double weight) {
		this.weight = weight;
	}
	public double getweight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Apple{"+"color="+color+",weight="+weight+"}";
	}
}
