import java.util.ArrayList;
import Scans.MRI;
import Scans.BP;
public class Patient {
    private final String name;
    private String portrait;
    private int age;
    private ArrayList<MRI> mris = new ArrayList<>();
    private ArrayList<BP> bps = new ArrayList<>();
    public Patient(String name, int age, String portrait){
        this.name = name;
        this.age = age;
        this.portrait = portrait;

    }
    public void addMRI(MRI mri){
        mris.add(mri);
    }

    public void addBP(BP bp){
        bps.add(bp);
    }
    public ArrayList<String> getDoctorDisplay(){
        ArrayList<String> doctorDisplay = new ArrayList<>();


        doctorDisplay.add(portrait);
        doctorDisplay.add("Name: " + name + "\n" + " Age: " + age);
        for(MRI mri:mris)
            doctorDisplay.add(mri.getImage());
        for (BP bp:bps)
            doctorDisplay.add( "Blood pressure " + "\n" + bp.getBP()[0] + " over " + bp.getBP()[1] );
        return doctorDisplay;
    }
    public String getAdminDisplay(){
        String adminDisplay = new String();
        // Formated by iterating through the list of patient's multiple scans
        adminDisplay += "Admin Output: " + name + "\n";
        for(MRI mri:mris)
            adminDisplay += " MRI: " + mri.getMagField() + " Tesla, " + mri.getScanDate().toString() + "\n";
        for(BP bp:bps)
            adminDisplay += " BP: " + bp.getDuration() + ", " + bp.getScanDate() + "\n";
        return adminDisplay;
    }



}
