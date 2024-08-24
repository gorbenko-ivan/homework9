public class Main {
    public static void main(String[] args) {
        System.out.println("Задача№1");
        int[] payments = {235000, 260000, 390000, 220000, 370000};
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задача№2");
        int maxPayments = 0;
        int minPayments = -1;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxPayments) {
                maxPayments = payments[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayments + " рублей");
        for (int i = 0; i < payments.length - 1; i++) {
            int current = payments[i];
            int next = payments[i + 1];
            if (current < next) {
                minPayments = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей");

        System.out.println();
        System.out.println("Задача№3");
        double average = 0;
        if (payments.length > 0) {
            double sum1 = 0;
            for (int j = 0; j < payments.length; j++) {
                sum1 += payments[j];
            }
            average = sum1 / payments.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();
        System.out.println("Задача№4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            char cash = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = cash;
        }
        System.out.println(reverseFullName);
    }


}