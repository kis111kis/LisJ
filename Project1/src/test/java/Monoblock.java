public class Monoblock extends DesktopComputer {
    Screen screen;

    public Monoblock(String processor, String RAM, String hard, String screen) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
        this.screen = new Screen(screen);
    }

    @Override
    public void Turn() {
        super.Specifications();
        super.Turn();
    }

    @Override
    public void Internet() {
        super.Specifications();
        super.Internet();
    }
}