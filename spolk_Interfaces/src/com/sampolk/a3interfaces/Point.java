package com.sampolk.a3interfaces;

public class Point implements DrawColor, FillColor {
	
	private int x;
	private int y;
	
	public Point(){
		
		
	}
	public Point(int x, int y){
		
	this.x = x;
	this.y = y;
		
		
	}
	
	public void draw(int color){
		
		System.out.println("Drawing " + toString() + " with a color of " + color);
		
	}
	
public void fill(int color){
		
		System.out.println("Filling " + toString() + " with a color of " + color);
		
	}


public void rate(int rate) {
	System.out.println("Filling " + toString() + " at a rate of " + rate);
	
}
public void penSize(int size) {
	System.out.println("Pen size for " + toString() +" is " + size);
	
}



    public int getX() {
		return x;
    	
    	
    }
    
    public int getY() {
		return y;
    	
    	
    }
    
    public String toString(){
		return "Point";
    	
    	
    }

	
}
