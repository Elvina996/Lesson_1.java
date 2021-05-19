public class roBOT implements JumpAndRun {
    int maxHeight;
    int maxLength;
    int number;

    public roBOT(int maxHeight, int maxLength, int number) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.number = number;
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
