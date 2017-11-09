package Chapter2;
public class TableOfSquaresAndCube231 {
    public static void main(String[] args){
        System.out.printf("num\t|\tsqr\t|\tcube%n");
        for(int i = 0; i<= 10; i++){
            System.out.printf("%d\t|\t%d\t|\t%d%n", i, i*i, i*i*i);
        }
    }
}
