package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedPolymorph extends Polymorph{

	public RedPolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, getWidth(), getHeight());
	}

    @Override
    public void update() {
        
    }
	

}
