import processing.core.PApplet;
import processing.core.PImage;

public class Peppermint extends Toy{

    private PImage img;

    private PImage tea;
    int wid;
    int hei;

    public Peppermint ( int x, int y, int w, int h){
        super( x, y, w, h);
       // app = this;
        wid = w;
        hei = h;
    }

    public void setupToy(){
        img = Main.app.loadImage("data/download-1.jpg");
        Main.app.image(img, 100, 25, 800, 250);
        img.resize(wid, hei);

        tea = Main.app.loadImage("data/hot-cup-of-tea-on-a-saucer-ink-black-and-white-drawing-RW1FJA.jpg");
        Main.app.image(tea, 100, 25, 800, 250);
        tea.resize(wid, hei);
    }

    public void drawToy(){
        Main.app.imageMode(Main.app.CORNER); //draw image accodring to upper left corner
        Main.app.image(img, getUpperLeftX(), getUpperLeftY());
    }

    public void doClickAction(int x, int y){
        img = tea;
        madeIt();
    }

    public void madeIt(){
        Main.app.imageMode(Main.app.CORNER);
        Main.app.image(tea, getUpperLeftX(), getUpperLeftY());

            //theoretically it would turn greyscale but i cannot figure out how to do that

    }
}
