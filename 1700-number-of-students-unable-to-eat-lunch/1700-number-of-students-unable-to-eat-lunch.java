class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[] = new int[2];
        for(int student: students) count[student]++;
        int rem = sandwiches.length;
        for(int sandwich: sandwiches){
            if(count[sandwich] == 0) break;
            if(rem-- == 0) break;
            count[sandwich]--;
        }
        return rem;
    }
}