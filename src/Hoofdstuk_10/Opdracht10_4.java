import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_4 extends Applet {

    TextField input;
    TextField jaar;
    Button verify;
    String maand = "-";
    String dagen = "-";

    public void init() {
        verifyButtonListener verifyBL = new verifyButtonListener();
        input = new TextField("Vul een maandnummer in", 12);
        jaar = new TextField("Jaar", 12);
        verify = new Button("Check!");
        verify.addActionListener(verifyBL);

        add(jaar);
        add(input);
        add(verify);


    }

    public void paint(Graphics g) {
        g.drawString("Maand: " + maand + " heeft " + dagen + " dagen.", 50, 60);

    }

    class verifyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = input.getText();
            int maandKiezer = Integer.parseInt(s);

            String j = jaar.getText();
            int jaartalConverter = Integer.parseInt(j);


            //switch
            switch (maandKiezer) {
                case 1:
                    maand = "Januari";
                    dagen = "31";
                    repaint();
                    break;
                case 2:
                    maand = "Februari";
                        if ( (jaartalConverter % 4 == 0 && !(jaartalConverter % 100 == 0)) || jaartalConverter % 400 == 0 ) {
                            dagen = "29";
                        } else { dagen = "28";}
                    repaint();
                    break;
                case 3:
                    maand = "Maart";
                    dagen = "31";
                    repaint();
                    break;
                case 4:
                    maand = "April";
                    dagen = "30";
                    repaint();
                    break;
                case 5:
                    maand = "Mei";
                    dagen = "31";
                    repaint();
                    break;
                case 6:
                    maand = "Juni";
                    dagen = "30";
                    repaint();
                    break;
                case 7:
                    maand = "Juli";
                    dagen = "31";
                    repaint();
                    break;
                case 8:
                    maand = "Augustus";
                    dagen = "31";
                    repaint();
                    break;
                case 9:
                    maand = "September";
                    dagen = "30";
                    repaint();
                    break;
                case 10:
                    maand = "Oktober";
                    dagen = "31";
                    repaint();
                    break;
                case 11:
                    maand = "November";
                    dagen = "30";
                    repaint();
                    break;
                case 12:
                    maand = "December";
                    dagen = "31";
                    repaint();
                    break;


            }


        }
    }


}
