import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		 
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		//set the color
		g.setColor(new Color(red, green, blue));
		
		
		//the partial work - what each method does
		//draws a circle
		g.drawOval(x, y, width, width);
		
		//what is the base case?
		if(width <= 0) {
			return;
		}else {
			//recursive call
			concentricCircles(g, width-20, x+10, y+10);//top left

		}
	}
	public void squares(Graphics g, int width, int x, int y) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		//set the color
		g.setColor(new Color(red, green, blue));
		g.fillRect(x,  y,  width, width);
		
		//when does the program not call itself?
		if(width>0) {
			//it only calls it recursively if the width is not 0!
			squares(g, width/3, x-width, y-width);//left top
			squares(g, width/3, x+width/3, y-width);//middle top
			squares(g, width/3, (int)(x+width+width/1.5), y-width);//right top
			squares(g, width/3, x-width, y+width/3); //left middle
			squares(g, width/3, (int)(x+width+width/1.5), y+width/3); //right middle
			squares(g, width/3, x-width, (int)(y+width+width/1.5)); //left bottom
			squares(g, width/3, x+width/3, (int)(y+width+width/1.5));
			squares(g, width/3, (int)(x+width+width/1.5), (int)(y+width+width/1.5));
		}
		
	
	}
	
	
	public void clover(Graphics g, int width, int x, int y) { //What additional variables will you need to draw the shape?
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		//set the color
		g.setColor(new Color(red, green, blue));
		
		
		//the partial work - what each method does
		//draws a circle
		g.drawOval(x, y, width, width);
		g.drawOval(x+width, y, width, width);
		g.drawOval(x, y+width, width, width);
		g.drawOval(x+width, y+width, width, width);
		//what is the base case?
		if(width <= 0) {
			return;
		}else {
			//recursive call
			concentricCircles(g, width-20, x+20, y+20);//top left

		}
	}
	
	public void snowflake(Graphics g, int x, int y, int length) {
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		//set the color
		g.setColor(new Color(red, green, blue));
		
		g.drawLine(x, y, (int)(x+length/1.5), y+length);
		g.drawLine(x, y, (int)(x-length/1.5), y+length);
		g.drawLine(x, y, x-length, y);
		g.drawLine(x, y, x+length, y);
		g.drawLine(x, y, (int)(x+length/1.5), y-length);
		g.drawLine(x, y, (int)(x-length/1.5), y-length);
		if(length <= 1) {
			
		}else {
			snowflake(g, (int)(x-length/1.13), (y-length*4/3), length/3);
			snowflake(g, (int)(x+length/1.13), (y-length*4/3), length/3);
			snowflake(g, (x+length*4/3), (y), length/3);
			snowflake(g, (x-length*4/3), (y), length/3);
			snowflake(g, (int)(x-length/1.13), (y+length*4/3), length/3);
			snowflake(g, (int)(x+length/1.13), (y+length*4/3), length/3);
		}
		
	}
	public void triangles(Graphics g, int x, int y, int length, int recur) {
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		//set the color
		//g.setColor(new Color(red, green, blue));
		g.setColor(Color.white);
		if(recur == 0) {
			g.drawLine(x-length/2, y+length, (int)(x+length*(1.5)), y+length);
			g.drawLine(x-length/2, y+length, (int)(x+length*(.5)), y-length);
			g.drawLine((int)(x+length*(.5)), y-length, (int)(x+length*(1.5)), y+length);
			recur++;
		}
		if(recur == 1) {
			g.setColor(Color.red);
			
		}
		if(recur == 2) {
			g.setColor(Color.green);
		}
		if(recur == 3) {
			g.setColor(Color.blue);
		}
		if(recur == 4) {
			g.setColor(Color.yellow);
		}
		if(recur == 5) {
			g.setColor(Color.pink);
		}
		if(recur == 6) {
			g.setColor(Color.orange);
		}
		//g.setColor(Color.red);
		g.drawLine(x, y, x+length, y);
		//g.setColor(Color.green);
		g.drawLine(x, y, x+length/2, y+length);
		//g.setColor(Color.blue);
		g.drawLine(x+length, y, x+length/2, y+length);
		
		if(length <= 10) {
			
		}else {
			
			
			
			recur++;
			triangles(g, x-length/4, y+length/2, length/2, recur);
			
			triangles(g, (x+length*3/4), y+length/2, length/2, recur);
			
			triangles(g, (x+length*1/4), y-length/2, length/2, recur);
			
			
		}
		
	}
	
	
		
		
		
		
		
		
		
		
	

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		
		//call the method here!
		//concentricCircles(g, 200, 100, 100);
		//clover(g, 200, 100, 100);
		//squares(g, 200, 300, 300);
		//snowflake(g, 500, 500, 250);
		triangles(g, 500, 500, 250, 0);
		

	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1500,1000);
		f.add(this);
		t.start();
		f.setVisible(true);
		
	}
	Timer t = new Timer(500, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete