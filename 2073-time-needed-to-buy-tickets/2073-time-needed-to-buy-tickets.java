class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        // Keep looping until the person at k has 0 tickets
        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    time++;
                }
                // Optimization: stop immediately if k just finished
                if (tickets[k] == 0)
                    return time;
            }
        }
        return time;
    }
}