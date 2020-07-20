/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtil.util;
import static dung.util.MathUtil.computeFactorial;

/**
 *
 * @author evild
 */
public class MathUtil0 {
    public static void main(String[] args) {
        //5! máy sẽ in ra 120
        System.out.println("5! = " + computeFactorial(5));
        //6! hi vong (expected) may se ra 720
        //thuc te no ra bao nhieu phai chay moi biet
        //thuc te ket qua tra ve luc chay app goi la ACTUAL
        System.out.println("6! = " + computeFactorial(6));
        //actual: 720, expected: 720 -> dung roi
        //actual: 1000, expected: 720 -> sai roi
        //expected: 1 if cF(0), chay ham cF(0) hi vong nhan ve 1
        //neu khong ve 1, tuc la actual khac expected, ham viet code sai
        System.out.println("1! = " + computeFactorial(0));
        System.out.println("1! = " + computeFactorial(1));
        //chay, F6, nhin ket qua, luan dung sai bang mat tren tung ham sout()
        System.out.println("-5! = " + computeFactorial(-5));
        //ki vong nem ve ngoai le
        //do dua vao du lieu ca chon
        //-5! khong tinh duoc, do giai thua chi dung so duong
        //do ta choi tro sout() nen sai dung cu in ra ket qua, ta phai luon dung sai = mat
        //-5! = 1, phai nhin ket qua in khi chay -> luan dung sai
        //HOP LY NHUNG NHIN BANG MAT, SO SANG TRONG DAU, DE BI SAI SOT
        //giang ho do ra ta 1 bo thu vien, giup ta test cac ham dung mau sac
        //xanh -> code chay dung ki vong
        //do -> code chay sai ki vong
        //viet them doan code tu so sanh gium giua expected va actual de
        //nem ra mau, minh chi can nhin mau, khong can tu so sanh vaf ket luan
        //ki thuat nay goi la TDD ket hop voi UnitText.ing xai cac thu vien
        //phu tro JUnit, NUnit, TestNG, PHPUnit, CPPUnit, xUnit, MSTest,...
        
    }
}
