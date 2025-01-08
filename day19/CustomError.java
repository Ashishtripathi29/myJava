package day19;

class AshishException extends Exception {
    
        public  AshishException(String str){
            super(str);
        }
        
    }
    
    public class CustomError {
        public static void main(String[] args) {
            int i=18;
            int j=0;
            try {
                j=18/20;
                if(j==0){
                    throw new AshishException("this is error");
            }
        }catch(AshishException e){
            System.out.println("this is AshishException "+ e.getMessage());
        }
         catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
