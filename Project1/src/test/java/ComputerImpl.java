public abstract class ComputerImpl implements Computer {
    String processor, RAM, hard;

    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+"\n"+toString();
    }

    public String turnOff() {
        return "Turn on "+getClass().getSimpleName()+"\n"+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+"\n"+toString();
    }

    public String toString() {
        return "с процессором: " + processor + "\n" +
                "с оперативной памятью: " + RAM + "\n" +
                "с жестким диском: " + hard + "\n";
    }
}