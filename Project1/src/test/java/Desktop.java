public class Desktop extends DesktopComputer {
    String videocard;

    public Desktop(String processor, String RAM, String hard, String videocard) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
        this.videocard = videocard;
    }

    @Override
    public String toString() {
        return super.toString() + "с видеокартой: " + videocard + "\n";
    }
}