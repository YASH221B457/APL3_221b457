
public class EagerSingleton {
    
    private static final EagerSingleton r = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getr() {
        return r;
    }
}