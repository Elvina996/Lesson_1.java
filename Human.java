public class Human implements JumpAndRun {
    int maxHeight;
    int maxLength;
    String name;

    public Human(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Человек прыгает");
    }

    @Override
    public String toString() {
        return "Человек с именем " + name;
    }
}
