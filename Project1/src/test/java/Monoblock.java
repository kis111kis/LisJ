public class Monoblock extends DesktopComputer {
    Screen screen;

    public Monoblock(String processor, String RAM, String hard, String screen) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
        this.screen = new Screen(screen);
    }

    @Override
    public String toString() {
        return super.toString() + "с монитором: " + screen.name() + "\n";
    }
}