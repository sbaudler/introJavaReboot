

/*
draw toy
colored rectangle
when mouse clicked: change color
*/

import processing.core.PApplet;

public class Toy extends PApplet implements Drawable, Clickable, MadeIt {
    private int upperLeftX;
    private int upperLeftY; //using upper left corner to position toys //position
    private int width;
    private final int height; //size of toys
    private int red, green, blue; //cOlOrS
    private final PApplet app;

    public Toy(PApplet p, int x, int y, int w, int h){ //what must a toy know?? //this is a constructer, has the same name as a class, fAnCy //factory for instantiating new Toy objects
        // assigning values passed by the toy store to the store
        upperLeftX = x;
        upperLeftY = y;
        width = w;
        height = h; //settin up state for this particular object
        app = p;
        red = (int) random(256);
        green = (int) random(256);
        blue = (int) random(256);

    }
    public void setupToy(){
    }

    public void drawToy(){
        //draws the colored rectangle
        fill(red, green, blue);
        rect(upperLeftX, upperLeftY, width, height);
    }

    public void handleMouseClicked(int x, int y){
        //if the x and y are within the bounding box of the toy
        //a bounding box = regtangular region around a thing
        if (x > (upperLeftX) && x < (upperLeftX + width) &&
                y > (upperLeftY) && y < (upperLeftY + height)){
            doClickAction(x, y);
        }
    }

    public void doClickAction(int x, int y){
        //if the click landed on the rectangle please change the color
        red = (int) random(256);
        green = (int) random(256);
        blue = (int) random(256);

    }
    public void madeIt(){}

    public int getUpperLeftX(){
        return upperLeftX;
    }

    public int getUpperLeftY(){
        return upperLeftY;
    }

    public PApplet getPApplet(){
        return app;
    }
}
