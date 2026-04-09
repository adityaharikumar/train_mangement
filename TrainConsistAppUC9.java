import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 🔷 Bogie Class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

// 🔷 Main Class
public class TrainConsistAppUC9 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create Bogie List (with duplicates for grouping demo)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // 🔹 Display Original List
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Grouping using Stream API
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        // 🔹 Display Grouped Result
        System.out.println("\nGrouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        // 🔹 Verify Original List Unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Program continues...
        System.out.println("\nGrouping completed successfully.");
    }
}
