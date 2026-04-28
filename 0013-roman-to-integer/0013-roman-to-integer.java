class Solution {
    public int romanToInt(String s) {
        s = s.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");
        // handling complex cases

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        // mapping roman letters to values

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            num += roman.get(s.charAt(i));
            // add according to hashmap values
        }

        return num;
    }
}