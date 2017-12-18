package main.java.com.epam.codingbat;
/**
 * @author Nikolay Grunin
 * @version 1.0
 * Created 10.12.2017
 * Committed 18.12.2017
 */
public class Array1 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    public int[] makePi() {
        int[] newArray = {3, 1, 4};
        return newArray;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int newNums = nums[i];
            sum += newNums;
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] newArray = {nums[1], nums[2], nums[0]};
        return newArray;
    }

    public int[] reverse3(int[] nums) {
        int[] newArray = {nums[2], nums[1], nums[0]};
        return newArray;
    }

    public int[] maxEnd3(int[] nums) {
        int max;
        max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    public int sum2(int[] nums) {
        int sum;
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length < 2) {
            return sum = nums[0];
        }
        return sum = nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] newArray = {a[1], b[1]};
        return newArray;
    }

    public int[] makeEnds(int[] nums) {
        int[] newArray = {nums[0], nums[nums.length - 1]};
        return newArray;
    }

    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2) {
            return true;
        }
        return false;
    }

    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 3 || nums[0] == 3 || nums[1] == 2) {
            return false;
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int len = (nums.length) * 2;
        int[] newArray = new int[len];
        newArray[newArray.length - 1] = nums[nums.length - 1];
        return newArray;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
            return true;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return new int[]{nums[0], nums[1], nums[2]};
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0) {
            if (a[0] == 1) {
                count++;
            }
        }
        if (b.length != 0) {
            if (b[0] == 1) {
                count++;
            }
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA == sumB) {
            return a;
        }
        if (sumA > sumB) {
            return a;
        }
        return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] newArray = new int[2];
        if (nums.length <= 2) {
            return nums;
        }
        if (nums.length > 2) {
            int a = nums.length / 2;
            newArray[0] = nums[a - 1];
            newArray[1] = nums[a];
        }
        return newArray;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int[4];
        newArray[0] = a[0];
        newArray[1] = a[1];
        newArray[2] = b[0];
        newArray[3] = b[1];
        return newArray;
    }

    public int[] swapEnds(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length - 1];
        nums[0] = b;
        nums[nums.length - 1] = a;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] newArray = new int[3];
        if (nums.length == 3) {
            return nums;
        }
        if (nums.length > 3) {
            int a = nums.length / 2;
            newArray[0] = nums[a - 1];
            newArray[1] = nums[a];
            newArray[2] = nums[a + 1];
        }
        return newArray;
    }

    public int maxTriple(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length > 1) {
            maxOne = Math.max(nums[0], nums[1]);
            maxTwo = Math.max(maxOne, nums[2]);
        }
        return maxTwo;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return b;
        }
        if (a.length == 0) {
            int[] myArray = new int[]{b[0]};
            return myArray;
        }
        if (b.length == 0) {
            int[] myArray = new int[]{a[0]};
            return myArray;
        }
        int[] myArray = new int[]{a[0], b[0]};
        return myArray;
    }
}
