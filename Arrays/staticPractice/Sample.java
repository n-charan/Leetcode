package staticPractice;

public class Sample {
    int n = 10;
    public static void main(String[] args) {
        Sample num=new Sample();

        System.out.println(num.n);
        num.n = 20;
        System.out.println(num.n);
        number();
        Sample1 num=new Sample1();
        System.out.println(num.num2);
    }
    public static void number() {
        System.out.println(new Sample().n);
    }
}
class Sample1{
    int num2=30;
}
