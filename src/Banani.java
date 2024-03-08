import java.util.ArrayList;

public class Banani extends City {

    private ArrayList<Doctors> doctors = new ArrayList<>();
    public Banani(String patientName, int patientAge) {
        super(patientName, patientAge);
    }

    @Override
    public void welcomeMsg() {
        System.out.println("\"__________Welcome to BestDoctor (Banani)__________\"");
    }
}
