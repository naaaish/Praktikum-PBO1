// Elvina Neila Samas       24060123120031
public class coercion {
    public static void main(String[] args){
        int output = 'a';
        System.out.println(output);

        // double x = 15.5;
        // int output1 = x;
        // System.out.println(output1);  
        // erro karena perlu mengubah x menjadi int terlebih dahulu
        // dengan ( int output1 = (int)x ), coercion seperti ini tidak bisa dilakukan di java karena
        // bisa menyebabkan kehilangan data (.5 bisa hilang) dan bisa menyebabkan overflow

        int y = 25;
        double output2 = y;
        System.out.println(output2);

        int z = 78;
        char output3 = (char)z;
        System.out.println(output3);

        char a = 'a';
        double output4 = a;
        System.out.println(output4);

    }
}
