public class DarkElf extends ForestElf {
    public static final String race = "Темные эльфы"; // Я копировала вручную все свойства. Есть ли способ удобнее?
    public static final String location = "Пещера Белльвью (южная)";
    public static final String weapon = "Двуручный";

    String name; // модификатор default, чтобы наследник имел доступ к этим полям (для этого все наследники в одном пакете), а остальные классы нет. кажется, нет особой рзаницы default или protected в данном случае
    boolean isGirl; // нужно ли мне здесь было копировать поля?
    int damage = 5; // можно ли здесь не задавать значения полей, ведь они есть в классе-родителе
    int magicLevel;
    int concentration = 8;
    public DarkElf(String name, boolean isGirl, int concentration) {
        super(name, isGirl);
        this.concentration = concentration;

    }

    @Override
    public void attack() {
        if(damage >= 8) {
            System.out.println("Никто не ускользнет от моей ярости");
        } else {
            System.out.println("Мой меч атаковал врага");
        }
        damage++;
    }

    @Override
    public void magic() {
        System.out.println("Надвигается Ядовитый туман");
    }

    public int addConcentration(int number) {
        return concentration += number;
    }
}