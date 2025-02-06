public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Pandav("Arjun");
        Bharatvanshi bheem = new Bheem("Bheem");
        Bharatvanshi duryodhan = new Kaurav("Kaurav");
        Bharatvanshi vikarn = new Vikarn("Vikarn");

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
