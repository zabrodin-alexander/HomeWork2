public class Main {
    public static void main(String[] args) {
        System.out.println();

        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println();

        dog += 4;
        System.out.println(dog);
        cat +=4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        System.out.println();

        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend= friend/7;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println(totalWeight);
        var difference = oneBoxer - twoBoxer;
        System.out.println("Разица между массами бойцов " + difference + "кг!");
        var remainder = twoBoxer % oneBoxer;
        System.out.println("Остаток от деления между двумя весами " + remainder + "кг!");
        System.out.println();

        var hours = 640;
        var oneEmployee = 8;
        var totalEmployees = hours/oneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек ");
        totalEmployees = totalEmployees + 94;
        var totalHours = totalEmployees * oneEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalHours
                + " часов работы может быть поделено между сотрудниками ");
    }
}