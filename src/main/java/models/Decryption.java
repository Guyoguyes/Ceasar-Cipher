package models;

public class Decryption {

    private String decryptWord = "";
    private int shiftKey;
    private String text;
    private String errorMessage;



    public Decryption(String text, int shiftKey){
        this.text = text;
        this.shiftKey = shiftKey;

        if (shiftKey < 0 || shiftKey > 26) {
            errorMessage = "Error Key must be between 0 and 26";
        }else{
            for (int i = 0; i < text.length(); i++) {
                char x = text.charAt(i);
                if (Character.isLetter(x)) {
                    if (Character.isLowerCase(x)) {
                        char y = (char) (x - shiftKey);
                        if (y < 'a') {
                            decryptWord += (char) (x - (26 - shiftKey));
                        } else {
                            decryptWord += y;
                        }
                    } else if (Character.isUpperCase(x)) {
                        char y = (char) (x - shiftKey);
                        if (y < 'A') {
                            decryptWord += (char) (x - (26 - shiftKey));
                        } else {
                            decryptWord += y;
                        }
                    }
                } else {
                    decryptWord += x;
                }
            }
        }
    }

//    public String getDecryptWord() {
//        return decryptWord;
//    }

    public String setDecryptWord() {
        return decryptWord;
    }

    public String getText(){
        return text;
    }

    public int getShiftKey(){
        return shiftKey;
    }

    public String getErrorMessage(){
        return errorMessage;
    }




}
