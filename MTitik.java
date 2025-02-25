public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(); //membuat objek titik T1 (0,0)
        System.err.println("Titik T1:");
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3, 4);  //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser
        T1.setAbsis((3)); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        
        System.err.println("Titik T2");
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(5);
        T2.printTitik();

        Titik T3 = new Titik(5,-3);
        System.err.println("Titik T3");
        T3.printTitik();

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());

        System.err.println("T1 berada di kuadran " + T1.getKuadran());
        System.err.println("T2 berada di kuadran " + T2.getKuadran());
        System.err.println("T3 berada di kuadran " + T3.getKuadran());

        System.err.println("Jarak titik T1 ke pusat: " + T1.getJarakPusat());
        System.err.println(("Jarak Titik T2 dan T3: " + T2.getJarak(T3)));
 
        System.err.println("Refleksi sumbu X titik T1 adalah " + T1.getRefleksiX());


    }
    
}
