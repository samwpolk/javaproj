package com.sampolk.a3interfaces;

public class Rectangle extends Point implements DrawColor, FillColor  {
	
	private int height;
	private int width;
	private int x;
	private  int y;
	

	public Rectangle(int x, int y) {
		super(x, y);
		
	}
	
     public Rectangle(int x, int y, int height, int width){
    	 
    	 this.x = x;
    	 this.y = y;
    	 this.height = height;
    	 this.width = width;
		
		
		
	}


	public void draw(int color) {
		
		System.out.println("Drawing " + toString() + " with a color of " + color);
		

	}
	
	
	
	  public int getX() {
			return x;
	    	
	    	
	    }
	    
	  public int getY() {
			return y;
	    	
	    	
	    }
	  
	  public int getHeight() {
			return height;
	    	
	    	
	    }
	  

	  public int getWidth() {
			return width;
	    	
	    	
	    }
	  
	    public String toString(){
			return "Rectangle";
	    	
	    	
	    }
		
	

	    
	    
	    

}
