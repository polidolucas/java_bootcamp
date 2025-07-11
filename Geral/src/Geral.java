public class Geral {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double total = (var1 + var2) * 100.00;
        System.out.println(total);

        double remainder = total % 40.00;
        System.out.println("the remainder: " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("is no remainder: " + isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}
