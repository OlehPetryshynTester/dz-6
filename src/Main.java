public class Main {
    public static void main(String[] args) {
        System.out.println(years(2014));;
    }

    public static String years(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return "Цей рік високосний";
        } else {
            return "Цей рік звичайний";
        }
    }
    public String getSignal(String color) {
        switch(color) {
            case "Red":
                return "Stop";
            case "Yellow":
                return "caution";
            case "green":
                return "Go";
            default:
                return "Unknown color";
        }
    }
}


