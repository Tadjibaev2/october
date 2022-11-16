package november.two;

public class Krug {

    double p = 3.14;

    int rad;
    String colour;
    String transparent;

    public Krug(int rad, String colour, String transparent) {
        this.rad = rad;
        this.colour = colour;
        this.transparent = transparent;
    }

    public int getRad() {
        return rad;
    }
    public void setRad(int rad){
        this.rad = rad;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }

    public String getTransparent() {
        return transparent;
    }

}

