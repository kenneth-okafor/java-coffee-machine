package coffeetype;

public class Espresso extends Coffee{
    public Espresso() {
        super("Espresso",3000);
    }

    @Override
    public void playSound() {
        SoundPlayer.play("src/sounds/Espresso.wav");
    }
}
