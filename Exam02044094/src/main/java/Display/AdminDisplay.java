package Display;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminDisplay {
    // has to just be printed to the console:
    // system.out.print
    protected String adminDisplay;
    public AdminDisplay(String adminDisplay){
        this.adminDisplay = adminDisplay;
        System.out.println(adminDisplay);
}
}
