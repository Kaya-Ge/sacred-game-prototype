public class Main {
    public static void main(String[] args) {
        ForestElf forestElf = new ForestElf("Ella", true);
        DarkElf darkElf = new DarkElf("Shu", false, 10);

        System.out.println("Знакомимся с Лесным эльфом...");
        forestElf.hello();
        System.out.println("Моё оружие — " + ForestElf.weapon);
        forestElf.attack();

        for (int i = 0; i < 3; i++) {
            forestElf.magic();
        }

        System.out.printf("%nЗнакомимся с Темным Эльфом...%n");

        darkElf.hello();
        System.out.println("Моё оружие — " + DarkElf.weapon);
        for (int i = 0; i < 5; i++) {
            darkElf.attack();
        }

        System.out.println("Концентрация Темного Эльфа равна " + darkElf.concentration);
        System.out.println("Темный Эльф концентрируется...");
        System.out.println("Концентрация Темного Эльфа равна " + darkElf.addConcentration(3));

    }
}