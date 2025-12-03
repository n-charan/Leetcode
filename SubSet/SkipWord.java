package SubSet;

public class SkipWord {
    public static void main(String[] args) {
        String str="charanchandra";
        System.out.println(skipword(" ",str));
    }
    static String skipword(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("cha") && up.startsWith("chandra")){
            skipword(p,up.substring(3));
        }
        else{
            skipword(p+ch,up.substring(1));
        }
        return p;
    }
}
