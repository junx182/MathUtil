/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dung.util;

/**
 *
 * @author evild
 */
//đây la class chua cac ham tinh toan, toan hoc, dung chung, lam tien ich
//cho cac noi khac su dung. Pham cai gi ma mang tinh chat xai chung
//ta dung ki thuat static
public class MathUtil {
    //ham tinh n!=1.2.3...n
    //vvi gia tri giai thua tang cuc nhanh, nen se tran` vung int rat som
    //do int chi toi da 2 ty 1, nen ta xai long thi moi chua dc n lon
    //nhung cung chi co 15! thoi
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        MathUtil o = new MathUtil();
        System.out.println("5! = " + computeFactorial(15));
    }
}
