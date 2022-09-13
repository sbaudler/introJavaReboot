import processing.core.PApplet;
import processing.core.PImage;

public class EarlGrey extends Toy{ //will maybe draw an image of a bear
    private PImage img;

    private PImage mug;
    int _w;
    int _h;


    public EarlGrey(int x, int y, int w, int h){
        super(x, y, w, h); //telling parent class (toy) to get the same information as this class
        //app = this;
        _w = w;
        _h = h;
    }

    public void setupToy(){
        img = Main.app.loadImage("data/img47c.jpg");
        Main.app.image(img, 100, 25, 800, 250);
        img.resize(_w, _h);

        mug = Main.app.loadImage("data/print-178654635.jpg");
        Main.app.image(mug, 100, 25, 800, 250);
        mug.resize(_w, _h);
    }

    public void drawToy(){
        Main.app.imageMode(Main.app.CORNER); //draw image accodring to upper left corner
        Main.app.image(img, getUpperLeftX(), getUpperLeftY());
    }

    public void doClickAction(int x, int y){
       img = mug;
       madeIt();
    }

    public void madeIt() {
        Main.app.imageMode(Main.app.CORNER);
        Main.app.image(mug, getUpperLeftX(), getUpperLeftY());
    }


}
