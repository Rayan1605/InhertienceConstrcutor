public class ChildClass  extends ParentClass{

    public ChildClass(){
        super("Hi there. "); // the reason it's calling the child is that you selected the method that take in the
        //String, if you just write super then nothing in brackets, it will call the Parent one
        System.out.println("You are calling the child constructor");
    }

    @Override
    public String toString(){
        return "This is the child toString";
    }

}
