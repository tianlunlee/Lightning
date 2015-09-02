PImage img;
void setup()
{
  size(300,300);
  strokeWeight(.5);
  background(0, 0, 0);
  img = loadImage("patrick_lightning.PNG");

}
int startX;
int startY = 0;
int endX;
int endY = 0;
int randomColor;
int counter = 0;
void draw()
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
		if (keyPressed == true) {
			image(img, mouseX-130, mouseY-90);
	}
	
}
void mousePressed()
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

