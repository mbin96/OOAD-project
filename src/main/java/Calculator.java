public class Calculator {

    public int add(){
        int result;
        int a=1, b=5;
        return a+b;
    }

    public int minus(){
        int result;
        int a=5;
        int b=2;
        return a-b;
    }

    public static void main(String[] args) {
        int a=0, c;
        int b=0;
        if(b==1){
            System.out.println("branch in");
        } else {
            System.out.println("another branch in");
        }
        System.out.println("hello testlink. junit ignore failure");
    }
}
