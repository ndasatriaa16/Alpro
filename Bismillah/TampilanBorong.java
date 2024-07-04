import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
public class TampilanBorong extends JPanel {
    eliction iEliction;

    TampilanBorong(eliction iEliction) {
        JLabel fiturBorong = new JLabel("Fitur ini sedang dikembangkan");
        fiturBorong.setBorder(new LineBorder(Color.decode("#fffff")));
        fiturBorong.setBackground(Color.decode("#ffffff"));

        this.add(fiturBorong);

        JButton backHome1 = new JButton("Kembali");
        backHome1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            iEliction.pindahMenu("Menu Home");
            }
        });
        
        this.add(backHome1);

        
        

    }
}
