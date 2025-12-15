package Abstraction;

// AbstractClassDemo.java
abstract class Report {
    protected final String title;          // state allowed in abstract classes

    Report(String title) {                 // constructor runs for subclasses
        this.title = title;
        System.out.println("[Ctor] Report for: " + title);
    }

    // Template Method: final so subclasses can't change the overall algorithm
    public final void generate() {
        header();
        body();           // must be provided by each concrete subclass
        footer();
    }

    // Concrete methods with default behavior (subclasses may override if not final)
    protected void header() { System.out.println("=== " + title + " ==="); }
    protected void footer() { System.out.println("=== End ==="); }

    // Abstract method: contract each subclass must implement
    protected abstract void body();

    // Static utility on the abstract class
    public static void version() { System.out.println("Report Engine v1"); }
}

// Concrete subclass #1: overrides header and provides body
class SalesReport extends Report {
    private final int totalOrders;

    SalesReport(String title, int totalOrders) {
        super(title);
        this.totalOrders = totalOrders;
    }

    @Override
    protected void header() { System.out.println("[Sales] " + title); }

    @Override
    protected void body() {
        System.out.println("Total orders: " + totalOrders);
        System.out.println("Top seller: Selenium Book");
    }
}

// Concrete subclass #2: uses default header, provides its own body
class InventoryReport extends Report {
    private final int itemsInStock;

    InventoryReport(String title, int itemsInStock) {
        super(title);
        this.itemsInStock = itemsInStock;
    }

    @Override
    protected void body() {
        System.out.println("Items in stock: " + itemsInStock);
        System.out.println("Reorder needed: " + (itemsInStock < 100 ? "Yes" : "No"));
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Report.version();  // static method on abstract class

        // Report r = new Report("Test"); // ❌ compile error: cannot instantiate abstract class

        Report r1 = new SalesReport("Q3 Sales Summary", 250);   // polymorphism via abstract type
        r1.generate();

        System.out.println();

        Report r2 = new InventoryReport("Warehouse Inventory", 85);
        r2.generate();
    }
}


