import java.util.Scanner;

public class tugasKolaborasi_15 {
    public static void main(String[] args) {
        System.out.println("hallo agrii");
        System.out.println("hallo juga, gofar");
        System.out.println("apa kabar?");
        System.out.println("baik, kamu?");
        System.out.println("baik juga");


        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah kamu suka dengan pemrograman? (Ya/Tidak): ");{
        String jawaban = sc.nextLine();
        if (jawaban.equalsIgnoreCase("Ya")) {
            System.out.println("Wah, kamu keren!");
            System.out.println("Walau terkadang sulit, semoga kamu tetap menyukainya, ya!");
        } else {
            System.out.println("Tidak masalah kok, ini bukanlah suatu paksaan.");
            System.out.println("Tidak semua orang menyukai pemrograman walau terkadang itu menyenangkan.");
            System.out.println("Itu wajar kok. ^u^");


            }
        }
    }
}
    

