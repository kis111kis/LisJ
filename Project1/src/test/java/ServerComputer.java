public class ServerComputer extends ComputerImpl {
    public ServerComputer(String processor, String RAM, String hard) {
        this.processor = processor;
        this.RAM = RAM;
        this.hard = hard;
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