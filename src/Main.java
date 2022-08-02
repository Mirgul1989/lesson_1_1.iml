public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(7 + 4 / 2 * 6 - 1);
        System.out.println(7 + 4 / 2 * (6 - 1));
        System.out.println(6 + 9);
        System.out.println("Hi " + "JAVA"); // склеивание
        System.out.println("Result: " + 8 + 2);
        System.out.println("Result: " + 8 * 2);
        System.out.println("Result: " + (8 + 2));
        // Operands priority (), */, + concatenate, +-
        int ageOfMyFriend = 28; // объявление и инициализация переменной
        int temperature = 35;

        System.out.println(temperature);
        System.out.println("Возраст моего друга: " + ageOfMyFriend);
        System.out.println("Возраст моего друга + 10: " + (ageOfMyFriend + 10));
        System.out.println(ageOfMyFriend);
        ageOfMyFriend = 40; // перезапись
        System.out.println("Новый возраст друга " + ageOfMyFriend);
        int apples; // объявление переменной

        apples = ageOfMyFriend + temperature; // прияваивание значения

        System.out.println(apples);

        double digit = 8.91;
        //temperature = 8.21;
        System.out.println(temperature + digit);
        char symb = '6';
        boolean isSunny = true;

        System.out.println(digit + " " + symb + " " + isSunny);
        String myJob = "I am a programmer";
        System.out.println("Profession " + myJob);

        final int CURRENT_YEAR = 2022;
        //CURRENT_YEAR = 2023;
    }
}
