package Display;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class DoctorDisplay {
    protected ArrayList<String> doctorDisplay;
    public DoctorDisplay(ArrayList<String> doctorDisplay) {
        this.doctorDisplay = doctorDisplay;
    }

    public JPanel DoctorDisplay() throws IOException {
        JFrame frame = new JFrame("Doctor");
        frame.setSize(450,400);
        JPanel displayPanel = new JPanel();


        URL portraitURL = new URL(doctorDisplay.get(0));

        URL mriScanURL = new URL(doctorDisplay.get(2));

        BufferedImage portrait = ImageIO.read(portraitURL);
        BufferedImage mriScan = ImageIO.read(mriScanURL);


        //// Create a label for each patient's text
        // Label1 portrait URL
        JLabel displayLabel1 = new JLabel(new ImageIcon(portrait));
        // Label2 Name and Age
        JLabel displayLabel2 = new JLabel(doctorDisplay.get(1));
        // Label3 MRI Photo
        JLabel displayLabel3 = new JLabel(new ImageIcon(mriScan));
        // Label4 Blood Pressure
        JLabel displayLabel4 = new JLabel(doctorDisplay.get(3));


        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);
        displayPanel.add(displayLabel3);
        displayPanel.add(displayLabel4);


        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        return displayPanel;
    }
}
