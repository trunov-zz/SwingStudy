import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Snowman extends JComponent {


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gSnow = (Graphics2D) g;
        gSnow.setColor(Color.white);

        RoundRectangle2D hatTop = new RoundRectangle2D.Double(250, 40, 60, 70, 15, 15);
        //gSnow.fill(hatTop);
        gSnow.draw(hatTop);
        Ellipse2D hatDown = new Ellipse2D.Double(235, 100, 90, 20);
        //gSnow.fill(hatDown);
        gSnow.draw(hatDown);




    }
}


