package com.sampolk.a3interfaces;

public class Circle  extends Point implements DrawColor, FillColor {
	
	
	private int radius;
	private int x;
	private  int y;
	
Circle(int x, int y, int radius){
	
	this.radius = radius;
	this.x = x;
	this.y = y;
}
	


public int getX() {
	return x;
	
	
}

public int getY() {
	return y;
	
	
}

public int getRadius() {
	return radius;
	
	
}

public String toString(){
		return "Cirle";
 	
 	
 }

}
