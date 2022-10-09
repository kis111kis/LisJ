public abstract class PortableComputer extends ComputerImpl {
    Keyboard keyboard;
    Screen screen;

    @Override
    public void Specifications() {
        System.out.print("Портативный компьютер ");
        super.Specifications();
        System.out.println("с клавиатурой: " + keyboard.name);
        System.out.println("с монитором: " + screen.name);
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