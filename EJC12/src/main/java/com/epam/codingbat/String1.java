package main.java.com.epam.codingbat;
/**
 * @author Nikolay Grunin
 * @version 1.0
 * Created 10.12.2017
 * Committed 18.12.2017
 */
public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        String a = str.substring(str.length() - 2, str.length());
        return a + a + a;
    }

    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0, half);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        int sB = b.length();
        int sA = a.length();
        if (sB > sA) {
            return a + b + a;
        }
        return b + a + b;
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        if (str.length() >= 4) {
            return str.substring(2, str.length()) + str.substring(0, 2);
        }
        if (str.length() >= 3) {
            return str.substring(str.length() - 1, str.length()) + str.substring(0, 2);
        }
        return str;
    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1, str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }

    public String middleTwo(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half) + str.substring(half, half + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() >= 2 && str.substring(Math.abs(str.length() - 2), str.length()).equals("ly")) {
            return true;
        }
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if (index < 0) {
            return str.substring(0, 2);
        }
        if (index + 2 <= str.length()) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    public String middleThree(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() <= 3) {
            if (str.equals("bad")) return true;
            return false;
        }
        if (str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 0) {
            str = "@";
        }
        return str.charAt(0) + "@";
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() >= 2 && b.length() >= 1 && a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))) {
            if (a.length() >= 2 && b.length() >= 2) {
                return (a.substring(0, a.length() - 1)) + b.substring(0);
            }
            return a;
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() >= 2)
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
                return true;
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length(), a.length()) + b;
        }
        return a + b.substring(b.length() - a.length(), b.length());
    }

    public String extraFront(String str) {
        if (str.length() > 1) {
            String a = str.substring(0, 2);
            return a + a + a;
        }
        return str + str + str;
    }

    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        }
        if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2);
        }
        return str;
    }

    public String startWord(String str, String word) {
        if (word.length() > str.length()) {
            return "";
        }
        if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.charAt(0) + word.substring(1);
        }
        if (str.substring(0, word.length()).equals(word)) {
            return word;
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.length() == 1) {
            return "";
        }
        if (str.length() > 1) {
            if (str.charAt(0) == 'x') {
                str = str.substring(1);
            }
            if (str.charAt(str.length() - 1) == 'x') {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
