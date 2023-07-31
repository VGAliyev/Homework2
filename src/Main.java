public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2.");
        task123();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task123() {
        System.out.println("Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
        System.out.println("Задача 2:");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
        System.out.println("Задача 3:");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
    }

    private static void task4() {
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend + "\n");
    }

    private static void task5() {
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog + "\n");
    }

    private static void task6() {
        System.out.println("Задача 6:");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var allWeight = boxerWeight1 + boxerWeight2;
        var difWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Вес первого боксёра " + boxerWeight1
                + " кг, второго - " + boxerWeight2 + " кг.\nОбщий их вес "
                + allWeight + " кг.\nРазница весов " + difWeight + " кг.\n");
    }

    private static void task7() {
        System.out.println("Задача 7:");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var difWeight1 = boxerWeight2 - boxerWeight1;
        var difWeight2 = boxerWeight2 % boxerWeight1;
        System.out.println("Вес первого боксёра " + boxerWeight1
                + " кг, второго - " + boxerWeight2 + " кг.\nРазница весов (вычитание) "
                + difWeight1 + " кг.\nРазница весов (остаток от деления) " + difWeight2 + " кг.\n");
    }

    private static void task8() {
        System.out.println("Задача 8:");
        var allTime = 640;
        var workTime = 8;
        var personal = allTime / workTime;
        System.out.println("Всего работников в компании - " + personal + " человек.\n");
        personal += 94;
        allTime = personal * workTime;
        System.out.println("Если в компании работает " + personal
                + " человека, то всего " + allTime + " часа работы может быть поделено между сотрудниками.");
    }
}