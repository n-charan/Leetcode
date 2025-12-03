package SubSet;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(phonepad("","12"));
    }
    static List<String> phonepad(String p, String up){
        if(up.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        List<String> ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);

            ans.addAll(phonepad(p+ch,up.substring(1)));
        }
        return ans;
    }
}
