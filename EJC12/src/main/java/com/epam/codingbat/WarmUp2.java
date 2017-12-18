package main.java.com.epam.codingbat;
/**
 * @author Nikolay Grunin
 * @version 1.0
 * Created 10.12.2017
 * Committed 18.12.2017
 */
public class WarmUp2 {
    public String stringTimes(String str, int n) {
        String one = str.substring(0, str.length());
        StringBuilder sbOne = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbOne.append(one);
        }
        return sbOne.toString();
    }

    public String frontTimes(String str, int n) {
        String first = "";
        int front = 3;
        if (front > str.length()) {
            front = str.length();
            for (int i = 0; i < n; i++) {
                first = first + str.substring(0, front);
            }
            return first;
        }
        for (int i = 0; i < n; i++) {
            first = first + str.substring(0, 3);
        }
        return first;
    }

    int countXX(String str) {
        int countXx = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                countXx++;
            }
        }
        return countXx;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.indexOf('x') >= i && str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                return true;
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i += 2) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public String stringSplosion(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = s + str.substring(0, i);
        }
        return s + str;
    }

    public int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2, str.length()))) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < (nums.length); i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 4) break;
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int minS = Math.min(a.length(), b.length());
        for (int i = 0; i < minS - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() >= 2) {
            String a = str.substring(1, str.length() - 1);
            String b = a.replace("x", "");
            return str.charAt(0) + b + str.charAt(str.length() - 1);
        }
        return str;
    }

    public String altPairs(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i = i + 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            s = s + str.substring(i, end);
        }
        return s;
    }

    public String stringYak(String str) {
        String replaceYak = str.replace("yak", "");
        return replaceYak;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == 6 || nums[i + 1] == 7)
                count++;
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == nums.length - 2) break;
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5) {
                if (Math.abs((nums[i] - 1) - nums[i + 2]) <= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
