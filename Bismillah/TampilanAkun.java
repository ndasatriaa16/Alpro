import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class TampilanAkun extends JPanel{

    eliction iEliction;
    TampilanAkun(eliction iEliction) {
         JLabel fiturAkun = new JLabel("Fitur ini sedang dikembangkan");
        fiturAkun.setBorder(new LineBorder(Color.decode("#fffff")));
        fiturAkun.setBackground(Color.decode("#ffffff"));

        this.add(fiturAkun);

        JButton backHome2 = new JButton("Kembali");
        backHome2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            iEliction.pindahMenu("Menu Home");
            }
        });
        
        this.add(backHome2);

        
    }


    
}
