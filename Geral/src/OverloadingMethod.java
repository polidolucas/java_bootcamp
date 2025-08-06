public class OverloadingMethod {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));

    }

    public static double convertToCentimeters (int inches){
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters (int feet, int inches){
        int toInches = ((feet * 12) + inches);
        double result = convertToCentimeters(toInches);
        return result;
    }
}
