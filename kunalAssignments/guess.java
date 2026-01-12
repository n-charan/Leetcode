package kunalAssignments;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        int score = 0;
        int exit = -1;

        while(true){
            Scanner num1 = new Scanner(System.in);
            int num = num1.nextInt();
            System.out.println("user num is :"+num);
            int num2= (int) (Math.random()*10);
//            int n2=(int)num2;
            System.out.println("computer input is :"+num2);
            if(num==num2){
                score+=1;
            }
            else if(num==exit){
                break;
            }
        }
        System.out.println("Score is :"+score);
    }
}
