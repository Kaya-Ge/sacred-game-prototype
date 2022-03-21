public class ForestElf {
    public static final String race = "Лесные эльфы";
    public static final String location = "Пещера Белльвью (южная)";
    public static final String weapon = "Лук";

    String name; // модификатор default, чтобы наследник имел доступ к этим полям (для этого все наследники в одном пакете), а остальные классы нет. кажется, нет особой рзаницы default или protected в данном случае
    boolean isGirl;
    int damage = 5;
    int magicLevel = 10;

    public ForestElf(String name, boolean isGirl) {
        this.name = name;
        this.isGirl = isGirl;
    }

    public void hello() {
        System.out.printf("Привет, я %s, из %s. Моя семья — %s%n", name, location, race);
    }

    public void attack() {
        System.out.println("Во врага попала моя стрела");
        damage++;
    }

    public void magic() {
        System.out.println("Во врага попала Паучья стрела");
        magicLevel += 3;

        if(magicLevel >= 19) {
            System.out.println("Во врага попала Отбрасывающая стрела");
        }
    }

}
