package homework_6.gevorg_arghushyan.chapter_8;

import java.awt.*;

public class Image1 {

    // pointer to the native image data
    private int nativeImg;
    private Point pos;
    private Dimension dim;

    // it disposes of the native image;
    // successive calls to it will be ignored
    private native void disposeNative();
    public void dispose() { disposeNative(); }
    protected void finalize() {randomImg = this; }

    static private Image1 randomImg;

    public static void main(String[] args) {
        System.out.println();
    }
}