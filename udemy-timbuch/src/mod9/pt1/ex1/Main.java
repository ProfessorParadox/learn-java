package mod9.pt1.ex1;

//interfaces intro

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
        
        //we are allowed to re-instantiate timsphone with diff class() constructor
        //since both classes implement same interface 
        //if we make timsphone specific to one class type
        //then 2nd para will give error
        

    }
}
