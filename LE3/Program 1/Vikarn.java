class Vikarn extends Kaurav {
    Vikarn(String name){
        super(name);
    }
    @Override
    void obey() {
        System.out.println(name+" obeys the rules.");
    }

    @Override
    void kind() {
        System.out.println(name+" shows kindness.");
    }
}
