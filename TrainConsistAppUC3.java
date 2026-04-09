import java.util.HashSet;
import java.util.Set;

// 🔷 Main Class
public class TrainConsistAppUC3 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // 🔹 Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // 🔹 Show total count
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        // 🔹 Program continues...
        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}
