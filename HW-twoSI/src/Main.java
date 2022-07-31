public class Main {
    public static void main(String[] args) {
        byte a=1;
        short b=200;
        int c=33000;
        long d=4L;
        float e=5.5F;

        float firstFighter=78.2F;
        float secondFighter=82.7F;
        var totalWeightFighters=firstFighter+secondFighter;
        System.out.println("Общий вес бойцов "+ totalWeightFighters+ " кг");
        var differenceWeightsFighters=(secondFighter)%firstFighter;
        System.out.println("Разница между весами бойцов "+differenceWeightsFighters+ " кг");

        var bananas=5;
        var totalWeightBananas=bananas*80;
        var milk=200;
        var totalWeightMilk=milk*105/100;
        var iceCreamePlombir=2;
        var totalWeightIceCreamePlombir=iceCreamePlombir*100;
        var eggs=4;
        var totalWeightEggs=eggs*70;
        var totalWeightBreakfast=totalWeightBananas+totalWeightMilk+totalWeightIceCreamePlombir+totalWeightEggs;
        var weightBreakfast=totalWeightBreakfast/1000;
        var leftGram=totalWeightBreakfast%1000;
        System.out.println("Общий вес завтрака "+weightBreakfast+" кг "+leftGram+" грамм");

        var overweight=7;
        var weighLoss250=overweight*1000/250;
        System.out.println("На похудение (в режиме - 250 грамм в день) уйдет "+weighLoss250+" дней");
        var weightLoss500=overweight*1000/500;
        System.out.println("На похудение (в режиме - 500 грамм в день) уйдет "+weightLoss500+" дней");
        var averageLevelDays=(weighLoss250+weightLoss500)/2;
        System.out.println("В среднем потребуется "+averageLevelDays+" дней");

        var MashaSalary=67760;
        var DenisSalary=83690;
        var CristinaSalary=76230;
        var yearMashaSalary=MashaSalary*12;
        var yearDenisSalary=DenisSalary*12;
        var yearCristinaSalary=CristinaSalary*12;
        var upMashaSalary=MashaSalary+MashaSalary*0.1;
        var upDenisSalary=DenisSalary+DenisSalary*0.1;
        var upCristinaSalary=CristinaSalary+CristinaSalary*0.1;
        var upYearMashaSalary=upMashaSalary*12;
        var upYearDenisSalary=upDenisSalary*12;
        var upYearCristinaSalary=upCristinaSalary*12;
        var addYearMashaSalary=upYearMashaSalary-yearMashaSalary;
        var addYearDenisSalary=upYearDenisSalary-yearDenisSalary;
        var addYearCristinaSalary=upYearCristinaSalary-yearCristinaSalary;
        System.out.println("Маша теперь зарабатывает "+upMashaSalary+" руб/месяц. "+"Годовой доход вырос на "+addYearMashaSalary+" рублей");
        System.out.println("Денис теперь зарабатывает "+upDenisSalary+" руб/месяц. "+"Годовой доход вырос на "+addYearDenisSalary+" рублей");
        System.out.println("Крситина теперь зарабатывает "+upCristinaSalary+" руб/месяц. "+"Годовой доход вырос на "+addYearCristinaSalary+" рублей");

        byte A=12;
        byte B=27;
        byte C=44;
        byte D=15;
        byte E=9;
        int result=A*(B+(C-D*E));
        int oppositeResult=-result;
        System.out.println("Противоположный результат расчета "+oppositeResult);

        int x=5;
        int y=7;
        x= (x+y);
        y= (x-y);
        x= (x-y);
        System.out.println("Значение x="+x+" Значение y="+y);

        int X=857;
        int Y=X%100;
        int Z=Y/10;
        System.out.println("Центральный символ в значении X это "+Z);

    }

    }





