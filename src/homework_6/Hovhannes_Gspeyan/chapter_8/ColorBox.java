package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * ColorBox class can inherit
 * Box class and include color
 */
public class ColorBox extends Box{
    public int color;

    public ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        this.color = c;
    }
}
