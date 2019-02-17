public class Main {

    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Water(3), new Wall(5)); // Создаем полосу препятствий
        Team team = new Team("ПобедителиВсеяМир", new Human("Джон"), new Cat("Мурз"), new Dog("Огурец"));
        c.doIt(team);
        System.out.println("\nПобедители:");
        team.passedTheDistance();
        System.out.println("\nРезультат:");
        team.showResults();
    }
}