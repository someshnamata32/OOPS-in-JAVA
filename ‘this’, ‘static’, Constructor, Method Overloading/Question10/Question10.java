class Time {
    int h,m,s;

    Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }

    void add(int h,int m,int s){
        this.s=this.s+s;
        if(this.s>=60){
            this.s-=60;
            this.m++;
        }

        this.m=this.m+m;
        if(this.m>=60){
            this.m-=60;
            this.h++;
        }

        this.h=this.h+h;
        if(this.h>=24){
            this.h-=24;
        }
    }

    void display(){
        System.out.println("Time : "+h+":"+m+":"+s);
    }
}

class Ass4_pr10 {
    public static void main(String[] args){
        Time a1=new Time(10,45,50);
        a1.add(12,23,43);
        a1.display();
    }
}
 
