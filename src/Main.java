import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

private ArrayList<Drawable> toys; //declare the toys array //this is supposed to be a Drawable thing but everytime i try it just breaks and i can't fix

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

        toys = new ArrayList<Drawable>(); //allocating memory for toys array (v important basically making an array with 'null' toys i think)
        int i = 0; //index into the toys array (gaining access to the toys in the array)
        for (int row = 0; row < ROWS; row++){
        for(int column = 0; column < COLUMNS; column++){

        //calculate width, height, and upperleft corner of the toy
        int w = width/COLUMNS;
        int h = height/ROWS;
        int x = (column) * w;
        int y = (row) * h;


        // instnstiating a toy object (bringing toys/bears into the world) (our new child)
        //(for now) half the time we're making an image half the time and the other half of the time we're making a rectangle
        Drawable t;
        if (i < (COLUMNS)){
        t = new EarlGrey(x, y, w, h);
        } else if (i < (COLUMNS) * 2){
        t = new Jasmine(x, y, w, h);
        } else {
        t = new Peppermint (x, y, w, h);
        }


        //adding the toy object to the array
        toys.add(t);
       // toys[i] = t; //toy added to array but the toy is drawing itself like a reflexive verd
        t.setupToy();
        i++;

        if (Main.app.keyPressed == true){
                keyPressed();
        }
        }
        }
        }

public void draw(){
        background(0);

        //iterating over the toy objects in the array and asking each to draw itself (gotta use those reflexive verbs)
        for (int i = 0; i < toys.size(); i++){
                Drawable t = toys.get(i); //get the toy out of the array
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

public void keyPressed(){

        if (key == 's') {

                int l = (toys.size() - 1);
                Drawable first = toys.get(0);
                Drawable last = toys.get(l);

                toys.remove(l);
                toys.remove(0);

                if (first instanceof Toy && last instanceof Toy) {
                        Toy toyfirst = (Toy) first;
                        Toy toylast = (Toy) last;

                        int newLastUpperLeftX = toyfirst.getUpperLeftX();
                        int newFirstUpperLeftX = toylast.getUpperLeftX();

                        toylast.setUpperLeftX(newLastUpperLeftX);
                        toyfirst.setUpperLeftX(newFirstUpperLeftX);

                        int newLastUpperLeftY = toyfirst.getUpperLeftY();
                        int newFirstUpperLeftY = toylast.getUpperLeftY();

                        toylast.setUpperLeftY(newLastUpperLeftY);
                        toyfirst.setUpperLeftY(newFirstUpperLeftY);

                }


                toys.add(0, last);
                toys.add(first);


                last.drawToy();
                first.drawToy();


                System.out.println(toys.toString());
        }

        if (key == 'r'){
                float random = random(toys.size());
                int r = (int) random;
                Drawable cookie;

                Drawable replace = toys.get(r);

                if (replace instanceof Toy){
                   Toy replace1 = (Toy) replace;

                   int newUpperLeftX = replace1.getUpperLeftX();
                   int newUpperLeftY = replace1.getUpperLeftY();
                   int newWidth = replace1.getWidth();
                   int newHeight = replace1.getHeight();

                   cookie = new Cookie(newUpperLeftX, newUpperLeftY, newWidth, newHeight);
                   cookie.setupToy();

                   toys.set(r, cookie);
                   cookie.drawToy();

                   System.out.println(toys.toString());
                }



        }


        }
}