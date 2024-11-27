public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payout = {110, 120, 95, 105, 115};
        int payoutSum = 0;
        for (int element : payout) {
            payoutSum += element;
        }
        System.out.println("Сумма трат за месяц составила " + payoutSum + " рублей");
        System.out.println("Задача 2");
        int[] payout2 = {15450, 13750, 16100, 12950, 11350};
        int minPayout = payout2[0];
        int maxPayout = payout2[0];
        for (int element : payout2) {
            if (element < minPayout) {
                minPayout = element;
            }
            if (element > maxPayout) {
                maxPayout = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayout + " рублей. Максимальная сумма трат за неделю составила " + maxPayout + " рублей");
        System.out.println("Задача 3");
        int[] payout3 = {4865, 5187, 4964, 5032, 5119};
        int payoutSum2 = 0;
        for (int element: payout3) {
            payoutSum2 += element;
        }
        double payoutAverage = (double) payoutSum2 / payout3.length;
        System.out.println("Средняя сумма трат за месяц составила " + payoutAverage + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}