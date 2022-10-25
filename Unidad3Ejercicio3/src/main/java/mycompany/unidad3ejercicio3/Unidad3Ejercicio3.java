package mycompany.unidad3ejercicio3;

public class Unidad3Ejercicio3 {
    
    //protected char[] encoder = new char[26];
    //protected char[] decoder = new char[26];
    protected char[] encoder = new char[28];
    protected char[] decoder = new char[28];
    
    public Unidad3Ejercicio3(int rotation) {
        //for (int k=0; k < 26; k++) {
        for (int k=0; k < 28; k++) {
            //encoder[k] = (char) ('A' + (k + rotation) % 26);
            //decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
            encoder[k] = (char) ('A' + (k + rotation) % 28); // Nesesita cambiar de 26 a 28
            decoder[k] = (char) ('A' + (k - rotation + 28) % 28);
        }
    }
    
    private String transform(String original, char[ ] code) {
        char[ ] msg = original.toCharArray( );
        for (int k = 0; k < msg.length; k++)
            if (Character.isUpperCase(msg[k])) {
                int j = msg[k] - 'A';
                msg[k] = code[j]; 
            }
        return new String(msg);
    }
    
    public String encrypt(String message) {
        return transform(message, encoder);
    }
    
    public String decrypt(String secret) {
        return transform(secret, decoder);
    }
    
    public static void main(String[] args) {
        Unidad3Ejercicio3 cipher = new Unidad3Ejercicio3(3);
        System.out.println("Encryption code = " + new String(cipher.encoder));
        System.out.println("Decryption code = " + new String(cipher.decoder));
        String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
        String coded = cipher.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: " + answer);
    }
    
}
