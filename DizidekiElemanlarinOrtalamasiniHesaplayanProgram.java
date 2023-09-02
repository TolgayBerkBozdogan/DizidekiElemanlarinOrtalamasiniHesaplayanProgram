public class DizidekiElemanlarinOrtalamasiniHesaplayanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += i;
        }
        System.out.println("Dizide ki elemanlarin toplami = " + sum);


    }
}
