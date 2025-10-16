public class snake {
    public static void main(String[] args) {
        
        int toy=0;
        for (int i=0; i<7; i++) {
            toy+=i;
            if(toy==8 || toy==30){
                toy+=19;
            }
            else if(toy==50 || toy==92){
                toy-=30;

            }
            else if(toy==100){
                System.out.println("Game over");
            }
    }

}
}
