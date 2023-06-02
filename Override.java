public class Override {
    public String Demo(){
        return "Returning Parent method";
    }
}
class Runtime extends Override{
    public String Demo(){
        return "Returning Child method";
    }
}
