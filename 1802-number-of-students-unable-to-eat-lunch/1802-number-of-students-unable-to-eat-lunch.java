class Solution {
    public int countStudents(int[] stu,  int[] san) {
        int count0 = 0, count1 = 0;  
        for (int student : stu) {
            if (student == 0) count0++;
            else count1++;
        }
        for (int sandwich : san) {
            if (sandwich == 0 && count0 > 0) count0--;  
            else if (sandwich == 1 && count1 > 0) count1--;  
            else break;  
        }
        return count0 + count1;     
    }
}