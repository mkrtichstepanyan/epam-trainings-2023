package homework_6.Qnarik_Khachatryan.chapter_8.box_weight;

//Here, Box is extended to include color
class ColorBox extends Box {
    int color; // color of box

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
