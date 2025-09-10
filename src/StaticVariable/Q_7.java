package StaticVariable;

class Patient {
    static String hospitalName = "AIIMS Delhi";
    static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; 
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }
}

public class Q_7 {
    public static void main(String... args) {
        Patient p1 = new Patient("Nitin Goyal", 25, "Fever", 101);
        Patient p2 = new Patient("Amit Sharma", 40, "T.V.", 102);
        Patient p3 = new Patient("Ayush Singh", 30, "Cancer", 103);

        System.out.println("Patient Details");
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
        System.out.println();
        p3.displayDetails();

        System.out.println("Hospital Summary");
        Patient.getTotalPatients();
    }
}
