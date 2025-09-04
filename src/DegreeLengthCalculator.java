public class DegreeLengthCalculator {
    public static int CalculateDegreeLength (int degree) {
        if (degree == 1) {
            return 4;
        } else if (degree == 2) {
            return 6;
        } else if (degree == 3) {
            return 8;
        } else {
            return -1;
        }
    }
}

