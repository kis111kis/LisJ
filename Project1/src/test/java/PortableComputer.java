public abstract class PortableComputer extends ComputerImpl {
    Keyboard keyboard;
    Screen screen;

    @Override
    public String toString() {
        return "PortableComputer\n" + super.toString() +
        "с клавиатурой: " + keyboard.name() + "\n" +
        "с монитором: " + screen.name() + "\n";
    }
}