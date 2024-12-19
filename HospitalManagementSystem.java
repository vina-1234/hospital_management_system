
package hospital;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    String name;
    String disease;
    String doctor;

    Patient(String name, String disease, String doctor) {
        this.name = name;
        this.disease = disease;
        this.doctor = doctor;
    }
}

class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

public class HospitalManagementSystem {
    static ArrayList<Patient> patients = new ArrayList<>();
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Search Patient");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    viewPatients();
                    break;
                case 4:
                    viewDoctors();
                    break;
                case 5:
                    searchPatient();
                    break;
                case 6:
	            	System.out.println(" ************************** ");
	            	System.out.println("Thank You");
	            	System.out.println(" ************************** ");
	            	System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter disease: ");
        String disease = scanner.nextLine();
        System.out.print("Enter doctor's name: ");
        String doctor = scanner.nextLine();
        patients.add(new Patient(name, disease, doctor));
        System.out.println("Patient added successfully!");
    }

    static void addDoctor() {
        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter specialization: ");
        String specialization = scanner.nextLine();
        doctors.add(new Doctor(name, specialization));
        System.out.println("Doctor added successfully!");
    }

    static void viewPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("Name: " + patient.name + ", Disease: " + patient.disease + ", Doctor: " + patient.doctor);
        }
    }

    static void viewDoctors() {
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Name: " + doctor.name + ", Specialization: " + doctor.specialization);
        }
    }

    static void searchPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        for (Patient patient : patients) {
            if (patient.name.equals(name)) {
                System.out.println("Patient found!");
                System.out.println("Name: " + patient.name + ", Disease: " + patient.disease + ", Doctor: " + patient.doctor);
                return;
            }
        }
        System.out.println("Patient not found!");
    }
}