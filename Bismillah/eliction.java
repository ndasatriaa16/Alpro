import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

class eliction extends JFrame{
// banyak halaman dan halaman apa saja
    final static String Menu_Home = "Menu Home";
    final static String Menu_Borong = "Menu Borong";
    final static String Menu_Akun = "Menu Akun";
    

    final static int Lebar_Aplikasi = 360;
    final static int Tinggi_Aplikasi = 720;

    CardLayout pengelolaMenu;

    eliction() {
        this.pengelolaMenu = new CardLayout();

        this.setLayout(this.pengelolaMenu);

        this.setSize(eliction.Lebar_Aplikasi, eliction.Tinggi_Aplikasi);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

        JPanel tampilanHome = new TampilanHome(this);
        this.add(tampilanHome, eliction.Menu_Home);

        JPanel tampilanBorong = new TampilanBorong(this);
        this.add(tampilanBorong, eliction.Menu_Borong);

        JPanel tampilanAkun = new TampilanAkun(this);
        this.add(tampilanAkun, eliction.Menu_Akun);

        this.pindahMenu(this.Menu_Home);

        
    }

    void pindahMenu(String namaMenu) {

        this.pengelolaMenu.show(this.getContentPane(), namaMenu);

        this.setTitle(namaMenu);
    }
    public static void main(String[] args) {

        eliction elictione = new eliction();

    }

}