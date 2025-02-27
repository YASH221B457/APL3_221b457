
public class LazySingleton
{
	private static LazySingleton r;

    private LazySingleton() {}

    public  static LazySingleton getr() {
        if (r == null) {
            r = new LazySingleton();
        }
        return r;
    }
}
