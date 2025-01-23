
public class Main {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
    }
}

//without static keyword - Child function execute
//Mother member fun is static - error
//Child member fun is static - error
//Both are static - Mother function execute