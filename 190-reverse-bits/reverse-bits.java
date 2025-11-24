class Solution {
    public int reverseBits(int n) {
        String bit = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        String revBit = "";
        for (int i = bit.length() - 1; i >= 0; i--) {
            revBit += bit.charAt(i);
        }

        return (int) Long.parseLong(revBit, 2);
    }
}
