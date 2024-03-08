package chatgpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BestDoctor App!");
        System.out.println("We need your name and age. Please fill up this form.");
        System.out.print("Full Name: ");
        String fullName = input.nextLine();
        System.out.print("Age: ");
        int age = input.nextInt();
        input.nextLine(); // Clear the newline character

        City[] cities = {new Dhanmondi(), new Gulshan(), new Mirpur()};
        int cityNumber;
        do {
            System.out.println("\nPlease choose your city:");
            for (int i = 0; i < cities.length; i++) {
                System.out.println((i + 1) + ". " + cities[i].getCityName());
            }
            System.out.print("Enter city number: ");
            cityNumber = input.nextInt();
            input.nextLine(); // Clear the newline character
            if (cityNumber >= 1 && cityNumber <= cities.length) {
                handleCitySelection(cities[cityNumber - 1], fullName, age, input);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (cityNumber < 1 || cityNumber > cities.length);

        System.out.println("\nThank you for using BestDoctor App!");
        input.close();
    }

    public static void handleCitySelection(City city, String fullName, int age, Scanner input) {
        System.out.println("\nWelcome to " + city.getCityName() + ", " + fullName + "!");
        city.welcomeMsg();
        System.out.println("\nPlease choose your doctor from this list:");
        ArrayList<Doctors> doctorsList = city.getDoctorsList();

        int docChoice;
        do {
            for (int i = 0; i < doctorsList.size(); i++) {
                System.out.println((i + 1) + ". " + doctorsList.get(i).getName() + ", " + doctorsList.get(i).getSpecialty());
            }
            System.out.print("Enter your choice: ");
            docChoice = input.nextInt();
            input.nextLine(); // Clear the newline character
            if (docChoice >= 1 && docChoice <= doctorsList.size()) {
                Doctors doctor = doctorsList.get(docChoice - 1);
                System.out.println("You have chosen " + doctor.getName() + ", " + doctor.getSpecialty());
            } else {
                System.out.println("Invalid choice. Try again");
            }
        } while (docChoice < 1 || docChoice > doctorsList.size());
    }
}

abstract class City {
    protected ArrayList<Doctors> doctors = new ArrayList<>();

    public abstract String getCityName();

    public abstract ArrayList<Doctors> getDoctorsList();

    public abstract void welcomeMsg();
}

class Dhanmondi extends City {
    public Dhanmondi() {
        doctors.add(new Doctors("Dr. Rakibul Hasan", "Cardiologist"));
        doctors.add(new Doctors("Dr. Mehedi Anan", "Orthopedic Surgeon"));
        doctors.add(new Doctors("Dr. Nurul Islam Nahid", "Pediatrician"));
    }

    @Override
    public String getCityName() {
        return "Dhanmondi";
    }

    @Override
    public ArrayList<Doctors> getDoctorsList() {
        return doctors;
    }

    @Override
    public void welcomeMsg() {
        System.out.println("Welcome to BestDoctor (Dhanmondi)!");
    }
}

class Mirpur extends City {
    public Mirpur() {
        doctors.add(new Doctors("Dr. John Doe", "Dentist"));
        doctors.add(new Doctors("Dr. Jane Smith", "Dermatologist"));
        doctors.add(new Doctors("Dr. David Johnson", "Ophthalmologist"));
        doctors.add(new Doctors("Dr. Rahim Abdullah", "Gynacologist"));
    }

    @Override
    public String getCityName() {
        return "Mirpur";
    }

    @Override
    public ArrayList<Doctors> getDoctorsList() {
        return doctors;
    }

    @Override
    public void welcomeMsg() {
        System.out.println("Welcome to BestDoctor (Mirpur)!");
    }
}

class Gulshan extends City {
    public Gulshan() {
        doctors.add(new Doctors("Dr. Alice Brown", "Neurologist"));
        doctors.add(new Doctors("Dr. Michael Green", "Gynecologist"));
        doctors.add(new Doctors("Dr. Sarah Johnson", "Psychiatrist"));
    }

    @Override
    public String getCityName() {
        return "Gulshan";
    }

    @Override
    public ArrayList<Doctors> getDoctorsList() {
        return doctors;
    }

    @Override
    public void welcomeMsg() {
        System.out.println("Welcome to BestDoctor (Gulshan)!");
    }
}

class Doctors {
    private String name;
    private String specialty;

    public Doctors(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}
