public class gg {
    
    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;
    
    public static void main(String[] args) {
    
        assert iwillBehave == true: "asus";
        College();
        assert iwillGraduate == true: "sana true";  
      

    }
    static void College(){
        iwillGraduate= false;
        System.out.println("Congratses");
    }
}

