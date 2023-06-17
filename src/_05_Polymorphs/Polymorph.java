package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    private int width;
  	private int height;
   
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 this.width = 50;
   	 this.height = 50;
   	 
   	 
   	 
    }
    
    public int getWidth() {
    	return width;
    	
    }
    public int getHeight() {
    	return height;
    }
    public void setWidth(int w) {
    	this.width = w;
    }
    public void setHeight(int h) {
    	this.height = h;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
