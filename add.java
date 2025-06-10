public class add {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        add obj = new add(); // Create an object to access non-static variables
        int sum = obj.a + obj.b;
        System.out.println("Sum of a and b is: " + sum);
    }
}
