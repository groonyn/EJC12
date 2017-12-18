package main.java.com.epam.codingbat;
/**
 * @author Nikolay Grunin
 * @version 1.0
 * Created 10.12.2017
 * Committed 18.12.2017
 */
public class WarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile != bSmile) return false;
        return true;
    }

    public int sumDouble(int a, int b) {
        if (a != b) return a + b;
        return 2 * (a + b);
    }

    public int diff21(int n) {
        if (n <= 21) {
            return (21 - n);
        } else {
            return (2 * (n - 21));
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (((hour > 20 && hour <= 23) && talking == true) || ((hour >= 0 && hour < 7) && talking == true)) return true;
        return false;
    }

    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (a == 10 || b == 10) return true;
        if (sum == 10) return true;
        return false;
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean posNeg(int a, int b, boolean negative) {
        int a;
        int b;
        boolean negative;
        if (((a < 0 && b > 0) || (b < 0 && a > 0)) && (negative == false)) {
            return true;
        } else if ((negative == true) && (a < 0 && b < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String notString(String str) {
        if ((str.length() >= 3) && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        String strWithoutChar = new StringBuilder(str).deleteCharAt(n).toString();
        return strWithoutChar;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String twoString = str.substring(1, str.length() - 1);
            return ((str.charAt(str.length() - 1)) + twoString + str.charAt(0));
        }
    }

    public String front3(String str) {
        if (str.length() < 3) {
            String one = str.substring(0, str.length());
            StringBuilder sbOne = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sbOne.append(one);
            }
            return sbOne.toString();
        } else {
            String two = str.substring(0, 3);
            StringBuilder sbTwo = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                sbTwo.append(two);
            }
            return sbTwo.toString();
        }
    }

    public String backAround(String str) {
        String middle;
        String around;
        around = str.substring(str.length() - 1, str.length());
        middle = str;
        return around + middle + around;
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String middle;
            String around;
            around = str.substring(0, 2);
            middle = str;
            return around + middle + around;
        }
    }

    public boolean startHi(String str) {
        if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if ((a < 21 && a > 9) || (b < 21) && (b > 9)) {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a < 20 && a > 12) || (b < 20) && (b > 12) || (c < 20) && (c > 12)) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        boolean vara = a < 20 && a > 12;
        boolean varb = b < 20 && b > 12;
        if (vara != varb) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length() > 3 && (str.substring(1, 4).equals("del"))) {
            String strThree = str.substring(4, str.length());
            return ((str.charAt(0)) + strThree);
        } else if (str.length() <= 3) {
            return str;
        }
        return str;
    }

    public boolean mixStart(String str) {
        if ((str.length() >= 3) && ((str.charAt(2)) == 'x')) {
            return true;
        } else if (str.length() < 3) {
            return false;
        }
        return false;
    }

    public String startOz(String str) {
        String s = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            s = s + str.charAt(0);
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            s = s + str.charAt(1);
        }
        return s;
    }

    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {
        if (Math.abs(a - b) != 0 && Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else if (Math.abs(a - b) != 0 && Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        if ((a > b) && (a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return a;
        } else if (((b > a) && (a >= 10 && a <= 20) && (b >= 10 && b <= 20))) {
            return b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        int numberA = a % 10;
        int numberB = b % 10;
        if (numberA == numberB) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() >= 3) {
            String lastThree = str.substring(str.length() - 3, str.length());
            String lastThreeUpper = lastThree.toUpperCase();
            String first = str.substring(0, str.length() - 3);
            return first + lastThreeUpper;
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String s = new String();
        for (int i = 0; i < str.length(); i = i + n) {
            s = s + str.charAt(i);
        }
        return s;
    }
}
