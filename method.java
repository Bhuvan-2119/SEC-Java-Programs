public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int age = 33;
        double salary = 65000;
        String name = "Java Developer";
        boolean isActive = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Active: " + isActive);
        greetUser(name);
        int result = addNumbers(15, 20);
        System.out.println("15 + 20 = " + result);
    }
    public static void greetUser(String username) {
        System.out.println("Welcome, " + username + "!");
    }
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
