package coffeetype;

import javax.sound.sampled.*;
import java.io.File;

public class SoundPlayer {
    public static void play(String filePath) {
        try {
            File file = new File(filePath);

            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(file);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

        } catch (Exception e) {
            System.out.println("Error in playing sound");
            e.printStackTrace();
        }
    }
}
