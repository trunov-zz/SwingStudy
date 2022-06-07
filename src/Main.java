import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

public class Main {
    public static void main(String[] args) {

        //        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //получить список доступных шрифтов
        //for (String s : fonts){
        //    System.out.println(s);
        //}

        JFrame jFrame = getFrame();
        jFrame.add(new LightBase());

    }

    static class LightBase extends JComponent {

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            g2.setPaint(Color.DARK_GRAY);
            Arc2D topArc = new Arc2D.Double(250, 50, 90, 35, 0, 180, Arc2D.CHORD);
            g2.draw(topArc);
            g2.fill(topArc);

            RoundRectangle2D body = new RoundRectangle2D.Double(230, 75, 130, 320, 20, 20 );
            g2.draw(body);
            g2.fill(body);

            int xtlt[]={160,220,220};
            int ytlt[]={100,100,160};
            Polygon trianglLeftTop = new Polygon(xtlt,ytlt, 3);
            g2.draw( trianglLeftTop);
            g2.fill( trianglLeftTop);

            int xtlc[]={160,220,220};
            int ytlc[]={200,200,260};
            Polygon trianglLeftСenter = new Polygon(xtlc,ytlc, 3);
            g2.draw(trianglLeftСenter);
            g2.fill(trianglLeftСenter);

            int xtld[]={160,220,220};
            int ytld[]={300,300,360};
            Polygon trianglLeftDown = new Polygon(xtld,ytld, 3);
            g2.draw(trianglLeftDown);
            g2.fill(trianglLeftDown);

            int xtrt[]={370,370,430};
            int ytrt[]={100,160,100};
            Polygon trianglRightTop = new Polygon(xtrt,ytrt, 3);
            g2.draw(trianglRightTop);
            g2.fill(trianglRightTop);

            int xtrc[]={370,370,430};
            int ytrc[]={200,260,200};
            Polygon trianglRightCenter = new Polygon(xtrc,ytrc, 3);
            g2.draw(trianglRightCenter);
            g2.fill(trianglRightCenter);

            int xtrd[]={370,370,430};
            int ytrd[]={300,360,300};
            Polygon trianglRightDown = new Polygon(xtrd,ytrd, 3);
            g2.draw(trianglRightDown);
            g2.fill(trianglRightDown);

            RoundRectangle2D downRectangle = new RoundRectangle2D.Double(262.5, 405 ,65, 85, 20, 20);
            g2.fill(downRectangle);
            g2.draw(downRectangle);

            g2.setColor(Color.RED);
            Ellipse2D red = new Ellipse2D.Double(250, 120, 90, 90);
            g2.fill(red);
            g2.draw(red);





        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {}; // создание объёкта окно
        jFrame.setVisible(true); // делаем окно видимым
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //добавляем действие для закрытия
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // получаем
        Dimension dimension = toolkit.getScreenSize(); // разрешение экрана
        jFrame.setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 600); // устанавливаем позицию и размер окна
        jFrame.setTitle("This is my traffic lights"); // заголовок окна
        return jFrame;
    }

}
