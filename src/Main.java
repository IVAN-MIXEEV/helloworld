import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0 + 4 - 3.5;
        var cat = 3.6 + 4 - 1.6;
        var paper = 763789 + 4 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println((friend + 2) / 7);
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println((frog * 10) / 3.5);
        System.out.println(((frog * 10) / 3.5) + 4);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);
        var hours = 640;
        var oneEmployee = 8;
        var totalEmployee = hours / oneEmployee;
        System.out.println("Всего работников в компании-" + totalEmployee + " человек");
        var moreEmployee = 94;
        var totalEmployee1 = totalEmployee + moreEmployee;
        var totalHours = totalEmployee1 * 8;
        System.out.println("Если в компании работает " + totalEmployee1 + " человека,то всего " + totalHours + " часа работы может быть поделено между сотрудниками.");

        int numberOne = 6;
        byte numberTwo = 66;
        short numberThree = 666;
        long numberFour = 6666;
        float numberFive = 6.6666f;
        double numberSix = 6.66666;
        System.out.println("Значение переменной numberOne с типом int равно 6");
        System.out.println("Значение переменной numberTwo с типом byte равно 66");
        System.out.println("Значение переменной numberThree с типом short равно 666");
        System.out.println("Значение переменной numberFour с типом long равно 6666");
        System.out.println("Значение переменной numberFive с типом float равно 6.6666");
        System.out.println("Значение переменной numberSix с типом double равно 6.66666");

        float a = (float) 27.12;
        long b = 987678965549L;
        float c = (float) 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paperOne = 480;
        byte totalStudents = (byte) (LP + AS + EA);
        byte sheetsForEach = (byte) (paperOne / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги.");

        short twentyMinutes = 8 * 20;
        short oneDay = 8 * 1440;
        int threeDays = 8 * 4320;
        int oneMonth = 8 * 43200;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок.");

        int totalCansOfPaint=120;
        int whitePaintOneClass=2;
        int brownPaintOneClass=4;
        int totalPaintOneClass=whitePaintOneClass+brownPaintOneClass;
        int totalClasses=totalCansOfPaint/totalPaintOneClass;
        int totalWhitePoint=whitePaintOneClass*totalClasses;
        int totalBrownPoint=brownPaintOneClass*totalClasses;
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhitePoint+" банок белой краски и "+totalBrownPoint+" банок коричневой краски");

        int banana=5*80;
        int milk=105*2;
        int iceCream=2*100;
        int eggs=4*70;
        int breakfast=banana+milk+iceCream+eggs;
        float breakfastKG= (float)breakfast/1000;
        System.out.println(+breakfast+ "грамм");
        System.out.println(+breakfastKG+" килограмм");

        int masha = 74536;
        int denis = 92059;
        int kristina = 83853;
        System.out.println("Маша теперь получает " + masha + " рублей в месяц.");
        System.out.println("Денис теперь получает " + denis + " рублей в месяц. ");
        System.out.println("Кристина теперь получает " + kristina + " рублей в месяц. ");
        int mashaYear = 67760 * 12;
        int denisYear = 83690 * 12;
        int kristinaYear = 76230 * 12;
        int mashaYearNew = 74536 * 12;
        int denisYearNew = 92059 * 12;
        int kristinaYearNew = 83853 * 12;
        int defferenceMashaYear=mashaYearNew-mashaYear;
        int defferenceDenisYear=denisYearNew-denisYear;
        int defferenceKristinaYear=kristinaYearNew-kristinaYear;
        System.out.println("Маша теперь получает "+mashaYearNew+" рублей в год.Годовой доход вырос на "+defferenceMashaYear+" рублей. ");
        System.out.println("Денис теперь получает "+denisYearNew+" рублей в год.Годовой доход вырос на "+defferenceDenisYear+" рублей. ");
        System.out.println("Кристина теперь получает "+kristinaYearNew+" рублей в год.Годовой доход вырос на "+defferenceKristinaYear+" рублей. ");



    }
}