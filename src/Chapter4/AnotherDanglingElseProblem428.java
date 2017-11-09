package Chapter4;
public class AnotherDanglingElseProblem428 {
    public static void main(String[] args){
        int x = 5, y = 8;
        System.out.println("a)");
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@"); }
        else { System.out.println("#####"); } }
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        System.out.println("b)");
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@"); }}
            else { System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");}
        // с) наверное ошибка в книге, поэтому буду импровизировать
        System.out.println("с)");
        x = 6;
        if (y == 8) {
            if (x == 5) { }
                System.out.println("@@@@@"); }
        else { System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");}
        System.out.println("d)");
        y = 7;
        x = 5;
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@"); } }
            else { System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");}
    }
}
