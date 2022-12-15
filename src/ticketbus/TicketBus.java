
package ticketbus;

import java.util.Scanner;


public class TicketBus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tujuan;
        int harga,paket,total;
        System.out.println("PEMESANAN TIKET BUS SULAWESI SELATAN");
        System.out.println("             TUJUAN  ");
        System.out.println("____________________________________");
        System.out.println("TORAJA : ");
        System.out.println("BIASA                     Rp.300,000");
        System.out.println("PREMIUM                   Rp.500,000");
        System.out.println("BIASA + KENDARAAN         Rp.600,000");
        System.out.println("PREMIUM + KENDARAAN       Rp.800,000");
        System.out.println("____________________________________");
        System.out.println("PALOPO : ");
        System.out.println("BIASA                     Rp.300,000");
        System.out.println("PREMIUM                   Rp.500,000");
        System.out.println("BASIC   + KENDARAAN       Rp.600,000");
        System.out.println("PREMIUM + KENDARAAN       Rp.800,000");
        System.out.println("____________________________________");
        System.out.println("PARE-PARE : ");
        System.out.println("BIASA                     Rp.200,000");
        System.out.println("PREMIUM                   Rp.400,000");
        System.out.println("BASIC   + KENDARAAN       Rp.400,000");
        System.out.println("PREMIUM + KENDARAAN       Rp.600,000");
        System.out.println("____________________________________");
        System.out.println("ENREKANG : ");
        System.out.println("BIASA                     Rp.250,000");
        System.out.println("PREMIUM                   Rp.500,000");
        System.out.println("BASIC   + KENDARAAN       Rp.550,000");
        System.out.println("PREMIUM + KENDARAAN       Rp.800,000");
        System.out.println("kemana tujuan anda");
        tujuan = input.next();
        if ("toraja".equalsIgnoreCase(tujuan))
        {
            System.out.println("BIASA               (1)   Rp.300,000");
            System.out.println("PREMIUM             (2)   Rp.500,000");
            System.out.println("BIASA + KENDARAAN   (3)   Rp.600,000");
            System.out.println("PREMIUM + KENDARAAN (4)   Rp.800,000");
            System.out.println("paket apa yang ingin anda mau? 1,2,3 atau 4");
            paket = input.nextInt();
            if (paket == 1)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa dan tiket berjumlah " + harga);
                total = harga * 300;
                System.out.println("Perjalanan ke Toraja dengan kelas 1 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 2)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium dan tiket berjumlah " + harga);
                total = harga * 500;
                System.out.println("Perjalanan ke Toraja dengan kelas 2 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 3)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 600;
                System.out.println("Perjalanan ke Toraja dengan kelas 3 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 4)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 800;
                System.out.println("Perjalanan ke Toraja dengan kelas 4 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else if ("palopo".equalsIgnoreCase(tujuan))
        {
            System.out.println("BIASA               (1)   Rp.300,000");
            System.out.println("PREMIUM             (2)   Rp.500,000");
            System.out.println("BIASA + KENDARAAN   (3)   Rp.600,000");
            System.out.println("PREMIUM + KENDARAAN (4)   Rp.800,000");
            System.out.println("paket apa yang ingin anda mau? 1,2,3 atau 4");
            paket = input.nextInt();
            if (paket == 1)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa dan tiket berjumlah " + harga);
                total = harga * 300;
                System.out.println("Perjalanan ke Palopo dengan kelas 1 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 2)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium dan tiket berjumlah " + harga);
                total = harga * 500;
                System.out.println("Perjalanan ke Palopo dengan kelas 2 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 3)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 600;
                System.out.println("Perjalanan ke Palopo dengan kelas 3 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 4)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 800;
                System.out.println("Perjalanan ke Palopo dengan kelas 4 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else if ("pare-pare".equalsIgnoreCase(tujuan))
        {
            System.out.println("BIASA               (1)   Rp.250,000");
            System.out.println("PREMIUM             (2)   Rp.500,000");
            System.out.println("BIASA + KENDARAAN   (3)   Rp.550,000");
            System.out.println("PREMIUM + KENDARAAN (4)   Rp.800,000");
            System.out.println("paket apa yang ingin anda mau? 1,2,3 atau 4");
            paket = input.nextInt();
            if (paket == 1)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa dan tiket berjumlah " + harga);
                total = harga * 250;
                System.out.println("Perjalanan ke Enrekang dengan kelas 1 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 2)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium dan tiket berjumlah " + harga);
                total = harga * 500;
                System.out.println("Perjalanan ke Enrekang dengan kelas 2 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 3)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 550;
                System.out.println("Perjalanan ke Enrekang dengan kelas 3 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 4)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 800;
                System.out.println("Perjalanan ke Enrekang dengan kelas 4 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else if ("Enrekang".equalsIgnoreCase(tujuan))
        {
            System.out.println("BIASA               (1)   Rp.300,000");
            System.out.println("PREMIUM             (2)   Rp.500,000");
            System.out.println("BIASA + KENDARAAN   (3)   Rp.600,000");
            System.out.println("PREMIUM + KENDARAAN (4)   Rp.800,000");
            System.out.println("paket apa yang ingin anda mau? 1,2,3 atau 4");
            paket = input.nextInt();
            if (paket == 1)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa dan tiket berjumlah " + harga);
                total = harga * 300;
                System.out.println("Perjalanan ke Palopo dengan kelas 1 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 2)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium dan tiket berjumlah " + harga);
                total = harga * 500;
                System.out.println("Perjalanan ke Palopo dengan kelas 2 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 3)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Biasa + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 600;
                System.out.println("Perjalanan ke Palopo dengan kelas 3 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else if (paket == 4)
            {
                System.out.println("berapa ticket yang ingin dipesan ??");
                harga = input.nextInt();
                System.out.println("Baik dengan kelas Premium + Kendaraan dan tiket berjumlah " + harga);
                total = harga * 800;
                System.out.println("Perjalanan ke Palopo dengan kelas 4 ");
                System.out.println("Total harga yang harus anda bayar adalah Rp." + total);
            }
            else 
            {
                System.out.println("Maaf Inputan Anda Salah");
            }
        }
        else
        {
            System.out.println("Maaf Ada Kesalahan Dalam Inputan Anda");
            System.out.println("Mohon Perhatikan Inputan Anda");
        }
    }
    
}
