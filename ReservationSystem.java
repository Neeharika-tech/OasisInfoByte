import java.util.ArrayList;
import java.util.Scanner;

public class ReservationSystem {

    private static ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Make a reservation");
            System.out.println("2. View reservations");
            System.out.println("3. Quit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    makeReservation();
                    break;
                case 2:
                    viewReservations();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    
    private static void makeReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter the date of your reservation (dd/mm/yyyy):");
        String date = scanner.nextLine();
        System.out.println("Enter the number of guests:");
        int guests = scanner.nextInt();
        Reservation reservation = new Reservation(name, date, guests);
        reservations.add(reservation);
        System.out.println("Reservation made!");
    }
    
    private static void viewReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }
    }
    
    private static class Reservation {
        private String name;
        private String date;
        private int guests;
        
        public Reservation(String name, String date, int guests) {
            this.name = name;
            this.date = date;
            this.guests = guests;
        }
        
        public String toString() {
            return name + " " + date + " " + guests;
        }
    }
}
