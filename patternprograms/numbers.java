package patternprograms;

public class numbers {
    public static void main(String[] args) {
        int x = 1;
        int y=2;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(x + " ");
                    x=x+2;   
                }else{
                    System.out.print(y + " ");
                    y = y + 2;
                }
            }
            System.out.println();
        }
    }
}
