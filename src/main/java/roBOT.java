public class roBOT implements JumpAndRun {
    int maxHeight;
    int maxLength;
    String number;

    public roBOT(int maxHeight, int maxLength, String number) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.number = number;
    }

    public roBOT(int maxHeight, int maxLength, int i) {
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Pобот прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public String toString() {
        return "Робот, под номером " + number;
    }
}
