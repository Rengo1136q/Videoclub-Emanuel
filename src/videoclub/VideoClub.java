package videoclub;

import View.ViewPantallaPrincipal;
import View.ViewJFramePrincipal;
import javax.swing.JFrame;
import videoclub.VideoClub;

public class VideoClub {

    public static void main(String[] args) {

        //ViewPantallaPrincipal.MnuPrincipal();
        JFrame pantalla = new ViewJFramePrincipal();
        pantalla.setVisible(true);

    }

}
