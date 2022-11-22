import java.util.ArrayList;
import java.util.Scanner;

class customer{
    int tea=0;
    int coffee=0;
    int snacks=0;
    int idili=0;
    int dosha=0;
    int count=0
    customer(){

    }
    void tea(count){
        int sum=0;
        sum=count*10;
    }
    void coffee(count){
        int sum=0;
        sum=count*15;
    }
    void snacks(count){
        int sum=0;
        sum=count*10;
    }
    void Idili(count){
        int sum=0;
        sum=count*8;
    }
    void dosha(count){
        int sum=0;
        sum=count*6;
    }


}


public class Main {
    public static void main(String[] args) {
        ArrayList<customer> Itemarr = new ArrayList<Itemarr>();
        while (true) {
            System.out.println("Select the Items\n1.Tea\n2.Coffee\n3.Snacks\n4.Idili\n5.Dosha\n6.Generate Bill\n7.View all transactions\n8.Exit");
            Scanner xy = new Scanner(System.in);
            int option = xy.nextInt();

    }


}