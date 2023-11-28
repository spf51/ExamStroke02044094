// import scans

import Display.DoctorDisplay;
import Display.AdminDisplay;
import Scans.MRI;
import Scans.BP;

import javax.print.Doc;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        Patient patient1 = new Patient("Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        Patient patient2 = new Patient("Sebastian Compton ", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");

        patient1.addMRI(new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023,9,14)));
        patient1.addBP(new BP(130, 70,LocalDate.of(2023,9,15), "ST"));

        patient2.addMRI(new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023,11,19)));
        patient2.addBP(new BP(150, 80, LocalDate.of(2023,11,20), "VST"));
        patient2.addBP(new BP(1200, 0, LocalDate.now(), "VST"));

        JPanel DoctorDisplay = new DoctorDisplay(patient1.getDoctorDisplay()).DoctorDisplay();
        new AdminDisplay(patient1.getAdminDisplay());

        JPanel DoctorDisplay2 = new DoctorDisplay(patient2.getDoctorDisplay()).DoctorDisplay();
        new AdminDisplay(patient2.getAdminDisplay());


    }

}