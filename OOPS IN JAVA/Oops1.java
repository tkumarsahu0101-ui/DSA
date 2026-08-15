// class & object

public class Oops1 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setcolor(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String NewColor){
         color = NewColor;
    }

    void setcolor(int NewTip){
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