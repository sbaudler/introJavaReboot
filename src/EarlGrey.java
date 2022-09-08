import processing.core.PApplet;
import processing.core.PImage;

public class EarlGrey extends Toy{ //will maybe draw an image of a bear
    private PImage img;

    private PImage mug;
    int _w;
    int _h;


    public EarlGrey(PApplet p, int x, int y, int w, int h){
        super(p, x, y, w, h); //telling parent class (toy) to get the same information as this class
        _w = w;
        _h = h;
    }

    public void setupToy(){
        img = getPApplet().loadImage("data/img47c.jpg");
        getPApplet().image(img, 100, 25, 800, 250);
        img.resize(_w, _h);

        mug = getPApplet().loadImage("data/print-178654635.jpg");
        getPApplet().image(mug, 100, 25, 800, 250);
        mug.resize(_w, _h);
    }

    public void drawToy(){
        getPApplet().imageMode(CORNER); //draw image accodring to upper left corner
        getPApplet().image(img, getUpperLeftX(), getUpperLeftY());
    }

    public void doClickAction(int x, int y){
       img = mug;
       madeIt();
    }

    public void madeIt() {
        getPApplet().imageMode(CORNER);
        getPApplet().image(mug, getUpperLeftX(), getUpperLeftY());
    }


}
