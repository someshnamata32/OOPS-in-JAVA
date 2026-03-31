abstract class Bank{
    abstract double getROI();
}

class SBI extends Bank{
    double getROI(){
    return 6.5;
    }
}

class PNB extends Bank{
    double getROI(){
    return 6;
    }
}
class BOI extends Bank{
    double getROI(){
    return 7;
    }
}

class Driver{
    Bank b;
    void dispalayROI(){
    b = new SBI();
    System.out.println("ROI of SBI: "+b.getROI()+"%");
    b = new PNB();
    System.out.println("ROI of PNB: "+ b.getROI()+"%");
    b = new BOI();
    System.out.println("ROI of BOI: "+b.getROI()+"%");
    }
}

class Ass5_pr5{
    public static void main(String[] args){
        Driver d = new Driver();
        d.dispalayROI();
    }
}
