public class Fibonacci{

    public void fibo(int h){

        int num1 = 0;
        int num2 = 1;
        int seq = 0;
        int fibo = 0;

        System.out.print(num1 + " -> ");
        System.out.print(num2 + " -> ");

        while(seq < h){
            fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
            System.out.print(fibo + " -> ");
            seq++;
        }

        System.out.println("End");
    }
}