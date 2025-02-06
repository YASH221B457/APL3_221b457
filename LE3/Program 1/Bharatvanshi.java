abstract class Bharatvanshi {
    String name;
    Bharatvanshi(String name){
        this.name=name;
    }
    void fight() {
        System.out.println(name+" fights bravely.");
    }
    abstract void obey();
    abstract void kind();
}
