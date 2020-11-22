package solution1108;

class Solution {
    public static String defangIPaddr(String address) {
        String s = address.replace(".", "[.]");
        return s;

    }

    public String defangIPaddr2(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
                continue;
            }
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}