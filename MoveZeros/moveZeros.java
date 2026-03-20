class Solution {
    public void moveZeroes(int[] ar) {
        int idx = 0;
         for (int i = 0; i < ar.length; i++) {
        if (ar[i] != 0) {
            ar[idx++] = ar[i];
        }
    }

    while (idx < ar.length) {
        ar[idx++] = 0;
    }
    }
}
