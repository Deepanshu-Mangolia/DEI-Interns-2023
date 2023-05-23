import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Number of Thread ");
        int a = Obj.nextInt();
        Runnable R2 = new FileWriting(a);

        switch (a)
        {
            case 1 :
                Thread t1 = new Thread(R2);
                t1.start();
                break;
            case 2 :
                Thread t2 = new Thread(R2);
                Thread t3= new Thread(R2);
                t2.start();
                t3.start();
                break;

            case 4 :
                Thread t4 = new Thread(R2);
                Thread t5= new Thread(R2);
                Thread t6 = new Thread(R2);
                Thread t7= new Thread(R2);
                t4.start();
                t5.start();
                t6.start();
                t7.start();
                break;


            case 8 :
                Thread t8 = new Thread(R2);
                Thread t9 = new Thread(R2);
                Thread t10 = new Thread(R2);
                Thread t11 = new Thread(R2);
                Thread t12 = new Thread(R2);
                Thread t13 = new Thread(R2);
                Thread t14 = new Thread(R2);
                Thread t15 = new Thread(R2);
                t8.start();
                t9.start();
                t10.start();
                t11.start();
                t12.start();
                t13.start();
                t14.start();
                t15.start();
                break;

            case 16 :
                Thread t16 = new Thread(R2);
                Thread t17= new Thread(R2);
                Thread t18 = new Thread(R2);
                Thread t19= new Thread(R2);
                Thread t20 = new Thread(R2);
                Thread t21= new Thread(R2);
                Thread t22 = new Thread(R2);
                Thread t23= new Thread(R2);
                Thread t24 = new Thread(R2);
                Thread t25= new Thread(R2);
                Thread t26 = new Thread(R2);
                Thread t27= new Thread(R2);
                Thread t28 = new Thread(R2);
                Thread t29= new Thread(R2);
                Thread t30 = new Thread(R2);
                Thread t31= new Thread(R2);
                t16.start();
                t17.start();
                t18.start();
                t19.start();
                t20.start();
                t21.start();
                t22.start();
                t23.start();
                t24.start();
                t25.start();
                t26.start();
                t27.start();
                t28.start();
                t29.start();
                t30.start();
                t31.start();
                break;
        }
    }
}