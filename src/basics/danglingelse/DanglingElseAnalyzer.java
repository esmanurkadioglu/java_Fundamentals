package basics.danglingelse;

public class DanglingElseAnalyzer {
    public String evaluateWithoutBraces(int x, int y) {
        if(x>5)
            if(y>5)
                return "x and y are > 5";
            else
                return "y is <=5 (Matched with inner if)";

        return "x is <= 5 (No action taken)";
    }

    public String evaluateWithBraces(int x, int y) {
        if(x>5) {
            if(y>5) {
                return "x and y are >5";
            }
        } else {
            return "x is <=5";
        }
        return "x >5 but y<=5 (Inner condition failed, no else executed) ";
    }
}
