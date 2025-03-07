/* Nama File: ExceptionOnArray.java
 * Deskripsi: berisi program penanganan pengecualian (exception) pada array.
 * NIM / Nama: 24060123120031 / Elvina Neila Samas
 * Tanggal: 06 Maret 2025
 */

public class ExceptionOnArray {

    public static void main(String[] args){

        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code ....");
        }
    }
    
}
