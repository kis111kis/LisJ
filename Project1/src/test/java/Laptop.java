public class Laptop extends PortableComputer {
    public Laptop(String processor, String RAM, String hard,
                  String screen, String keyboard) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
        this.screen = new Screen(screen);
        this.keyboard = new Keyboard(keyboard);
    }
}