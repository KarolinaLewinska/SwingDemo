import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel {
    BufferedImage image;

    public Panel() {
        try {
            image = ImageIO.read(new File("C:/Users/lewin/Desktop/SwingApp/summer.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, null);
        g.setColor(Color.CYAN);
        g.fillRect(10, 10, 100, 50);
    }
}
