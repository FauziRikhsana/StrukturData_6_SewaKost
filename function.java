package ekost;

import static ekost.main.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class function {
    
    public static String[][] LoginUser() {
        String[][] loginuser = {
            {"ADMIN", "PASSWORD", "Admin"},
            {"01", "236", "User"},
            {"02", "911", "User"},
            {"03", "826", "User"},
            {"04", "723", "User"},
            {"05", "608", "User"},
            {"06", "138", "User"},
            {"07", "521", "User"},
            {"08", "158", "User"},
            {"09", "349", "User"},
            {"10", "751", "User"},
            {"11", "484", "User"},
            {"12", "157", "User"},
        };
        return loginuser;
    }

    public static ArrayList<Kamar> ArrayKamar() {
        ArrayList<Kamar> kamar = new ArrayList<>();
            kamar.add(new Kamar("01", "Kamar 3x3 + Kasur + Lemari + Kamar Mandi luar", 800000));
            kamar.add(new Kamar("02", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("03", "Kamar 2,5x3 + Kasur + Lemari + Kamar Mandi luar", 700000));
            kamar.add(new Kamar("04", "Kamar 1,5x3 + Kasur + Lemari + Kamar Mandi luar", 450000));
            kamar.add(new Kamar("05", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi dalam", 700000));
            kamar.add(new Kamar("06", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("07", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("08", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("09", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("10", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("11", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            kamar.add(new Kamar("12", "Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar", 600000));
            return kamar;
    }
    
    public static ArrayList<Penghuni> ArrayPenghuni() {
        ArrayList<Penghuni> penghuniList = new ArrayList<>();
            penghuniList.add(new Penghuni("02","Alif", "Bandung", "08332233222", "01"));
            penghuniList.add(new Penghuni("03","Yudha", "Medan", "08515557739", "15"));
            penghuniList.add(new Penghuni("04","Martin", "Subang", "08332233222", "13"));
            penghuniList.add(new Penghuni("06","Haris", "Pangandaran", "08515557739", "15"));
            return penghuniList;
    }
       
    public static void MenuLogin() {
        System.out.println("==============================");
        System.out.println("|  SELAMAT DATANG DI E-KOST  |");
        System.out.println("==============================");
        System.out.println("|----------------------------|");
        System.out.println("|------ Masuk sebagai -------|");
        System.out.println("|     1. Pemilik Kost        |");
        System.out.println("|     2. Penghuni Kost       |");
        System.out.println("|     3. Guest               |");
        System.out.println("==============================");
    }
    
    public static void MenuAdmin() {
        System.out.println("==========================================");
        System.out.println("|                   MENU                  |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|-------- Pilih menu sesuai angka --------|");
        System.out.println("|  1. Syarat Daftar Kost                  |");
        System.out.println("|  2. Peraturan Penghuni Kost             |");
        System.out.println("|  3. Daftar Kamar                        |");
        System.out.println("|  4. Daftar Penghuni Kost                |");
        System.out.println("|  5. Daftar Username dan Password Kamar  |");
        System.out.println("|  6. Tambah Penghuni Kost                |");
        System.out.println("|  7. Hapus Penghuni Kost                 |");
        System.out.println("===========================================");
    }
    
    public static void MenuUser() {
        System.out.println("=====================================");
        System.out.println("|               MENU                |");
        System.out.println("|-----------------------------------|");
        System.out.println("|----- Pilih menu sesuai angka -----|");
        System.out.println("|  1. Peraturan Penghuni Kost       |");
        System.out.println("|  2. Informasi Kamar               |");
        System.out.println("|  3. Pembayaran                    |");
        System.out.println("|  4. Informasi Pemilik Kost        |");
        System.out.println("=====================================");
    }
    
    public static void MenuGuest() {
        System.out.println("=========================================");
        System.out.println("|                 MENU                  |");
        System.out.println("|---------------------------------------|");
        System.out.println("|------- Pilih menu sesuai angka -------|");
        System.out.println("|  1. Peraturan dan Syarat Daftar Kost  |");
        System.out.println("|  2. Daftar dan Harga Kamar            |");
        System.out.println("|  3. Daftar menjadi Penghuni Kost      |");
        System.out.println("|  4. Informasi Pemilik Kost            |");
        System.out.println("=========================================");
    }
    
    public static void DaftarKamar() {
        System.out.println("==========================================================================================");
        System.out.println("|                                    DAFTAR KAMAR                                        |");
        System.out.println("|========================================================================================|");
        System.out.println("|  Kode Kamar  |                      Fasilitas                    |  Harga (per bulan)  |");
        System.out.println("|----------------------------------------------------------------------------------------|");
        System.out.println("|      01      |  Kamar 3x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 800000,-    |");
        System.out.println("|      02      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      03      |  Kamar 2,5x3 + Kasur + Lemari + Kamar Mandi luar  |     Rp. 700000,-    |");
        System.out.println("|      04      |  Kamar 1,5x3 + Kasur + Lemari + Kamar Mandi luar  |     Rp. 450000,-    |");
        System.out.println("|      05      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi dalam   |     Rp. 700000,-    |");
        System.out.println("|      06      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      07      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      08      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      09      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      10      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      11      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("|      12      |  Kamar 2x3 + Kasur + Lemari + Kamar Mandi luar    |     Rp. 600000,-    |");
        System.out.println("==========================================================================================");
    }
    
    public static void DaftarPenghuni(ArrayList<Penghuni> penghuniList) {
    System.out.println("==================================================================================================================================");
    System.out.println("|                                                      DAFTAR PENGHUNI KOST                                                      |");
    System.out.println("|================================================================================================================================|");
    System.out.printf("| %-10s | %-20s | %-50s | %-16s | %-8s |\n", "Kode Kamar", "Nama", "Alamat", "Nomor HP", "Tanggal Pembayaran");
    
    for (Penghuni listPenghuni : penghuniList) {
        System.out.printf("|     %-2s     | %-20s | %-50s | %-16s |         %-2s         |\n", listPenghuni.KodeKamar(), listPenghuni.Nama(), listPenghuni.Alamat(), listPenghuni.NomorHP(), listPenghuni.TanggalPembayaran());
    }
    
    System.out.println("==================================================================================================================================");
}
    
    public static void DaftarAkun() {
        System.out.println("==========================================");
        System.out.println("|     DAFTAR PASSWORD DAN USERNAME       |");
        System.out.println("|========================================|");
        System.out.println("|  Kode Kamar  |  Username  |  Password  |");
        System.out.println("|----------------------------------------|");
        System.out.println("|      01      |     01     |    236     |");
        System.out.println("|      02      |     02     |    911     |");
        System.out.println("|      03      |     03     |    826     |");
        System.out.println("|      04      |     04     |    723     |");
        System.out.println("|      05      |     05     |    608     |");
        System.out.println("|      06      |     06     |    138     |");
        System.out.println("|      07      |     07     |    521     |");
        System.out.println("|      08      |     08     |    158     |");
        System.out.println("|      09      |     09     |    349     |");
        System.out.println("|      10      |     10     |    751     |");
        System.out.println("|      11      |     11     |    484     |");
        System.out.println("|      12      |     12     |    157     |");
        System.out.println("==========================================");
    }
            
    public static void PeraturanKost() {
        System.out.println("======================================================");
        System.out.println("|               PERATURAN PENGHUNI KOST              |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|  1. Tamu tidak boleh menginap                      |");
        System.out.println("|  2. Tamu dilarang memarkirkan motor di area Kost   |");
        System.out.println("======================================================");
    }
    
    public static void SyaratDaftar() {
        System.out.println("======================================================");
        System.out.println("|                 SYARAT DAFTAR KOST                 |");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|                    Fotocopy KTP                    |");
        System.out.println("======================================================");
    }

    public static void InfoPemilik() {
        System.out.println("=========================================================================");
        System.out.println("|                         INFORMASI PEMILIK KOST                        |");
        System.out.println("|-----------------------------------------------------------------------|");
        System.out.println("|  Nama Pemilik    : Eulis Popon Hasiroh                                |");
        System.out.println("|  Nomor WhatsApp  : +62 813-9403-9340                                  |");
        System.out.println("|  Alamat          : Jl. Soekarno Hatta, Inhoftank, Gg. Blokdesa VII,   |");
        System.out.println("|                    RT/RW 005/004, Bojongloa Kidul, Kota Bandung       |");
        System.out.println("=========================================================================");
    }

    public static boolean UlangMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kembali ke menu utama? (Y/T)");
        System.out.print("=>> ");
        String jawab = input.next().toUpperCase();
        input.nextLine();
        return jawab.equals("Y");
    }

    public static String LoginMenu(String username, String password) {
        for (String[] login : Login) {
            if (username.equals(login[0]) && password.equals(login[1])) {
                return login[2];
            }
        }
        return null;
    }

    public static String LoginUsername(String username, String password) {
        for (String[] login : Login) {
            if (username.equals(login[0]) && password.equals(login[1])) {
                return login[0];
            }
        }
        return null;
    }

    public static void DaftarKamarTersedia(Stack<Kamar> kamarStack) {
        System.out.println("===============================================================================================");
        System.out.println("|                                  LIST KAMAR YANG TERSEDIA                                   |");
        System.out.println("|=============================================================================================|");
        System.out.println("| Kode Kamar   | Fasilitas                                             | Harga (per bulan)    |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
        for (Kamar listKamar : kamarStack) {
            System.out.printf("| %-12s | %-53s | Rp. %-16s |\n", listKamar.KodeKamar(), listKamar.Fasilitas(), listKamar.HargaPerBulan() + ",-");
        }
        System.out.println("==========================================================================================");
    }

    public static Kamar InfoKamar(String user, ArrayList<Penghuni> penghuniList, ArrayList<Kamar> kamar) {
        for (Penghuni penghuni : penghuniList) {
            if (penghuni.KodeKamar().equals(user)) {
                String KodeInfoKamar = penghuni.KodeKamar();
                for (Kamar infokamar : kamar) {
                    if (infokamar.KodeKamar().equals(KodeInfoKamar)) {
                        return infokamar;
                    }
                }
            }
        }
        return null;
    }
    
    public static void InformasiKamar(Kamar infoKamar) {
        System.out.println("============================================================================");
        System.out.println("|                             INFORMASI KAMAR                              |");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.printf("| Kode Kamar        : %-2s                                                   |\n", infoKamar.KodeKamar());
        System.out.printf("| Fasilitas         : %-40s        |\n", infoKamar.Fasilitas());
        System.out.printf("| Harga (per Bulan) : Rp. %-6s,-                                         |\n", infoKamar.HargaPerBulan());
        System.out.println("============================================================================");
    }
    
    public static void inputInformasiPenyewa(Scanner input, String KodeKamar) {
        System.out.print("Masukkan nama penghuni                   : ");
        String Nama = input.next();
        input.nextLine();
        System.out.print("Masukkan alamat penghuni                 : ");
        String Alamat = input.next();
        input.nextLine();
        System.out.print("Masukkan nomor hp penghuni               : ");
        String NoHP = input.next();
        input.nextLine();
        System.out.print("Masukkan tanggal pembayaran              : ");
        String TanggalPembayaran = input.next();
        input.nextLine();

        System.out.println("========================================================================");
        System.out.println("|                           INFORMASI PENYEWA                          |");
        System.out.println("========================================================================");
        System.out.printf("| Kode Kamar                : %-2s                                       |\n", KodeKamar);
        System.out.printf("| Nama                      : %-20s                     |\n", Nama);
        System.out.printf("| Alamat                    : %-40s |\n", Alamat);
        System.out.printf("| Nomor HP                  : %-16s                         |\n", NoHP);
        System.out.printf("| Setiap tanggal pembayaran : %-2s                                        |\n", TanggalPembayaran);
        System.out.println("========================================================================");
    }
    
    public static void TambahPenghuni(Scanner input, ArrayList<Penghuni> penghuniList, Stack<Kamar> kamarStack) {
        System.out.print("Masukkan kode kamar yang ingin dihuni : ");
        String KodeKamar = input.next();
        input.nextLine();
        System.out.print("Masukkan nama penghuni : ");
        String Nama = input.next();
        input.nextLine();
        System.out.print("Masukkan alamat penghuni : ");
        String Alamat = input.next();
        input.nextLine();
        System.out.print("Masukkan nomor hp penghuni : ");
        String NoHP = input.next();
        input.nextLine();
        System.out.print("Masukkan tanggal pembayaran : ");
        String TanggalPembayaran = input.next();
        input.nextLine();

        System.out.println("========================================================================");
        System.out.println("|                           INFORMASI PENYEWA                          |");
        System.out.println("========================================================================");
        System.out.printf("| Kode Kamar                : %-2s                                       |\n", KodeKamar);
        System.out.printf("| Nama                      : %-20s                     |\n", Nama);
        System.out.printf("| Alamat                    : %-40s |\n", Alamat);
        System.out.printf("| Nomor HP                  : %-16s                         |\n", NoHP);
        System.out.printf("| Setiap tanggal pembayaran : %-2s                                       |\n", TanggalPembayaran);
        System.out.println("========================================================================");
        System.out.println("konfirmasi penambahan penghuni kost? (Y/T)");
        String TambahJawab = input.nextLine().toUpperCase();
        if (TambahJawab.equals("Y")) {
            penghuniList.add(new Penghuni(KodeKamar, Nama, Alamat, NoHP, TanggalPembayaran));
            kamarStack.removeIf(kamarremove -> kamarremove.KodeKamar().equals(KodeKamar));
            System.out.println("=====================================");
            System.out.println("|  Penghuni baru telah ditambahkan  |");
            System.out.println("=====================================");
        }
    }

    public static void Pembayaran(Kamar infoKamar, Scanner input) {
        System.out.println("====================================");
        System.out.println("|            PEMBAYARAN            |");
        System.out.println("|----------------------------------|");
        System.out.println("|         Harga per Bulan:         |");
        System.out.printf("|           Rp. %-6s           |\n", infoKamar.HargaPerBulan() + ",-");
        System.out.println("====================================");
        System.out.println("Masukkan berapa banyak penghuni yang tinggal di kamar anda");
        System.out.print("=>> ");
        int banyakOrang = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan berapa bulan yang ingin Anda bayar");
        System.out.print("=>> ");
        int banyakBulan = input.nextInt();
        int totalHarga = banyakBulan * (infoKamar.HargaPerBulan() + 200000 * (banyakOrang - 1));
        
        System.out.println("====================================");
        System.out.println("|----- Pilih tipe pembayaran ------|");
        System.out.println("|  1. Tunai                        |");
        System.out.println("|  2. Transfer                     |");
        System.out.println("====================================");
        int tipeBayar = input.nextInt();
        input.nextLine();

        switch (tipeBayar) {
            case 1:
                System.out.println("=================================================");
                System.out.println("|-------------------- TUNAI --------------------|");
                System.out.printf("| Kode Kamar        : %-2s                        |\n", infoKamar.KodeKamar());
                System.out.printf("| Harga per bulan   : %-6s                  |\n", +infoKamar.HargaPerBulan() + ",-");
                System.out.printf("| Total Pembayaran  : %-6s (%-2s bulan)      |\n", +totalHarga + ",-", banyakBulan);
                System.out.println("=================================================");
                System.out.println("Konfirmasi pembayaran? (Y/T)");
                System.out.print("=>> ");
                String konfirmasiTunai = input.next().toUpperCase();

                if (konfirmasiTunai.equals("Y")) {
                    System.out.println("===================================================");
                    System.out.println("|                  \"KOST VANJAVA\"                 |");
                    System.out.println("| Jl. Soekarno Hatta, Inhoftank, Gg. Blokdesa VII |");
                    System.out.println("|           Bojongloa Kidul, Kota Bandung         |");
                    System.out.println("---------------------------------------------------");
                    System.out.println("|                 STRUK PEMBAYARAN                |");
                    System.out.println("---------------------------------------------------");
                    System.out.println("| Tipe Pembayaran   : TUNAI                       |");
                    System.out.printf("| Kode Kamar        : %-2s                          |\n", infoKamar.KodeKamar());
                    System.out.printf("| Harga per bulan   : %-6s                    |\n", +infoKamar.HargaPerBulan() + ",-");
                    System.out.printf("| Total Pembayaran  : %-6s (%-2s bulan)        |\n", +totalHarga + ",-", banyakBulan);
                    System.out.println("===================================================");
                }
                break;
            case 2:
                System.out.println("=================================================");
                System.out.println("------------------- TRANSFER --------------------");
                System.out.printf("| Kode Kamar        : %-2s                        |\n", infoKamar.KodeKamar());
                System.out.printf("| Harga per bulan   : %-6s                  |\n", +infoKamar.HargaPerBulan() + ",-");
                System.out.printf("| Total Pembayaran  : %-6s (%-2s bulan)      |\n", +totalHarga + ",-", banyakBulan);
                System.out.println("=================================================");
                System.out.println("Konfirmasi pembayaran? (Y/T)");
                System.out.print("=>> ");
                String konfirmasiTransfer = input.next().toUpperCase();
                
                if (konfirmasiTransfer.equals("Y")) {                             
                    System.out.println("===================================================");
                    System.out.println("|                  \"KOST VANJAVA\"                 |");
                    System.out.println("| Jl. Soekarno Hatta, Inhoftank, Gg. Blokdesa VII |");
                    System.out.println("|           Bojongloa Kidul, Kota Bandung         |");
                    System.out.println("---------------------------------------------------");
                    System.out.println("|                 STRUK PEMBAYARAN                |");
                    System.out.println("---------------------------------------------------");
                    System.out.println("| Tipe Pembayaran   : TRANSFER                    |");
                    System.out.printf("| Kode Kamar        : %-2s                          |\n", infoKamar.KodeKamar());
                    System.out.printf("| Harga per bulan   : %-6s                    |\n", + infoKamar.HargaPerBulan() + ",-");
                    System.out.printf("| Total Pembayaran  : %-6s (%-2s bulan)        |\n", + totalHarga + ",-", banyakBulan);
                    System.out.println("---------------------------------------------------");
                    System.out.println("| Untuk Pembayaran lebih lanjut kirim ke no. rek  |");
                    System.out.println("|    (BCA) 4531065454 a.n. Eulis Popon Hasiroh    |");
                    System.out.println("|          lalu konfirmasi pembayaran ke          |");
                    System.out.println("|             (WA) +62 813-9403-9340              |");
                    System.out.println("==================================================="); 
                }
                break;
            default:
                System.out.println("Angka yang anda masukkan tidak sesuai.");
                break;
        }
    }
}
