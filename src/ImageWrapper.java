abstract class ImageWrapper {

    private int upperLeftX;
    private int upperLeftY; //using upper left corner to position toys //position
    private int width;
    private int height; //size of toys
    private int red, green, blue;

    public int getUpperLeftX(){
        return upperLeftX;
    }

    public void setUpperLeftX(int x){
        this.upperLeftX = x;
    }

    public int getUpperLeftY(){
        return upperLeftY;
    }

    public void setUpperLeftY(int y){
        this.upperLeftY = y;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getRed(){
        return red;
    }

    public void setRed(int red){
        this.red = red;
    }

    public int getGreen(){
        return green;
    }

    public void setGreen(int green){
        this.green = green;
    }

    public int getBlue(){
        return blue;
    }

    public void setBlue(int blue){
        this.blue = blue;
    }

}
