class Complex {
    int real, img;

    Complex(int r,int i){
        real=r;
        img=i;
    }

    void add(Complex c){
        real=real+c.real;
        img=img+c.img;
    }

    void sub(Complex c){
        real=real-c.real;
        img=img-c.img;
    }

    void display(){
        System.out.println("Complex Number: "+real+" + "+img+"i");
    }
}

class Ass4_pr9 {
    public static void main(String[] args){
        Complex c1=new Complex(4,5);
        Complex c2=new Complex(2,3);
        c1.add(c2);
        c1.display();
        c1.sub(c2);
        c1.display();
    }
}
