
import processing.core.PImage;

public class Cookie extends Toy{

    private PImage cookie;

    int wi;
    int he;

    public Cookie(int x, int y, int w, int h){
        super(x, y, w, h);
        wi = w;
        he = h;
    }

    public void setupToy(){
        cookie = Main.app.loadImage("data/tea-madeleines.jpg");
        Main.app.image(cookie, 100, 25, 800, 250);
        cookie.resize(wi, he);
    }

    public void drawToy(){
        Main.app.imageMode(Main.app.CORNER); //draw image accodring to upper left corner
        Main.app.image(cookie, getUpperLeftX(), getUpperLeftY());
    }


}
