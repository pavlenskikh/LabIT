package school;

/**
 * Created by User on 25.10.2017.
 */
public class Penal {
    private Eraser eraser;
    private Pen pen;
    private Ruler ruler;
    private Pencil pencil;

    public Penal(Eraser eraser, Pen pen, Ruler ruler, Pencil pencil) {
        this.eraser = eraser;
        this.pen = pen;
        this.ruler = ruler;
        this.pencil = pencil;
    }

    public Eraser getEraser() {
        return eraser;
    }

    public void setEraser(Eraser eraser) {
        this.eraser = eraser;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Ruler getRuler() {
        return ruler;
    }

    public void setRuler(Ruler ruler) {
        this.ruler = ruler;
    }

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
}
