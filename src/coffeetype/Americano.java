package coffeetype;

public class Americano extends Coffee{

    public Americano() {
        super("Americano",3000);
    }

    @Override
    public void playSound() {
        SoundPlayer.play("src/sounds/Americano.wav");
    }
}
