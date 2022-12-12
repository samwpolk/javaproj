package com.sampolk.a3interfaces;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DrawColor[] drawColors = new DrawColor[]
	      { new Rectangle(1, 1, 20, 30) , new Point(100, 100) };
		
		FillColor[] fillColors = new FillColor[] 
		  { new Rectangle(1, 1, 4, 4) , new Circle(0,0,42)};

	
		for (int i = 0; i < drawColors.length; i++){
		drawColors[i].draw(DrawColor.GREEN);
		drawColors[i].penSize(DrawColor.MEDIUM);
		}
		
		
		for (int i = 0; i < fillColors.length; i++){
			fillColors[i].fill(DrawColor.BLACK);
			fillColors[i].rate(FillColor.FAST);
		
			
		}

	}

}
