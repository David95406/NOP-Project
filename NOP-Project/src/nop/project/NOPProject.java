package nop.project;

public class NOPProject {

    public static void elvalszt() {
        System.out.println("*****************");

    }

    public static boolean szokoev(int ev) {
        return ((ev > 1582) && (ev % 4 == 0) && (ev % 100 != 0) || (ev % 400 == 0));
    }

    public static void main(String[] args) {

    }

}
