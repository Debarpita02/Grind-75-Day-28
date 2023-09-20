class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seenBefore = new HashSet<Character>();
        int leftPointer = 0;
        int rightPointer = 0;
        int maxLength = 0;
        while(rightPointer < s.length()) {
            if(!seenBefore.contains(s.charAt(rightPointer))) {
                seenBefore.add(s.charAt(rightPointer));
                maxLength = Math.max(maxLength, seenBefore.size());
                rightPointer++;
            } else {
                seenBefore.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }
        return maxLength;
    }
}