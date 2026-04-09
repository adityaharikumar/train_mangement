import java.util.ArrayList;
import java.util.List;
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
public class TrainConsistAppUC8 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create List (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Display Original List
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Stream Filtering (capacity > 60)
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 Display Filtered Result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b);
        }

        // 🔹 Verify Original List Unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Program continues...
        System.out.println("\nFiltering completed using Stream API.");
    }
}
