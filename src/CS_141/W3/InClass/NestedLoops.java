package CS_141.W3.InClass;
// Doug Gilchrist
public class NestedLoops {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

       for(int i = 5; i >= 1; i--) {
           for(int j = 1; j <= i; j++) {
                System.out.print("*");
           }
           System.out.println();
       }
       System.out.println();

       for(int i = 7; i >= 1; i--){
           for(int j = 1; j <= i; j++){
               System.out.print(i);
           }
           System.out.println();
       }
    }
}
