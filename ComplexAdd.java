

public class ComplexAdd {
    int real;
    int image;
    public ComplexAdd(int r,int i){
     this.real=r;
     this.image=i;
    }
    public  void printNo(){
        System.out.println(this.real+" + i"+this.image);
    }
    public static ComplexAdd Add(ComplexAdd n1, ComplexAdd n2){
        ComplexAdd res = new ComplexAdd(0,0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }
    public static void main(String[] args) {
        ComplexAdd c1= new ComplexAdd(4,8);
        ComplexAdd c2=new ComplexAdd(3,6);
        System.out.println("complex no: 1");
        c1.printNo();
        System.out.println("complex no:2");
        c2.printNo();
        ComplexAdd res = Add(c1,c2);
        System.out.println("addition of two complex number");
        res.printNo();



    }
}
