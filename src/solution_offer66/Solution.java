package solution_offer66;

class Solution {
    public static int[] constructArr(int[] a) {
        int length = a.length;
        int[] aa = new int[length];
        int[] bb = new int[length];
        int[] cc = new int[length];
        if (length == 0)
            return a;
        aa[0] = a[0];
        for (int i = 1; i < length; i++) {
            aa[i] = aa[i-1]*a[i];
        }
        bb[length-1] = a[length-1];
        for (int i = length -2; i >= 0; i--) {
            bb[i] = bb[i+1]*a[i];
        }
        cc[0] = bb[1];cc[length-1]=aa[length-2];
        for (int i = 1; i < length-1; i++) {
            cc[i] = aa[i-1]*bb[i+1];
        }
        return cc;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(constructArr(a));
    }
}