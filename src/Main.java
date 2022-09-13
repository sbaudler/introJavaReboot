import processing.core.PApplet;

public class Main extends PApplet {

private Drawable[] toys; //declare the toys array //this is supposed to be a Drawable thing but everytime i try it just breaks and i can't fix

public static PApplet app;
final int ROWS = 3; //these are special and they can't be reassigned
final int COLUMNS = 3; //^



public static void main(String[] args){
        PApplet.main("Main");
}

public Main(){
        app = this;
}

public void settings(){
    size(600, 600);
    }


public void setup() {

        toys = new Drawable[ROWS * COLUMNS]; //allocating memory for toys array (v important basically making an array with 'null' toys i think)
        int i = 0; //index into the toys array (gaining access to the toys in the array)
        for (int row = 0; row < ROWS; row++){
        for(int column = 0; column < COLUMNS; column++){

        //calculate width, height, and upperleft corner of the toy
        int w = width/COLUMNS;
        int h = height/ROWS;
        int x = column * w;
        int y = row * h;


        // instnstiating a toy object (bringing toys/bears into the world) (our new child)
        //(for now) half the time we're making an image half the time and the other half of the time we're making a rectangle
        Drawable t;
        if (i < (COLUMNS)){
        t = new EarlGrey( x, y, w, h);
        } else if (i < (COLUMNS) * 2){
        t = new Jasmine(x, y, w, h);
        } else {
        t = new Peppermint (x, y, w, h);
        }


        //adding the toy object to the array
        toys[i] = t; //toy added to array but the toy is drawing itself like a reflexive verd
        t.setupToy();
        i++;
        }
        }
        }

public void draw(){
        background(0);

        //iterating over the toy objects in the array and asking each to draw itself (gotta use those reflexive verbs)
        for (int i = 0; i < toys.length; i++){
                Drawable t = toys[i]; //get the toy out of the array
                t.drawToy(); //toy is drawing itself
        }
}

public void mouseClicked() {
        //ask each little rectangle to test and see weather mouse clicked happen within thier own boundries
        //and then: deal with the mouse clicked if it did (obviously ignore if it is false)
        for (Drawable t : toys) {
                if (t instanceof Clickable) {
                        Clickable clickt = (Clickable) t;
                        clickt.handleMouseClicked(mouseX, mouseY); //method in clas
                }
        }

}
}