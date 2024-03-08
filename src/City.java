import java.util.ArrayList;

public abstract class City {
    /*
    initializing String array for the doctor names.
    Right now just best 3 doctors
     */
    private String patientName;
    private int patientAge;

    public City(String patientName, int patientAge) {
        this.patientAge = patientAge;
        this.patientName = patientName;
    }
    /*
    This welcomeMsg() shows a welcome message for every city.
    This msg could be different for each city
     */
    public abstract void welcomeMsg();

    /*
    getter method to access the patient's info
     */
    public String getName() {
        return patientName;
    }
    public int getAge() {
        return patientAge;
    }
//    public abstract ArrayList<Doctors> getDocList();
}
