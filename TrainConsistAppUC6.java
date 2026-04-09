import java.util.HashMap;
import java.util.Map;

// 🔷 Main Class
public class TrainConsistAppUC6 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Initialize HashMap (Bogie → Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Insert Data (Key–Value Mapping)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // 🔹 Display Mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // 🔹 Example Lookup
        System.out.println("\nCapacity of Sleeper: " + bogieCapacity.get("Sleeper"));

        // 🔹 Program continues...
        System.out.println("\nCapacity mapping completed successfully.");
    }
}