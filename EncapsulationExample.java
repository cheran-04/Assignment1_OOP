class Employee {
    // Private fields (encapsulated data)
    private int id;
    private String name;

    // Setter methods (public interface to modify data)
    public void setId(int id) {
        // We could add validation logic here, e.g., if (id > 0)
        this.id = id;
    }

    public void setName(String name) {
        // We could add validation logic here, e.g., if (name != null && !name.isEmpty())
        this.name = name;
    }

    // Getter methods (public interface to access data)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        // Using public setter methods to modify the private data
        emp.setId(101);
        emp.setName("Geek");

        // Using public getter methods to access the private data
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}