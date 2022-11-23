public class LeapYearArr {
    public static void main(String[] args) {
        int[] years = {1900, 1984, 1948, 2006, 1824, 2000, 2015, 2042, 2024};
        int count = 0;
        for (int i = 0; i < years.length; i++) {
            if (years[i] % 4 == 0 && years[i] % 100 != 0){
                System.out.println("Year " + years[i] + " is a leap year.");
                count++;
            } else if (years[i] % 400 == 0) {
                System.out.println("Year " + years[i] + " is a leap year.");
                count++;
            }
        }

        System.out.println("There are " + count + " leap years in the list");
    }
}
