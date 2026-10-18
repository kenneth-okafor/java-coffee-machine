package coffeetype;

public class Latte extends Coffee{

    public Latte() {
        super("Latte", 2000);
    }

    @Override
    public void playSound() {
        SoundPlayer.play("src/sounds/Latte.wav");
    }
}
