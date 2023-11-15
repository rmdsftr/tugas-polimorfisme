package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {

        //Nama  : Ramadhani Safitri
        //NIM   : 2211522009
        //Kelas : PBO A


        //membuat objek
        MemberReguler reguler = new MemberReguler();
        MemberSilver silver = new MemberSilver();
        MemberGold gold = new MemberGold();
        MemberPlatinum platinum = new MemberPlatinum();

        Member member1 = new MemberReguler();
        Member member2 = new MemberSilver();
        Member member3 = new MemberGold();
        Member member4 = new MemberPlatinum();

        
        //memanggil method dari kelas parent (Member)
        System.out.println();
        System.out.println("total bayar member reguler = " + member1.hitungTotalBayar(800000));
        System.out.println("total bayar member silver = " + member2.hitungTotalBayar(800000));
        System.out.println("total bayar member gold = " + member3.hitungTotalBayar(800000));
        System.out.println("total bayar member platinum = " + member4.hitungTotalBayar(800000));

        //memanggil method dari kelas child 
        System.out.println();
        System.out.println("total bayar member reguler = " + reguler.hitungTotalBayar(800000));
        System.out.println("total bayar member silver = " + silver.hitungTotalBayar(800000));
        System.out.println("total bayar member gold = " + gold.hitungTotalBayar(800000));
        System.out.println("total bayar member platinum = " + platinum.hitungTotalBayar(800000));

        System.out.println();
        System.out.println("ongkir member silver = " + silver.hitungOngkir(15.0));
        System.out.println("ongkir member gold = " + gold.hitungOngkir(15.0));
        System.out.println("ongkir member platinum = " + platinum.hitungOngkir(15.0));


        //kesimpulan :

        //saat memanggil method hitungTotalBayar(), akan didapatkan hasil yang sama baik itu
        //dari kelas parent maupun kelas child.

        //method hitungOngkir() tidak bisa dipanggil melalui kelas parent (Member) karena method
        //tersebut hanya dimiliki oleh kelas child

        //pada kelas child, meskipun memanggil method yang sama dengan input yang sama pula, outputnya bisa berbeda
        //ini dikarenakan object dibuat dari kelas-kelas child yang berbeda, namun nama methodnya sama
        //dengan kata lain, antar kelas child memiliki method yang sama namun perilakunya berbeda
        
    }
    
}
