public class PracticeProblem {

	public static int min(int a, int b, int c) {
        int smallest = a;           
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;         
        } else if (year % 100 != 0) {
            return true;             
        } else if (year % 400 != 0) {
            return false;          
        } else {
            return true;           
        }
    }

}
