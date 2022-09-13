import processing.core.PApplet;
import processing.core.PImage;

public class Jasmine extends Toy { //will maybe draw an image of a bear
    private PImage img;

    private PImage cup;
    int _w;
    int _h;

    public Jasmine( int x, int y, int w, int h){
        super( x, y, w, h); //telling parent class (toy) to get the same information as this class
        _w = w;
        _h = h;
    }

    public void setupToy(){
        img = Main.app.loadImage("data/myTEAimages.jpg");
        Main.app.image(img, 100, 25, 800, 250);
        img.resize(_w, _h);

        cup = Main.app.loadImage("data/istockphoto-1290181267-612x612.jpg");
        Main.app.image(cup, 100, 25, 800, 250);
        cup.resize(_w, _h);
    }

    public void drawToy(){
        Main.app.imageMode(Main.app.CORNER); //draw image accodring to upper left corner
        Main.app.image(img, getUpperLeftX(), getUpperLeftY());
    }

    public void doClickAction(int x, int y){
        img = cup;
        madeIt();
    }

    public void madeIt() {
        Main.app.imageMode(Main.app.CORNER);
        Main.app.image(cup, getUpperLeftX(), getUpperLeftY());
    }


}
