import java.util.Scanner;

public class converters {

    public static void bpmToFps() {

        System.out.println("\n\t*    bpm to fps    *\n");
        Scanner b = new Scanner(System.in);
        String quit = "u";
        String end = "x";
        while (!quit.equals(end)) {
            System.out.println("bpm ?");
            String bpm01 = b.nextLine();
            int bpm = Integer.parseInt(bpm01);
            System.out.println("frames per beat ?");
            String framePerBeat01 = b.nextLine();
            int framePerBeat = Integer.parseInt(framePerBeat01);
            double fps01 = (bpm * framePerBeat);
            double fps = fps01 / 60;
            double duration = 1 / fps;
            System.out.println("\n" + fps + " fps");
            System.out.println("frame lenght : " + duration + " sec");
            System.out.println("frame per minute : " + fps * 60 + "\n");
            System.out.println("* enter : repeat * x : return to main menu *");
            quit = b.nextLine();

        }
        Main.menu();
    }

    public static void volume() {

        System.out.println("\n\t*    volume    *\n");
        Scanner b = new Scanner(System.in);
        String quit = "u";
        String end = "x";
        while (!quit.equals(end)) {
            System.out.println("longueur ?");
            String longueur01 = b.nextLine();
            double longueur = Double.parseDouble(longueur01);
            System.out.println("largeur ?");
            String largeur01 = b.nextLine();
            double largeur = Double.parseDouble(largeur01);
            System.out.println("hauteur ?");
            String hauteur01 = b.nextLine();
            double hauteur = Double.parseDouble(hauteur01);
            double totalVolume = (longueur * largeur * hauteur);
            System.out.println("Volume = " + totalVolume + " U**3");
            System.out.println("* enter : repeat * x : return to main menu *");
            quit = b.nextLine();
        }
        Main.menu();
    }
}