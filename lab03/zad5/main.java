package zad5;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Konto st[] = new Konto[10];
        Scanner scan = new Scanner(System.in);
        st[0] = new Konto( 0, 100);
        st[1] = new Konto( 1, 100);
        st[2] = new Konto( 2, 100);
        st[3] = new Konto( 3, 100);
        st[4] = new Konto( 4, 100);
        st[5] = new Konto( 5, 100);
        st[6] = new Konto( 6, 100);
        st[7] = new Konto( 7, 100);
        st[8] = new Konto( 8, 100);
        st[9] = new Konto( 9, 100);
        while (true) {
            System.out.println("Enter an id: ");
            int id = scan.nextInt();
            boolean menu = true;
            while (menu) {
                int choise =0;
                System.out.println("Main menu \n1:check balance \n2:withdraw \n3:deposit \n4:exit \nEnter a choice: ");
                choise = scan.nextInt();
                switch (choise) {
                    case 1:
                        System.out.printf("The balacne is: " + st[id].balance + "\n");
                        break;
                    case 2:
                        System.out.printf("Enter ammount to withdraw: \n");
                        int newWithdraw = scan.nextInt();
                        if(st[id].balance < newWithdraw){
                            System.out.println("not enough founds! operation canceled");
                            break;
                        }else {
                            st[id].balance = st[id].balance - newWithdraw;
                        }
                        break;
                    case 3:
                        System.out.printf("Enter ammount to deposit: \n");
                        int newDeposit = scan.nextInt();
                        st[id].balance = st[id].balance + newDeposit;
                        break;
                    case 4:
                        menu = false;
                        break;
                }
            }
        }
    }
}