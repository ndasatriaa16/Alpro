import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
public class WadahButton extends JPanel {
    WadahButton(eliction iEliction) {
        this.setBorder(new LineBorder(Color.decode("#29446B"), 5));
        this.setMaximumSize(new Dimension(360,85));
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(Color.decode("#ffffff"));

        JButton ikonHome = new JButton(new ImageIcon("./map/image 4.png") );
        setBackground(Color.decode("#ffffff"));
        setBorder(new LineBorder(Color.decode("#29446B"),2));
        ikonHome.setBackground(new Color (255,255,255));
        ikonHome.setBorder(new EmptyBorder(0,35,0,55));
        ikonHome.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent e) {
                iEliction.pindahMenu("Menu Home");
            }
        }); 
        

        this.add(ikonHome);

        JButton ikonBorong = new JButton(new ImageIcon("./map/image 3.png"));
        setBackground(Color.decode("#ffffff"));
        setBorder(new LineBorder(Color.decode("#29446B"),2));
        ikonBorong.setMaximumSize(new Dimension(ikonHome.getPreferredSize()));
        ikonBorong.setBackground(new Color(255,255,255));
        ikonBorong.setBorder(new EmptyBorder(0,0,0,20));
        ikonBorong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iEliction.pindahMenu("Menu Borong");
            }
        });

        this.add(ikonBorong);


        JButton ikonAkun = new JButton(new ImageIcon("./map/image 5.png"));
         setBackground(Color.decode("#ffffff"));
        setBorder(new LineBorder(Color.decode("#29446B"),2));
        ikonAkun.setMaximumSize(new Dimension(ikonHome.getPreferredSize()));
        ikonAkun.setBackground(new Color(255,255,255));
        ikonAkun.setBorder(new EmptyBorder(getInsets()));
        ikonAkun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iEliction.pindahMenu("Menu Akun");
            }
        });

        this.add(ikonAkun);


        


    }
}
