package voterId;

import java.util.Calendar;
import java.util.Date;

public class TestClass {



    public static void main(String[] args) {
//        int dod = 1997;
//        Verification v= new Verification();
//        v.Reg("pavan",1994,"09876543","Male");
//        v.voterCheck("09876543",1994);
//
//        System.out.println(Calendar.getInstance().getWeekYear());
//       int age = Calendar.getInstance().getWeekYear()-dod;
//        System.out.println(age);
        Voter1 voter1= new Voter1();
        voter1.polling("Janasena");
        voter1.voterCheck("09876543",1994);
        voter1.Reg("Pavan", 1994, "09876543","Male");
    }
}
