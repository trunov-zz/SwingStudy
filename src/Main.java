import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        //        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //получить список доступных шрифтов
        //for (String s : fonts){
        //    System.out.println(s);
        //}

        JFrame jFrame = getFrame();
        Car m = new Car();
        jFrame.add(m);
        jFrame.setVisible(true);



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
