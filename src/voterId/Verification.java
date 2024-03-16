package voterId;

import java.util.Calendar;

public  abstract class Verification implements Registration,VoterIdChecking,Polling {


    DataBase dataBase;
   // String adharNoDB ="09876543";
    public Verification(){
        this.dataBase=new DataBase();
    }

    @Override
    public boolean Reg(String name, int dob, String adharNo, String gender) {
        if (dataBase.getName().equals(name) && dataBase.getDob() == (dob) && dataBase.getAdharNo().equals(adharNo) &&
                dataBase.getGender().equals(gender)) {
            // if (adharNoDB.equals(adharNo)){
            System.out.println("Registration Succesfull");
            return true;
        } else {
            System.out.println("Registration Failed");


            return false;
        }
    }




    @Override
    public boolean voterCheck(String adharNo , int dob) {
        int age=Calendar.getInstance().getWeekYear()-dob;
        if(age>=18) {
            System.out.println("valid voterId");
            return true;
        }else {
            System.out.println("invalid voterId");
        }
        return false;
    }


}
