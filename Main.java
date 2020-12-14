import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.menu();
    }

    public static void menu() {
        System.out.println("\n\t*    main menu    *\n");
        Scanner a = new Scanner(System.in);
        System.out.println("1 : bpm to fps converter\n");
        String ans01 = a.nextLine();
        int ans = Integer.parseInt(ans01);
        if (ans == 1) {
            converters.bpmToFps();
        }
        a.close();
    }
}