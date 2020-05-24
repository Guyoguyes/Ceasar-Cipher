package models;

public class Encryption {
    private String encryptWord = "";
    private int shiftKey;
    private String errorMessage;
    private String text;



    public  Encryption(String text, int shiftKey) {
        this.text = text;
        this.shiftKey = shiftKey;

        if (shiftKey < 0 || shiftKey > 26) {
            errorMessage = "Error Key must be between 0 and 26";
            for (int i = 0; i < text.length(); i++) {
                char x = text.charAt(i);
                if (Character.isLetter(x)) {
                    if (Character.isLowerCase(x)) {
                        char y = (char) (x + shiftKey);
                        if (y > 'z') {
                            encryptWord += (char) (x - (26 - shiftKey));
                        } else {
                            encryptWord += y;
                        }
                    } else if (Character.isUpperCase(x)) {
                        char y = (char) (x + shiftKey);
                        if (y > 'Z') {
                            encryptWord += (char) (x - (26 - shiftKey));
                        } else {
                            encryptWord += y;
                        }
                    }
                } else {
                    encryptWord += x;
                }
            }
        }


    }

    public String getEncryptWord(){
        return encryptWord;    // test fails
//        return "HI";     Test passes
    }

    public String getErrorMessage(){

        return errorMessage;
    }


}
