package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MousePolymorph extends Polymorph implements MouseMotionListener{

	public MousePolymorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(x, y, getWidth(), getHeight());
	}

    @Override
    public void update() {
        
    }
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getXOnScreen();
		int y = e.getYOnScreen();
	}
	
}
