class Clas {
    static{
        System.out.println("ok");
    }
}
public class Except {
    public static void main(String[] args) {
        Class.forName("Clas");
    }
}
