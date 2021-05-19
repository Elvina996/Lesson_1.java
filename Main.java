public class Main {
    public static void main(String[] args) {
        JumpAndRun[] persons = {
                new Human(1, 3, " Константин"),
                new Human(1, 3, " Ксения"),
                new Cat(2, 3, " Том"),
                new Cat(3, 4, " Сэлим"),
                new roBOT(2,5,3),
                new roBOT(1,8,7)
        };

        Barrier[] obstacles = {
                new Treadmill(1),
                new Treadmill(5),
                new Wall(1),
                new Wall(4)
        };


        for (JumpAndRun person : persons) {
            System.out.println("К преодолеванию полосы препятствий приступает " + person );
            boolean winner = true;
            for (Barrier obstacle : obstacles) {
                System.out.println(person + " пытается пройти препятствия " + obstacle);
                if (obstacle.toJump(person.getMaxHeight()) ||
                        obstacle.toRun(person.getMaxLength())) {
                    System.out.println("И он справляется!!!!");
                } else {
                    winner = false;
                    System.out.println("К сожалению у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(person + " победил эту битву!");
            } else {
                System.out.println(person + " проиграл эту битву!");
            }
            System.out.println();
        }
    }

}
