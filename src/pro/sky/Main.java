package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task 1
        byte b = 11;
        short s = 222;
        int i = 333;
        long l = 4444L;
        float f = 1.23f;
        double d = 2.3456789;
        boolean boo = true;
        char c = 123;
        //task 2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров составляет " + sumWeight + " кг");
        float weightGap = boxerWeight2 - boxerWeight1;
        System.out.println("Второй боксер тяжелее первого на " + weightGap + " кг");
        //task 3
        byte bananaWeight = 80;
        byte bananasQuantity = 5;
        int bananasSumWeight = bananaWeight * bananasQuantity;
        byte milkPortionWeight = 105;
        byte milkPortionQuantity = 2;
        int milkSumWeight = milkPortionWeight * milkPortionQuantity;
        byte icecreamWeight = 100;
        byte icecreamQuantity = 2;
        int icecreamSumWeight = icecreamWeight * icecreamQuantity;
        byte eggWeight = 70;
        byte eggsQuantity = 4;
        int eggsSumWeight = eggWeight * eggsQuantity;
        int cocktailWeightGrams = bananasSumWeight + milkSumWeight + icecreamSumWeight + eggsSumWeight;
        float cocktailWeightKilo = cocktailWeightGrams;
        cocktailWeightKilo = cocktailWeightKilo / 1000;
        System.out.println("Общий вес коктейля " + cocktailWeightGrams + " грамм");
        System.out.println("Общий вес коктейля " + cocktailWeightKilo + " кг");
        //task 4
        short targetWeight = 7_000;
        short dietCourse1 = 250;
        short dietCourse2 = 500;
        int dietCourse1Duration = targetWeight / dietCourse1;
        System.out.println("Спортсмену потребуется " + dietCourse1Duration + " дней на похудение при диете по курсу 250 г");
        int dietCourse2Duration = targetWeight / dietCourse2;
        System.out.println("Спортсмену потребуется " + dietCourse2Duration + " дней на похудение при диете по курсу 500 г");
        float dietMidCourse = dietCourse1  + dietCourse2;
        dietMidCourse = dietMidCourse / 2;
        float dietMidCourseDuration = targetWeight / dietMidCourse;
        System.out.println("Спортсмену потребуется " + dietMidCourseDuration + " дней на похудение при диете по курсу 375 г");
        //task 5
        int salaryMaryCurrent = 67_760;
        int salaryMaryEnlarged = salaryMaryCurrent + salaryMaryCurrent * 10 / 100;
        int salaryMaryCurrentYear = salaryMaryCurrent * 12;
        int salaryMaryEnlargedYear = salaryMaryEnlarged * 12;
        int salaryMaryPayGap = salaryMaryEnlargedYear - salaryMaryCurrentYear;
        System.out.println("Маша теперь получает " + salaryMaryEnlarged + " рублей/месяц. Годовой доход вырос на " + salaryMaryPayGap + " рублей/год");

        int salaryDenisCurrent = 83_690;
        int salaryDenisEnlarged = salaryDenisCurrent + salaryDenisCurrent * 10 / 100;
        int salaryDenisCurrentYear = salaryDenisCurrent * 12;
        int salaryDenisEnlargedYear = salaryDenisEnlarged * 12;
        int salaryDenisPayGap = salaryDenisEnlargedYear - salaryDenisCurrentYear;
        System.out.println("Денис теперь получает " + salaryDenisEnlarged + " рублей/месяц. Годовой доход вырос на " + salaryDenisPayGap + " рублей/год");

        int salaryChristinaCurrent = 76_230;
        int salaryChristinaEnlarged = salaryChristinaCurrent + salaryChristinaCurrent * 10 / 100;
        int salaryChristinaCurrentYear = salaryChristinaCurrent * 12;
        int salaryChristinaEnlargedYear = salaryChristinaEnlarged * 12;
        int salaryChristinaPayGap = salaryChristinaEnlargedYear - salaryChristinaCurrentYear;
        System.out.println("Кристина теперь получает " + salaryChristinaEnlarged + " рублей/месяц. Годовой доход вырос на " + salaryChristinaPayGap + " рублей/год");
    }
}
