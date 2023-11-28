package Scans;

import java.time.LocalDate;

public class MRI {
    // check scope of public
    // treat img as string for now
    public String image;
    public int magField;
    public LocalDate scanDate;

    public MRI(String image, int magField, LocalDate scanDate){
        this.image = image;
        this.magField = magField;
        this.scanDate = scanDate;

    }

    // Doctors access:
    public String getImage(){return image;}
    // Admin access:
    public int getMagField(){return magField;}
    public LocalDate getScanDate(){return scanDate;}

}
