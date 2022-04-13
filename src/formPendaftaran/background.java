package formPendaftaran;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class background extends JPanel {
    private Image image;
    
    public background() {
        image = new ImageIcon(getClass().getResource("unindranew.jpg")).getImage();
    }
    
    @Override 
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
        Graphics2D pict = (Graphics2D) grphcs.create();
        pict.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        pict.dispose();      
    }
}
