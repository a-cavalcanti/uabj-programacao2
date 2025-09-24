public class Aula06Casting {
    public static void main(String[] args) {
        
        int i = 42;
        double d = i;
        System.out.println(d);

        double x = 9.81;
        int inteiro = (int) x;
        System.out.println(inteiro);

        char c = 'A';
        int code = c;
        System.out.println(code);
        System.out.println((char) (104));

        // Overflow
        int grande = 130; // 32 bits
        byte b = (byte) grande; // 8 bits
        System.out.println(b);
    }
}
