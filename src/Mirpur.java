import java.util.ArrayList;

public class Mirpur extends City {

    private ArrayList<Doctors> doctors = new ArrayList<>();
    public Mirpur(String patientName, int patientAge) {
        super(patientName, patientAge);
    }

    @Override
    public void welcomeMsg() {
        System.out.println("__________Welcome to BestDoctor (Mirpur)__________");
    }

}
