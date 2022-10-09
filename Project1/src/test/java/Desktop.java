public class Desktop extends DesktopComputer {
    String videocard;

    public Desktop(String processor, String RAM, String hard, String videocard) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
        this.videocard = videocard;
    }

    @Override
    public void Specifications() {
        super.Specifications();
        System.out.println("с видеокартой: " + videocard);
    }

    @Override
    public void Turn() {
        Specifications();
        super.Turn();
    }

    @Override
    public void Internet() {
        Specifications();
        super.Internet();
    }
}