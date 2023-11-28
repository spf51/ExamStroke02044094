package Scans;

import java.time.LocalDate;

public class BP {
    public int systP;
    public int diasP;
    public LocalDate scanDate;
    public String duration;

    public BP(int systP, int diasP, LocalDate scanDate, String duration){
        this.systP = systP;
        this.diasP = diasP;
        this.scanDate = scanDate;
        this.duration = duration;

    }

    // Doctors acces:
    // is the access of the this. variables accurate?
    public int[] getBP(){
        int[] BP = new int[2];
        BP[0] = systP;
        BP[1] = diasP;
        return BP;
    }
    // Admin access:
    public String getDuration(){return duration;}
    public LocalDate getScanDate(){return scanDate;}
}
