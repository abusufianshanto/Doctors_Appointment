import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("We need your name and age. Please fill up this formula.");
        System.out.println("Full Name: ");
        String fullName = input.nextLine();
        System.out.println("Age: ");
        int age = input.nextInt();

        int cityNumber;
        do {
            System.out.println("Please choose the city (Type the number):");
            System.out.println("1. Dhanmondi\n2. Gulshan\n3. Mirpur\n4. Banani");
            cityNumber = input.nextInt();
            switch (cityNumber) {
                case 1:
                    // Dhanmondi
                    handleCitySelection(new Dhanmondi(fullName, age), input);
                    break;
                case 2:
                    // Gulshan
                    handleCitySelection(new Gulshan(fullName, age), input);
                    break;
                case 3:
                    // Mirpur
                    handleCitySelection(new Mirpur(fullName, age), input);
                    break;
                case 4:
                    // Banani
                    handleCitySelection(new Banani(fullName, age), input);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (cityNumber < 1 || cityNumber > 4);

        input.close();
    }

    public static void handleCitySelection(City city, Scanner input) {
        city.welcomeMsg();
        System.out.println("Please choose your doctor from this list:");
        ArrayList<Doctors> doctorsList = new ArrayList<>();
        doctorsList.add(new Doctors("Dr. Rakibul Hasan","Cardiologist"));
        doctorsList.add(new Doctors("Dr. Mehedi Anan","Orthopedic Surgeon"));
        doctorsList.add(new Doctors("Dr. Nurul Islam Nahid","Pediatrician"));

        int docChoice;
        do {
            for (int i = 0; i < doctorsList.size(); i++) {
                System.out.println((i + 1) + ". " + doctorsList.get(i).getName() + ", " + doctorsList.get(i).getSpecialty());
            }
            System.out.println("Enter your choice:");
            docChoice = input.nextInt();
            if (docChoice >= 1 && docChoice <= doctorsList.size()) {
                Doctors doctor = doctorsList.get(docChoice - 1);
                System.out.println("You have chosen " + doctor.getName() + ", " + doctor.getSpecialty());
            } else {
                System.out.println("Invalid choice. Try again");
            }
        } while (docChoice < 1 || docChoice > doctorsList.size());
    }
}