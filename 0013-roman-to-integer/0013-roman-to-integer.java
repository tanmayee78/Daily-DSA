class Solution {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            int currVal = roman.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextVal = roman.get(s.charAt(i + 1));

                if (currVal < nextVal) {
                    result -= currVal;
                } else {
                    result += currVal;
                }
            } else {
                result += currVal;
            }
        }
        return result;
    }
}