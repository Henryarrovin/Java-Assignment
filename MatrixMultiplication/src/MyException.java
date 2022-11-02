public class MyException extends Exception{
    String s;
    MyException(String s){
        this.s=s;
    }
    public String toString(){
        return "My Exception="+s;
    }
}
