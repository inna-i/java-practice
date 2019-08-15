package com.globallogic.conditionsloops;

public class LoopsTask {

    /* https://www.e-olymp.com/en/problems/902
    Determine the level of educational achievements for the pupil (elementary, average, sufficient, high) according to the given grade (from 1 to 12).

    Input
        One number that is a grade for the pupil.

    Output
        Print Initial for elementary level (grade from 1 to 3), Average for average level (grade from 4 to 6),
        Sufficient for sufficient level (grade from 7 to 9) and High for high level (grade from 10 to 12).
    */
    public String levelEducationAchievements(int grade) {
        switch (grade) {
            case 1: case 2: case 3: return "Initial";
            case 4: case 5: case 6: return "Average";
            case 7: case 8: case 9: return "Sufficient";
            case 10: case 11: case 12: return "High";
            default: return "Probably you put wrong grade";
        }
    }

    /* https://www.e-olymp.com/en/problems/923
    Determine the season name by the month number using the compound conditions.

    Input
        The number of the month.

    Output
        For spring months print Spring, for summer - Summer, for autumn - Autumn and for winter - Winter.
     */
    public String season(int month) {
        switch (month) {
            case 1: case 2: case 12: return "Winter";
            case 3: case 4: case 5: return "Spring";
            case 6: case 7: case 8: return "Summer";
            case 9: case 10: case 11: return "Autumn";
            default: return "Probably you put wrong grade";
        }
    }

    /* https://www.e-olymp.com/en/problems/107
    Blank compact discs are on sale in packages of three kinds. A package with 100 disсs costs 100 UAH, one with 20 discs costs 30 UAH, and one disс costs 2 UAH.
    What minimal sum of money should you pay to buy n such disсs?

    Input
        The natural number n (n ≤ 1000).

    Output
        Print the minimal sum to buy n disсs. 123 = 136 UAH
 */
    public int compactDiscs1(int numberOfDiscs) {
        int remainder = 0;
        int pack100 = 0;
        int pack20 = 0;

        while(remainder >= 100) {
            remainder -= 100;
            pack100 += 1;
        }

        while(remainder >=20) {
            remainder -= 20;
            pack20 += 1;
        }

        return pack100 * 100 + pack20 * 30 + remainder * 2;
    }

    public int compactDiscs(int n) {

        int n1 = n%10;
        int n2 = (n/10) %10;
        int n3 = n/100;

        int numOf20 = n2/2;

        return n3*100 + numOf20 *30 + ((n2 - numOf20*2)*10 + n1)*2;

    }

    /*
        https://www.e-olymp.com/en/problems/906
        Product of digits
        Three digital number is given. Find the product of its digits.

        Input
            One three digital positive integer n.
        Output
            Print the product of digits in n.
    */

    public int productOfNums(int num) {
        return Integer.toString(num)
            .chars()
            .map(i -> i - 48)
            .reduce(1, (result, element) -> result * element);
    }

    public int productOfNumsIterative(int num) {
        String str = "" + num;
        int result = 1;
        char[] chars = str.toCharArray();

        for (char c : chars) {
            result *= c - 48;
        }
        return result;
    }

    public int productOfNumsUsingString(int num) {
        return Integer.toString(num)
            .chars()
            .map(i -> i - 48)
            .reduce(1, (result, element) -> result * element);
    }

    /* https://www.e-olymp.com/en/problems/918
        Which quarter?
            It set a point with co-ordinates х and y. Define, in what co-ordinate quarter it is located.

        Input
            In a unique line through a blank 2 material numbers - co-ordinates of a point are set, value of co-ordinates on the module do not exceed 100.

        Output
        The singular is the number of a corresponding quarter, or 0 if unequivocally define a quarter it is impossible.
    */
    public byte whichQuarter(int x, int y) {
        byte quarter = 0;

        if (x > 0 && y > 0) {
            quarter = 1;
        } else if (x < 0 && y > 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x > 0 && y < 0) {
            quarter = 4;
        }

        return quarter;
    }


    /*https://www.e-olymp.com/en/problems/903
    First or last?
        Three digit number is given. What digit is bigger: the first digit or the last digit?

    Input
        One three digit number.

    Output
        Print the bigger digit between first and last. In case of equality, print "=" (without quotes).
    */
    public String firstOrLast(int number) {
        return null;
    }

    /*https://www.e-olymp.com/en/problems/108
    Median number
        Three different numbers a, b, c are given. Print the median number.

    Input
        Integers a, b, c that do not exceed 1000 by absolute value.

    Output
        Print the median among three numbers.
     */
    public int medianNumber(int a, int b, int c) {
        return 0;
    }

    /*https://www.e-olymp.com/en/problems/906
    Product of digits
        Three digital number is given. Find the product of its digits.

    Input
        One three digital positive integer n.

    Output
        Print the product of digits in n.
     */
    public int productOfDigits(int digit) {
        return 0;
    }

    /*https://www.e-olymp.com/en/problems/2
    Digits
        Find the number of digits in a nonnegative integer n.

    Input
        One nonnegative integer n (0 ≤ n ≤ 2 *109).

    Output
        Print the number of digits in number n.
     */
    public int numberOfDigits(int digit) {
        return 0;
    }

}

