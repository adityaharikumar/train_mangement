import java.util.ArrayList;
import java.util.List;

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
public class TrainConsistAppUC10 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create Bogie List
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Display Original List
        System.out.println("\nBogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Stream Aggregation
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);      // Aggregate sum

        // 🔹 Display Result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // 🔹 Verify Original List Unchanged
        System.out.println("\nOriginal List After Aggregation:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Program continues...
        System.out.println("\nSeat aggregation completed successfully.");
    }
}