package SubSet.amazon;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(ways1("",4));
    }

    //Normal ways
    static void ways(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for (int i=1;i<=target;i++){
            ways(p+i,target-i);
        }
    }

    //with Array List
    static ArrayList<String> ways1(String p, int target){
        if(target==0){
            ArrayList<String> arr=new ArrayList<String>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i=1;i<=target;i++){
            list.addAll(ways1(p+i,target-i));
        }
        return list;

    }


}
