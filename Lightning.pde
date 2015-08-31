void setup()
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
void draw()
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
void mousePressed()
{
	startX = 150;
	startY = 0;
	endX = 150;
	endY = 0;
}

