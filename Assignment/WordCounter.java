class WordCounter {
    String para;

    int counter(){
    int l=para.length();
    int count =0;
    System.out.println("Length of the paragraph is:"+l);
    for(int i=0; i<l; i++){
     int c =(int) para.charAt(i);
      //char c =para.charAt(i);
     if(c == ' '){
        count =count+1;

     }

    }
     return count+1;
}
public static void main(String a[] ){
    WordCounter w= new WordCounter();
    w.para="I am a student. I am in the baap company";
    int totalCount=w.counter();
    System.out.println("The total count is:"+totalCount);

}
}