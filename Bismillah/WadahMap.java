import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WadahMap extends JPanel {
    WadahMap(eliction iEliction){
        this.setBorder(new LineBorder(Color.decode("#ffffff"),2));
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setMaximumSize(new Dimension(340,500));
        this.setBackground(Color.decode("#ffffff"));

        JLabel imageMap = new JLabel(new ImageIcon("./map/snazzy-image (1) (1).png"));
        imageMap.setOpaque(true);
        imageMap.setBackground(new Color(255, 255, 255));
        imageMap.setMaximumSize(new Dimension(340,400));

        this.add(imageMap);


    }
}
