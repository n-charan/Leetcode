package SubSet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        int [] nums={1,2,3};

        System.out.println(subsets(new ArrayList<>(),nums,0));
    }
    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ar = new ArrayList<>();

            ar.add(p);
            return ar;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));

        left.addAll(right);
        return left;

    }
    static List<List<Integer>>  subsets(List<Integer>  p,int [] nums,int index){
        if(index==nums.length){
            List<List<Integer>>  ar=new ArrayList<>();

            ar.add(new ArrayList<Integer>(p));
            return ar;
        }
//        char ch=up.charAt(0);
        int ch=nums[index];
        p.add(ch);

        List<List<Integer>>  left=subsets(p,nums,index+1);
        p.remove(p.size()-1);
        List<List<Integer>>  right=subsets(p,nums,index+1);

        left.addAll(right);
        return left;

    }
}
