public abstract class ComputerImpl implements Computer {
    String processor, RAM, hard;
    boolean is_turn_on = false;

    public void Turn() {
        if (is_turn_on) {
            Turn_off();
            is_turn_on = false;
        } else {
            Turn_on();
            is_turn_on = true;
        }
    }

    public void Specifications() {
        System.out.print(this.getClass().getSimpleName() + "\n" +
                "с процессором: " + processor + "\n" +
                "с оперативной памятью: " + RAM + "\n" +
                "с жестким диском: " + hard + "\n");
    }
}