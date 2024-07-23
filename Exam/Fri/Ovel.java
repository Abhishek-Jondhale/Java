
public class Ovel {
    public static void main(String args[]){
    String str=args[0];
    Ovel o=new Ovel();
    o.vowels(str);
}

    void vowels(String str) {
        int count =0;
         char c;
        for (int i = 0; i < str.length(); i++) {
              c=str.charAt(i);
    
         if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count=count+ 1;
            }

    }
 System.out.println("Total vowels in String is : " + count);
}

// public static void main(String args[]){
//     String str=args[10];
//     Ovel o=new Ovel();
//     o.vowels(str);
// }
}