public class Main {
    public static void main(String[] args) {
        int a = 22;
        byte b = 24;
        short c = 122;
        long d = 22;
        float e = 2.5F;
        double f = 2.53;
        System.out.println("Значение переменной а с типом int " + a);
        System.out.println("Значение переменной b с типом byte " + b);
        System.out.println("Значение переменной c с типом short " + c);
        System.out.println("Значение переменной d с типом long " + d);
        System.out.println("Значение переменной e с типом float " + e);
        System.out.println("Значение переменной f с типом double " + f);

        double a2 = 27.12;
        int b2 = 987;
        int b3 = 678;
        int b4 = 965;
        int b5 = 549;
        int c2 = 2;
        short d2 = 786;
        boolean e2 = false;
        short f2 = 569;
        short g2 = -159;
        short i2 = 27897;
        int h2 = 67;


        int lp = 23;
        int as = 27;
        int ea = 30;
        int totalPaper = 480;
        int onePeoplePaper = totalPaper / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + onePeoplePaper + " листов бумаги");



        int machineMinuteEffectMin = 8;
        int time1 = 20;
        int time2 = 1440;
        int time3 = 4320;
        int time4 = 43200;
        int mTime1 = time1 * machineMinuteEffectMin;
        System.out.println("За " + time1 + " минут машина произвела бутылок " + mTime1 + " штук");
        mTime1 = time2 * machineMinuteEffectMin;
        System.out.println("За " + time2 + " минут машина произвела бутылок " + mTime1 + " штук");
        mTime1 = time3 * machineMinuteEffectMin;
        System.out.println("За " + time3 + " минут машина произвела бутылок " + mTime1 + " штук");
        mTime1 = time4 * machineMinuteEffectMin;
        System.out.println("За " + time4 + " минут машина произвела бутылок " + mTime1 + " штук");




        int totalPaintQuant = 120;
        int oneClassWhitePaint = 2;
        int oneClassBrownPaint = 4;
        int classQuant = totalPaintQuant / ( oneClassBrownPaint + oneClassWhitePaint);
        int brownPaintQuant = classQuant * oneClassBrownPaint;
        int whitePaintQuant = classQuant * oneClassWhitePaint;
        System.out.println("В школе, где " + classQuant + " классов, нужно " + whitePaintQuant + " банок белой краски и " + brownPaintQuant + " банок коричневой краски ");



        int bananQuant = 5;
        int bananWeight = 80;
        int milkMl = 200;
        int milkTotal = milkMl / 100 * 105;
        int icecreamPiece = 2;
        int icecreamWeight = 100;
        int icecreamTotal= icecreamWeight * icecreamPiece;
        int eggQuant = 4;
        int eggWeight = 70;
        int breakfast = (bananQuant * bananWeight + milkTotal + icecreamTotal + eggWeight * eggQuant)/1000;
        System.out.println("Вес завтрака " + breakfast + " кг");

        int weightLoseTotal = 7000;
        int minDayWeightLose = 250;
        int maxDayWeightLose = 500;
        int dayQuantMinLose = weightLoseTotal / minDayWeightLose;
        System.out.println("Дней для похудения с минимальной потерей веса " + dayQuantMinLose);
        int dayQuantMaxlose = weightLoseTotal / maxDayWeightLose;
        System.out.println("Дней для похудения с максимальной потерей веса " + dayQuantMaxlose);
        int middleNumber = (dayQuantMinLose + dayQuantMaxlose) / 2;
        System.out.println("Среднее количество дней для похудения " + middleNumber);


        double mashaMonthSallary = 67760;
        double denisMonthSallary = 83690;
        double krisMonthSallary = 76230;
        double mashaNewMonthSallary = mashaMonthSallary * 1.1;
        double mashaYearSalDiff = (mashaNewMonthSallary * 12) - (mashaMonthSallary * 12);
        System.out.println("Маша теперь получает " + mashaNewMonthSallary + " рублей. Годовой доход вырос на "+ mashaYearSalDiff + " рублей" );
        double denisNewMonthSallary = denisMonthSallary * 1.1;
        double denisYearSalDiff = (denisNewMonthSallary * 12) - (denisMonthSallary * 12);
        System.out.println("Денис теперь получает " + denisNewMonthSallary + " рублей. Годовой доход вырос на "+ denisYearSalDiff + " рублей" );
        double krisNewMonthSallary = krisMonthSallary * 1.1;
        double krisYearSalDiff = (krisNewMonthSallary * 12) - (krisMonthSallary * 12);
        System.out.println("Кристина теперь получает " + krisNewMonthSallary + " рублей. Годовой доход вырос на "+ krisYearSalDiff + " рублей" );
    }
}
