public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);

    }

    public static long toMilesPerHour (double kilometersPerHour) {
        long finalMiles = 0;
        if (kilometersPerHour < 0){
            return -1;
        } else {
            finalMiles = Math.round(kilometersPerHour / 1.6);
            return finalMiles;
        }
//        return finalMiles;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " Km/h = " + toMilesPerHour() + " mi/h");
        }
    }
}
