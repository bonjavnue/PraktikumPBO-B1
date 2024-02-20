class MTitik{
    public static void main(String[] args){
    
    //Deklarasi Objek t1 dan t2 dari kelas Titik

    Titik t1 = new Titik(1.0 ,2.0);

    Titik t2 = new Titik(3.0 , 4.0);

    Titik t3 = new Titik(5.0 , 6.0);

    System.out.println("Jumlah objek titik:" + t1.getCounterTitik());

    System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
    System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
    System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    } 

}