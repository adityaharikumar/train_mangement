import java.util.LinkedList;

// 🔷 Main Class
public class TrainConsistAppUC4 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize LinkedList for Train Consist
        LinkedList<String> consist = new LinkedList<>();

        // 🔹 Add Bogies (Initial Formation)
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // 🔹 Insert Pantry Car at position 2 (index = 2)
        consist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(consist);

        // 🔹 Remove First and Last Bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(consist);

        // 🔹 Final Ordered Consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : consist) {
            System.out.println(bogie);
        }

        // 🔹 Program continues...
        System.out.println("\nTrain sequence maintained successfully.");
    }
}