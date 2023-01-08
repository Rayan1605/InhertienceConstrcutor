public class ParentClass {

    public ParentClass(){
        System.out.println("You are calling the parent constructor");
    }

    public ParentClass(String message){
        System.out.println(message);
    }

    @Override
    public String toString(){
        return "This is the parent toString";
    }

}
