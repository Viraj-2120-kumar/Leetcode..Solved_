class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Count frequency of each digit (0-9)
        int[] digitCounts = new int[10];
        for (int d : digits) {
            digitCounts[d]++;
        }
        
        List<Integer> result = new ArrayList<>();
        
        // Check all possible even 3-digit numbers
        for (int num = 100; num < 999; num += 2) {
            int a = num / 100;       // first digit
            int b = (num / 10) % 10;  // second digit
            int c = num % 10;         // third digit
            
            // Make a copy of counts to check against
            int[] tempCounts = digitCounts.clone();
            
            // Check if we have enough of each digit
            if (tempCounts[a]-- > 0 && 
                tempCounts[b]-- > 0 && 
                tempCounts[c]-- > 0) {
                result.add(num);
            }
        }
        
        // Convert list to array
        return result.stream().mapToInt(i -> i).toArray();
    }
}