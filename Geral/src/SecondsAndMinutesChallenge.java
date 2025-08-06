public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3600));

    }

    public static String getDurationString (int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds - (1 * 3600)) / 60;
        int secondsFinal = (seconds);
        return (hours + "h " + minutes + "m " + secondsFinal + "s");
    }
}
