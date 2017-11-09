package Chapter4;
public class DanglingElseProblem427 {
    public static void main(String[] args){
        int x = 9, y = 11;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else System.out.println("#####");
        System.out.println("$$$$$");
        x = 11;
        y = 9;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else System.out.println("#####");
        System.out.println("$$$$$");
        x = 9;
        y = 11;
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
        x = 9;
        y = 11;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else System.out.println("#####");
        System.out.println("$$$$$");
        x = 9;
        y = 11;
        if (x < 10) {
            if (y > 10)
                System.out.println("*****");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
