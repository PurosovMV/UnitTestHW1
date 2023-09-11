package Calculator;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Calculator {
    public static void main(String[] args) {
        calculatingDiscount(100, 50);

        System.out.println("Tests");


        // Проверка правильности вычислений
        assertThat(calculatingDiscount(200, 20)).isEqualTo(180);

        //Проверка отрицательной цены
        assertThat(calculatingDiscount(-100, 25));

        //Проверка нулевой цены
        assertThat(calculatingDiscount(0, 10));

        //Проверка отрицательной скидки
        assertThat(calculatingDiscount(500, -30));

        //Проверка скидки > 100%
        assertThat(calculatingDiscount(500, 300));


    }


    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double result;
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Цена должна быть > 0");

        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может быть > 100%");

        } else if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть < 0");
        } else
            result = purchaseAmount * (100 - discountAmount) / 100;
        System.out.println("Стоимость товара: " + purchaseAmount + "\nСкидка составляет: " + discountAmount + "\nСтоимость с учётом скидки составляет - " + result);
        return result;
    }
}