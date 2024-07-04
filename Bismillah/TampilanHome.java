import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Color;

import javax.swing.border.EmptyBorder;



class TampilanHome extends JPanel {
    
    eliction iEliction;
    TampilanHome(eliction iEliction) {

        this.iEliction = iEliction;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.decode("#A0E8FF"));


        JPanel wadahContent = new JPanel();
        
        wadahContent.setBorder(new EmptyBorder(215,5,0,5) );
        wadahContent.setLayout(new BoxLayout(wadahContent, BoxLayout.Y_AXIS));
        wadahContent.setBackground(Color.decode("#A0E8FF"));

        JPanel wadahRute = new WadahRute(this.iEliction);
        wadahContent.add(wadahRute);
        this.add(wadahContent);
        
        JPanel wadahMap = new WadahMap(this.iEliction);
        wadahContent.add(wadahMap);
        this.add(wadahContent);
        
        JPanel wadahButton = new WadahButton(this.iEliction);
        wadahContent.add(wadahButton);
        this.add(wadahButton);

        
         
    
    }


}
