package pkgLatihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan Waktu saat ini sesuai lokasi kita berada
*/
public class SIRegPagi22166008Latihan26 {
  public static void main(String[] args) {
    Date date = new Date();
    // Buat objek SimpleDateFormat untuk memformat hari, tanggal dan waktu
    SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd-MMM-yyyy HH:mm:ss", new Locale("id"));
    //format menampilkan zona waktu di indonesia
    formatter.setTimeZone (java.util.TimeZone.getTimeZone("GMT+7"));
    String formattedDate =formatter.format(date);
    //output hari,tanggal dan waktu saat ini
    System.out.println("Hari ini adalah hari : " + formattedDate);
  }
}
