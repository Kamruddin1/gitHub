package OOPs.Super_KeyAnd_thisKeyword;
// this keyword refer to the current objects inside a method and construtor that is called is this keywords 2

// it is also used when we want to call default consturctor its own class

class  Students{
    int a;
    Students(int a){
        this.a=a;
    }
    void  show(){
        System.out.println(a);
    }

}
public class ThisKeyword {

    public static void main(String[] args) {
        Students s = new Students(100);
        s.show();

    }


}
