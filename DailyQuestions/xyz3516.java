package DailyQuestions;

public class xyz3516 {
    public static int findClosest(int x, int y, int z) {
        int p1,p2;
        if(x>z){
            p1=x-z;
        }else{
            p1=z-x;
        }
        if(y>z){
            p2=y-z;
        }else{
            p2=z-y;
        }
        if(p1>p2){
            return 2;
        }if(p1<p2){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(findClosest(2,7,4));
    }
}
