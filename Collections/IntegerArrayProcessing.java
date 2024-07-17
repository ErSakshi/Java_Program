// import java.util.*;

// public class IntegerArrayProcessing {

//     // Step 1: Reverse each number in the integer array
//     public static int[] reverseNumbers(int[] arr) {
//         int[] reversedArr = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             reversedArr[i] = reverseNumber(arr[i]);
//         }
//         return reversedArr;
//     }

//     // Helper function to reverse a number
//     private static int reverseNumber(int num) {
//         int reversedNum = 0;
//         while (num != 0) {
//             reversedNum = reversedNum * 10 + num % 10;
//             num /= 10;
//         }
//         return reversedNum;
//     }

//     // Step 2: Generate the largest possible number from each element
//     public static int[] generateLargestNumbers(int[] arr) {
//         int[] largestArr = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             largestArr[i] = generateLargestNumber(arr[i]);
//         }
//         return largestArr;
//     }

//     // Helper function to generate the largest number from digits
//     private static int generateLargestNumber(int num) {
//         char[] digits = Integer.toString(num).toCharArray();
//         Arrays.sort(digits);
//         StringBuilder sb = new StringBuilder();
//         for (int i = digits.length - 1; i >= 0; i--) {
//             sb.append(digits[i]);
//         }
//         return Integer.parseInt(sb.toString());
//     }

//     // Step 3: Split each number into a digits array
//     public static List<Integer> splitIntoDigits(int[] arr) {
//         List<Integer> digitsList = new ArrayList<>();
//         for (int num : arr) {
//             while (num > 0) {
//                 digitsList.add(num % 10);
//                 num /= 10;
//             }
//         }
//         return digitsList;
//     }

//     // Step 4: Generate a new integer array containing unique digits
//     public static List<Integer> removeDuplicates(List<Integer> list) {
//         Set<Integer> set = new LinkedHashSet<>(list);
//         return new ArrayList<>(set);
//     }

//     // Step 5: Encode even numbers with odd numbers to generate a string
//     public static String encodeEvenOddPairs(List<Integer> list) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < list.size() - 1; i ++ ) {
//             if(i%2==0)
//                 System.out.println(sb.append("*"));
//             // sb.append(list.get(i));
//             // sb.append(list.get(i + 1));
//             // sb.append(" ");
//         }
//         return sb.toString().trim();
//     }

//     // Example usage
//     public static void main(String[] args) {
//         int[] integerArray = {115,100,212,209};
        
//         // Step 1: Reverse each number
//         int[] reversedArray = reverseNumbers(integerArray);
//         System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

//         // Step 2: Generate largest possible number from each element
//         int[] largestNumbersArray = generateLargestNumbers(reversedArray);
//         System.out.println("Largest Numbers Array: " + Arrays.toString(largestNumbersArray));

//         // Step 3: Split each number into digits array
//         List<Integer> digitsList = splitIntoDigits(largestNumbersArray);
//         System.out.println("Digits List: " + digitsList);

//         // Step 4: Generate new integer array containing unique digits
//         List<Integer> uniqueDigitsList = removeDuplicates(digitsList);
//         System.out.println("Unique Digits List: " + uniqueDigitsList);

//         // Step 5: Encode even numbers with odd numbers to generate a string
//         String encodedString = encodeEvenOddPairs(uniqueDigitsList);
//         System.out.println("Encoded String: " + encodedString);
//     }
// }


// import java.util.Scanner;

// public class GoodSequenceProbability {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt(); // Number of elements in the sequence
//         int M = scanner.nextInt(); // Modulus M
//         int[] a = new int[N];
        
//         // Reading the sequence elements
//         for (int i = 0; i < N; i++) {
//             a[i] = scanner.nextInt();
//         }
        
//         // Calculate P and Q
//         long[] dp = new long[M];
//         dp[0] = 1; // Base case: empty subsequence sum is 0
        
//         for (int i = 0; i < N; i++) {
//             long[] nextDp = dp.clone();
//             for (int j = 0; j < M; j++) {
//                 int remainder = (j - a[i] % M + M) % M;
//                 nextDp[j] += dp[remainder];
//             }
//             dp = nextDp;
//         }
        
//         // Total number of non-empty subsequences
//         long totalNonEmptySubsequences = (1L << N) - 1;
        
//         // Number of good subsequences
//         long goodSubsequencesCount = dp[0];
        
//         // Compute gcd of goodSubsequencesCount and totalNonEmptySubsequences
//         long gcdValue = gcd(goodSubsequencesCount, totalNonEmptySubsequences);
        
//         // Simplify the fraction
//         long P = goodSubsequencesCount / gcdValue;
//         long Q = totalNonEmptySubsequences / gcdValue;
        
//         // Print the result
//         System.out.println(P + "/" + Q);
        
//         scanner.close();
//     }

    
//     // Method to compute gc
//      private static long gcd(long a, long b) {
//         while (b != 0) {
//             long temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

// import java.util.Scanner;

// public class GoodSequenceProbability {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt(); // Number of elements in the sequence
//         int M = scanner.nextInt(); // Modulus M
//         int[] a = new int[N];
        
//         // Reading the sequence elements
//         for (int i = 0; i < N; i++) {
//             a[i] = scanner.nextInt();
//         }
        
//         // Calculate P and Q
//         long[] dp = new long[M];
//         dp[0] = 1; // Base case: empty subsequence sum is 0
        
//         for (int i = 0; i < N; i++) {
//             long[] nextDp = dp.clone();
//             for (int j = 0; j < M; j++) {
//                 int remainder = (j - a[i] % M + M) % M;
//                 nextDp[j] += dp[remainder];
//             }
//             dp = nextDp;
//         }
        
//         // Total number of non-empty subsequences
//         long totalNonEmptySubsequences = (1L << N) - 1;
        
//         // Number of good subsequences
//         long goodSubsequencesCount = dp[0];
        
//         // Compute gcd of goodSubsequencesCount and totalNonEmptySubsequences
//         long gcdValue = gcd(goodSubsequencesCount, totalNonEmptySubsequences);
        
//         // Simplify the fraction
//         long P = goodSubsequencesCount / gcdValue;
//         long Q = totalNonEmptySubsequences / gcdValue;
        
//         // Print the result
//         System.out.println(P + "/" + Q);
        
//         scanner.close();
//     }
    
//     // Method to compute gcd
//     private static long gcd(long a, long b) {
//        while (b != 0) {
//             long temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// } 
// import java.util.Scanner;

// public class GoodSequenceProbability {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt(); // Number of elements in the sequence
//         int M = scanner.nextInt(); // Modulus M
//         int[] a = new int[N];
        
//         // Reading the sequence elements
//         for (int i = 0; i < N; i++) {
//             a[i] = scanner.nextInt();
//         }
        
//         // Calculate P and Q
//         long[] dp = new long[M];
//         dp[0] = 1; // Base case: empty subsequence sum is 0
        
//         for (int i = 0; i < N; i++) {
//             long[] nextDp = dp.clone();
//             for (int j = 0; j < M; j++) {
//                 int remainder = (j + a[i]) % M;
//                 nextDp[remainder] += dp[j];
//             }
//             dp = nextDp;
//         }
        
//         // Total number of non-empty subsequences
//         long totalNonEmptySubsequences = (1L << N) - 1;
        
//         // Number of good subsequences
//         long goodSubsequencesCount = dp[0] - 1; // Subtracting the empty subsequence
        
//         // Compute gcd of goodSubsequencesCount and totalNonEmptySubsequences
//         long gcdValue = gcd(goodSubsequencesCount, totalNonEmptySubsequences);
        
//         // Simplify the fraction
//         long P = goodSubsequencesCount / gcdValue;
//         long Q = totalNonEmptySubsequences / gcdValue;
        
//         // Print the result
//         System.out.println(P + "/" + Q);
        
//         scanner.close();
//     }
    
//     // Method to compute gcd
//     private static long gcd(long a, long b) {
//         while (b != 0) {
//             long temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }
// import java.util.Scanner;

// public class GoodSequenceProbability {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt(); // Number of elements in the sequence
//         int M = scanner.nextInt(); // Modulus M
//         int[] a = new int[N];
        
//         // Reading the sequence elements
//         for (int i = 0; i < N; i++) {
//             a[i] = scanner.nextInt();
//         }
        
//         // Calculate P and Q
//         long[] dp = new long[M];
//         dp[0] = 1; // Base case: empty subsequence sum is 0
        
//         for (int i = 0; i < N; i++) {
//             long[] nextDp = dp.clone();
//             for (int j = 0; j < M; j++) {
//                 int remainder = (j + a[i]) % M;
//                 nextDp[remainder] += dp[j];
//             }
//             dp = nextDp;
//         }
        
//         // Total number of non-empty subsequences
//         long totalNonEmptySubsequences = (1L << N) - 1;
        
//         // Number of good subsequences
//         long goodSubsequencesCount = 0;
//         for (int i = 1; i < M; i++) {
//             if (dp[i] > 0) {
//                 goodSubsequencesCount = 0;
//                 break;
//             }
//         }
//         if (dp[0] > 1) {
//             goodSubsequencesCount = dp[0] - 1; // Subtracting the empty subsequence
//         }
        
//         // Compute gcd of goodSubsequencesCount and totalNonEmptySubsequences
//         long gcdValue = gcd(goodSubsequencesCount, totalNonEmptySubsequences);
        
//         // Simplify the fraction
//         long P = goodSubsequencesCount / gcdValue;
//         long Q = totalNonEmptySubsequences / gcdValue;
        
//         // Print the result
//         System.out.println(P + "/" + Q);
        
//         scanner.close();
//     }
    
//     // Method to compute gcd
//     private static long gcd(long a, long b) {
//         while (b != 0) {
//             long temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }-

// import java.util.Scanner;
// import java.io.ByteArrayInputStream;

// public class TestGoodSequenceProbability {

//     public static void main(String[] args) {
//         // Test case 1 input
//         String input1 = "2 3\n1 2\n";
//         ByteArrayInputStream in1 = new ByteArrayInputStream(input1.getBytes());
//         System.setIn(in1);
//         System.out.print("Test Case 1: ");
//         GoodSequenceProbability.main(new String[0]);

//         // Test case 2 input
//         String input2 = "2 3\n1 3\n";
//         ByteArrayInputStream in2 = new ByteArrayInputStream(input2.getBytes());
//         System.setIn(in2);
//         System.out.print("Test Case 2: ");
//         GoodSequenceProbability.main(new String[0]);
//     }
// }
 class StockPriceAnalyzer {
    public static int countDecreaseDays(int[] A) {
        int decreaseCount = 0;
        
        // Iterate over the array from the second element to the end
        for (int i = 1; i < A.length; i++) {
            // Check if the current day's price is less than the previous day's price
            if (A[i] < A[i - 1]) {
                decreaseCount += 1;
            }
        }
        
        // Return the total count of days with decreasing stock price
        return decreaseCount;
    }

    public static void main(String[] args) {
        int[] A = {10, 9, 12, 8};
        int N = A.length;
        System.out.println(countDecreaseDays(A)); // Output: 2
    }
}

