import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

public void setup()
{
  size(300,300);
  strokeWeight(.5f);
  background(0, 0, 0);
}
int startX;
int startY = 0;
int endX;
int endY = 0;
int randomColor;
int counter = 0;
public void draw()
{
	if (mousePressed == true){
		startX = mouseX;
		endX = mouseX;
		randomColor = (int)(Math.random()*255);
		stroke(randomColor, mouseX, mouseY);

		while (endY < 301) {
			
			endX = startX + ((int)(Math.random()*12)-6);
			endY = startY + ((int)(Math.random()*5));
			line(startX, startY, endX, endY);
			startX = endX;
			startY = endY;
			
			
		}
		if (counter == 1) {
			background(0);
			counter = 0;
		}
	}
	
}
public void mousePressed()
{
	if (mousePressed == true && mouseButton == LEFT) {
	startX = mouseX;
	startY = 0;
	endX = mouseX;
	endY = 0;

	}
	if (mousePressed == true && mouseButton == RIGHT) {
		counter = 1;
	}
	
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
