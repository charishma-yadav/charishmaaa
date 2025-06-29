public class Singleton {
    private static Singleton instance;

    private Singleton() {} // private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Usage
Singleton obj1 = Singleton.getInstance();
Singleton obj2 = Singleton.getInstance();
System.out.println(obj1 == obj2); // Output: true