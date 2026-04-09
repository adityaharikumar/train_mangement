import java.util.LinkedHashSet;

// 🔷 Main Class
public class TrainConsistAppUC5 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize LinkedHashSet (Ordered + Unique)
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        // 🔹 Add Bogies (Insertion Order Preserved)
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // 🔹 Attempt Duplicate Insert
        formation.add("Sleeper"); // duplicate → ignored

        // 🔹 Display Formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(formation);

        // 🔹 Iteration (Ordered)
        System.out.println("\nDetailed Bogie Sequence:");
        for (String bogie : formation) {
            System.out.println(bogie);
        }

        // 🔹 Program continues...
        System.out.println("\nNo duplicates allowed, order maintained successfully.");
    }
}
