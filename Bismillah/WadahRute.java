import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.Container;
public class WadahRute extends JPanel{
    WadahRute(eliction iEliction) {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBorder(new LineBorder(Color.decode("#ffffff"), 10));
        this.setMaximumSize(new Dimension(340, 75));
        this.setBackground(Color.decode("#ffffff"));
                        
   
        String[] pilihan = { "Cikajang", "Cigugur"};
        JComboBox rute = new JComboBox<>(pilihan);
        rute.setBackground(Color.decode("#ffffff"));
        rute.setBorder(new EmptyBorder(getInsets()));
        rute.setMaximumSize(new Dimension(340, 100));   
        
        
        this.add(rute);
    }
}
