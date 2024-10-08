import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class MyPanel extends JPanel {
    int xsize, ysize;
    String title;
    ArrayList<Point> list;

    MyPanel(int xsize, int ysize, String title) {
        this.xsize = xsize;
        this.ysize = ysize;
        this.setPreferredSize(new Dimension(xsize,ysize));
        this.title = title;
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawString(title,xsize / 2, 50);
    }
}
