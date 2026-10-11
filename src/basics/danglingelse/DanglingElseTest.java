package basics.danglingelse;

public class DanglingElseTest {

    public static void main(String[] args) {
        DanglingElseAnalyzer analyzer = new DanglingElseAnalyzer();

        // Test senaryolari: [x, y]
        int[][] testCases = {
                {6, 8}, // ikisi de 5'ten buyuk
                {6, 2}, // x>5 ama y<=5 (kritik farkin goruldugu senaryo)
                {2, 8} // x<=5
        };

        System.out.println("========================================");
        System.out.println(" DANGLING ELSE PROBLEM & SCOPE ANALYSIS ");
        System.out.println("========================================");

        for(int [] testCase : testCases) {
            int x = testCase[0];
            int y = testCase[1];

            System.out.printf("%n[TEST] girdi: x = %d, y = %d%n", x, y);
            System.out.println(" 1) Parantezsiz (Compiler Default) : " + analyzer.evaluateWithoutBraces(x, y));
            System.out.println(" 2) Parantezli : " + analyzer.evaluateWithBraces(x, y));
        }
        System.out.println("\n==================================================");

    }
}
