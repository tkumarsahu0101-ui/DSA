// class & object

public class Oops1 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        // p1.color = "blue";
        System.out.println(p1.color);
        // p1.setTip(5);
        p1.tip = 5;
        System.out.println(p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Trilokkumar";
        myAcc.setPassword("abcdeifghi");
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
class Pen {
    String color;
    int tip;

    void setColor(String NewColor){
         color = NewColor;
    }

    void setTip(int NewTip){
        tip = NewTip;
    }
}

class student {
    String name;
    int age;
    float percent;

    void calculatePercent(int phy ,int chem,int math){
        int result = (phy + chem + math)/3;
    }
}