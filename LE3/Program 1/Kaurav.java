
class Kaurav extends Bharatvanshi {
    Kaurav(String name){
        super(name);
    }
    @Override
    void obey() {
        System.out.println(name+" disobeys the rules.");
    }

    @Override
    void kind() {
        System.out.println(name+" is cruel.");
    }
}
