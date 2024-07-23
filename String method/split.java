public class split {
   
        public static void main(String[] args) {
           
            String sampleString = "Hello,World,Java";
    
            
            String[] parts = sampleString.split(",");
    
       
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
    
    
