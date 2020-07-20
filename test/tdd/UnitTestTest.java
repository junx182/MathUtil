/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static dung.util.MathUtil.computeFactorial;

//netbeans 10, xoa het 2 dong tren 
//chuot phai Library -> Add jar -> netbeans dir/platforms/modules/ext(extend)/junit-4.12.jar + hamcrest-core-1.3.jar

/**
 *
 * @author evild
 */
public class UnitTestTest {
    //day la class truyen thong, dung de test code chinh minh o ben
    //MathUtil
    //nhung ta khong xai sout() ma ta xai mau sac xanh do
    //class nay chua rat nhieu ham main()
    //muon co ham bat ki trong nay thanh main() ban chi viec xai annotation
    //@Test, JVM se tu dong hieu ham nay la main() va Shilf F6 chay tu do
    //neu co nhieu @Test tuc la co nhieu main() trong nay, cac main() se 
    //chay tuan tu theo mac dinh tu tren xuong
    //ham main() nay dung de test cac tinh huong ham cF() nhan dung tham so
    // va se chay dung nhu ki vong
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases(){
        //ham nay dung de test cac tinh huong ca chon den tu nguoi dung
        //vi du nguoi dung muon tinh -5! thi tinh nhu nao duoc
        //khi do trong thiet ke cua ham cF() ta phai du lieu tinh` huoong ca chon nay
        //tuc la nguoi dung dua data ca chon vao thi minh nen nem ra ngoai le, khong them xu li
        //cF(-5) dap vao mat cai ngoai le
        //va ngoai le la mot thu bat thuong, khong nhu du tinh, khong phai la 1 loai value co the so sanh
        //tuc la khong the assertEquals(mot-cai-gi-do-ngoai-le)
        //vi assert() trong tieng anh nghia la so sanh 2 thu gi do
        //tuc la phai co value de so, ma ngoai le thi khong phai la value
        //ta phai dung chieu
        computeFactorial(-5);
        
    }
    //du code ban viet du do hay xanh mien khong bi loi cu phap khi go, loi import
    //thi CLEAN & BUILD luon ra duoc file .jar, .war
    //li do la cai thang Clean & Build no chi kiem tra code khong sai cu phap
    //no khong care code co sai logic xu li hay khong
    
    //MINH CHOI LON:
    //NEU CODE DANG MAU DO?, CAM CLEAN & BUILD DE DAM BAO RANG
    //CODE PHAI CHAY DUNG (MAU XANH) CHO CAC TINH HUONG XAI THU QUA ASSERT()
    //TUC LA DUNG VE XU LI THI MOI CHO RA FILE .JAR, .WAR
    //DO, VIN LAI, KHONG CHO RA .JAR, .WAR
    //NETBEANS 8X, 1005
    //NETBEANS 10X TRO LEN, 1204
    
    @Test
    public void testSuccessfulCases(){
        //assertEquals(120, 720);
        assertEquals(120, computeFactorial(5));
        //hy vong 5! tra ve 120, khong nhu the, mau do
        assertEquals(720, computeFactorial(6));
        //hy vong 6! tra ve 720, khong nhu the, mau do
        assertEquals(1, computeFactorial(0));//hi vong 0! tra ve 1
        assertEquals(1, computeFactorial(1));//hi vong 1! tra ve 1
        assertEquals(2, computeFactorial(2));
        //xanh chi xay ra khi tat ca xanh. ham chay dung ki vong trong moi truong hop
        //do thi chi can 1 thang do trong ca dam xanh
        //Ham y: xanh gan het, con vai case mau do
        //chung to xu li ham khong tot, khong chay trong moi truong hop
    }
    
}
