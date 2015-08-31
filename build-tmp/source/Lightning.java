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
  strokeWeight(3);
  background(0);
}
int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
int randomColor;
public void draw()
{
	line(startX, startY, endX, endY);

		randomColor = (int)(Math.random()*255);
		stroke(mouseY, mouseX, randomColor);
		while (endY < 301) {
			endX = startX +((int)(Math.random()*10));
			endY = startY +((int)(Math.random()*19)-9);
		}
	if (mousePressed == true) {
		mousePressed();
	}
}
public void mousePressed()
{
	startX = 150;
	startY = 0;
	endX = 150;
	endY = 0;
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
