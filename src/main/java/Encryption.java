public class Encryption {
    private String encryptWord = "";
    private int shiftKey;
    private String errorMessage;


    public String Encryption(String text, int shiftKey){
       if(shiftKey < 0 || shiftKey > 26){
           String errorM = "Error Key must be between 0 and 26";

       }


        return encryptWord;
    }

    public String getEncryptWord(){
        return encryptWord
    }

    public String getErrorMessage(){
        return errorMessage;
    }


}
