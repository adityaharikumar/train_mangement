import java.util.ArrayList;
import java.util.List;

// 🔷 Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " → " + cargo;
    }
}

// 🔷 Main Class
public class TrainConsistAppUC12 {

    public static void main(String[] args) {

        // 🔹 Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create Goods Bogies List
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // 🔹 Display Bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // 🔹 Safety Validation using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || 
                        b.cargo.equals("Petroleum")
                );

        // 🔹 Result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("✅ Train is SAFE for operation");
        } else {
            System.out.println("❌ Train is UNSAFE (Invalid Cargo Detected)");
        }

        // 🔹 Program continues...
        System.out.println("\nSafety validation completed using Stream API.");
    }
}