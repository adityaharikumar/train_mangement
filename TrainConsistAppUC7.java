import java.util.ArrayList;
import java.util.Comparator;
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
public class TrainConsistAppUC7 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // 🔹 Display Before Sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Sort using Comparator (Ascending by Capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 🔹 Display After Sorting
        System.out.println("\nAfter Sorting (By Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Program continues...
        System.out.println("\nBogies sorted successfully for planning.");
    }
}
