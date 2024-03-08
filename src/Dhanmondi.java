import java.util.ArrayList;

public class Dhanmondi extends City {

    private ArrayList<Doctors> doctors = new ArrayList<>();
    public Dhanmondi(String patientName, int patientAge) {
        super(patientName, patientAge);
    }

    @Override
    public void welcomeMsg() {
        System.out.println("__________Welcome to BestDoctor (Dhanmondi)__________");
    }
}
