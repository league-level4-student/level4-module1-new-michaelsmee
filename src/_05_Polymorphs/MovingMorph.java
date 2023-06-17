package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void update() {
		Random rand = new Random();
		int newX = rand.nextInt(900);
		int newY = rand.nextInt(600);
		x = newX;
		y = newY;
    }

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, getWidth(), getHeight());
	}
	
}
