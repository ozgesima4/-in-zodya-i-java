package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogumyili,sonuc;
        System.out.println("doğum senenizi girin:");
        dogumyili=input.nextInt();
        sonuc=dogumyili%12;
        switch (sonuc) {
                case 0:
                System.out.println("çin zodyak burcu: MAYMUN  ");
                break;
                case 1:
                System.out.println("çin zodyak burcu: HOROZ ");
                break;
                case 2:
                System.out.println("çin zodyak burcu: KÖPEK  ");
                break;
                case 3:
                System.out.println("çin zodyak burcu: DOMUZ  ");
                break;
                case 4:
                System.out.println("çin zodyak burcu: FARE ");
                break;
                case 5:
                System.out.println("çin zodyak burcu: ÖKÜZ  ");
                break;
                case 6:
                System.out.println("çin zodyak burcu: KAPLAN ");
                break;
                case 7:
                System.out.println("çin zodyak burcu: TAVŞAN  ");
                break;
                case 8:
                System.out.println("çin zodyak burcu: EJDERHA  ");
                break;
                case 9:
                System.out.println("çin zodyak burcu: YİLAN  ");
                break;
                case 10:
                System.out.println("çin zodyak burcu: AT  ");
                break;
                case 11:
                System.out.println("çin zodyak burcu: KOYUN  ");
                break;
            default:
                throw new AssertionError();
        }
        
    }
    
}
