// Write a java program to demonstrate 2D shapes on frame.

import java.awt.*;
import javax.swing.*;

public class DrawingCanvas extends Canvas {
	public DrawingCanvas() {

	}

	public void paint(Graphics graphics) {
		// Filled Rext with a Color
		graphics.setColor(Color.YELLOW);
		graphics.fillRect(10, 10, 100, 100);
		graphics.setColor(Color.RED);
		graphics.drawRect(10, 10, 100, 100);
		graphics.fillOval(50, 50, 100, 100);
		graphics.drawLine(100, 100, 340, 380);
	}

	public static void main(String[] args){
	//sets up the drawing canvas
	DrawingCanvas canvas = new DrawingCanvas();
	// Create new windows
	JFrame frame = new JFrame();
	//Set Window Size
	frame.setSize(500,500);
	//Make Sure frame.setDefaultColseOperation(JFrame.EXIT_ON_CLOSE);
	// Draw to Canvas
	frame.getContentPane().add(canvas);
	// Show Window
	frame.setVisible(true);
}
}
