import java.util.ArrayList;

public class Gulshan extends City {

    private ArrayList<Doctors> doctors = new ArrayList<>();
    public Gulshan(String patientName, int patientAge) {
        super(patientName, patientAge);
    }

    /*
    initializing String array for the doctor names.
    Right now just best 3 doctors
     */
    @Override
    public void welcomeMsg() {
        System.out.println("__________Welcome to BestDoctor (Gulshan)__________");
    }
}
