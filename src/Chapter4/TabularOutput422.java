package Chapter4;
public class TabularOutput422 {
    public static void main(String[] args){
        System.out.printf("N   10*N   100*N   1000*N%n");
        for(int N = 1; N <= 5; N++){
            System.out.printf("%d%5d%8d%9d%n", N, 10*N, 100*N, 1000*N);
        }
    }
}