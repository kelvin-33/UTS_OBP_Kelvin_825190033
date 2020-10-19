import java.util.Scanner;

public class MainApp {
    public static void main (String[]args){
        Tekateki t = new Tekateki();
        Scanner tekateki = new Scanner(System.in);


        do {
            System.out.print("Nama Pemain :");
            t.nama = tekateki.next();
            System.out.print("Id Pemain   :");
            t.Idnama = tekateki.next();
            System.out.print("Umur Pemain :");
            t.age = tekateki.next();

            System.out.println();
            System.out.println("====Pilih Game Anda====");
            System.out.println("1. Teka-Teki Logika");
            System.out.println("2. Teka-Teki Matematika");
            System.out.println();
            System.out.print("Game :");
            t.game = tekateki.nextInt();
            switch (t.game) {
                case 1: {
                    t.tekateki1();
                    System.out.println("Your Total Score :" + t.score);
                    System.out.println();
                    break;
                }
                case 2: {
                    t.tekateki();
                    System.out.println("Your Total Score :" + t.score);
                    System.out.println();
                    break;
                }
            }
            System.out.println(t.toString());
            System.out.print("Do You Play Again?[Y/N] :");
            t.lagi = tekateki.next();
        }while("Y".equals(t.lagi)||"y".equals(t.lagi));
    }
}