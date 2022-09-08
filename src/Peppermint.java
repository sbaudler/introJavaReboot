import processing.core.PApplet;
import processing.core.PImage;

public class Peppermint extends Toy{

    private PImage img;

    private PImage tea;
    int wid;
    int hei;

    public Peppermint (PApplet p, int x, int y, int w, int h){
        super(p, x, y, w, h);
        wid = w;
        hei = h;
    }

    public void setupToy(){
        img = getPApplet().loadImage("data/download-1.jpg");
        getPApplet().image(img, 100, 25, 800, 250);
        img.resize(wid, hei);

        tea = getPApplet().loadImage("data/hot-cup-of-tea-on-a-saucer-ink-black-and-white-drawing-RW1FJA.jpg");
        getPApplet().image(tea, 100, 25, 800, 250);
        tea.resize(wid, hei);
    }

    public void drawToy(){
        getPApplet().imageMode(CORNER); //draw image accodring to upper left corner
        getPApplet().image(img, getUpperLeftX(), getUpperLeftY());
    }

    public void doClickAction(int x, int y){
        img = tea;
        madeIt();
    }

    public void madeIt(){
        getPApplet().imageMode(CORNER);
        getPApplet().image(tea, getUpperLeftX(), getUpperLeftY());

            //theoretically it would turn greyscale but i cannot figure out how to do that

    }
}
