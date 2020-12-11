import java.util.Scanner;

public class convertisseurs {

    public static void bpmToFps() {

        System.out.println("\n\t*    bpm to fps    *\n");
        Scanner b = new Scanner(System.in);
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
        System.out.println("enter : return to main menu");
        String quit = b.nextLine();
        Main.menu();
    }
}