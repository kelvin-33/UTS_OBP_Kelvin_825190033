import java.util.Scanner;

public class Tekateki {
    public String nama;
    public String Idnama;
    public String age;
    String lagi;
    int game;
    int No1,No2,No3,No4,No5;
    int no1,no2,no3,no4,no5,no6,no7,no8,no9,no10;
    int score;
    int bener;
    int salah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdnama() {
        return Idnama;
    }

    public void setIdnama(String idnama) {
        Idnama = idnama;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    Scanner tekateki= new Scanner(System.in);
    public void tekateki1(){
        System.out.println();
        System.out.println("No.1");
        System.out.println("Clue       : Bumi Itu Bulat");
        System.out.println("Pertanyaan : 1+80=?");
        No1 = tekateki.nextInt();

        if (No1 == 3){
            System.out.println("True");
            bener=bener+1;
            score= score +20;
            System.out.println();
            System.out.println("No.2");
            System.out.println("Clue       : Perhatikan dan dengarkan pertanyaannya!");
            System.out.println("Pertanyaan : *Penanya menepuk-nepuk tangan seperti sedang menangkap nyamuk* " +
                                "Ada berapa nyamuk yang ketangkap?");
            No2 = tekateki.nextInt();
        }
        else{
            System.out.println("False");
            System.out.println("Penjelasan :");
            System.out.println("Cluenya adalah bumi itu bulat, jadi pertanyaannya bukanlah tentang hasil penjumlahannya." +
                                "Melainkan yang harus kamu perhatikan adalah berapa jumlah lingkaran yang ada di pertanyaannya, " +
                                "nah di angka 1 tidak ada lingkaran sedangkan di angka 80 ada 3 lingkaran maka jawabannya adalah 3.");
            score = score +0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.2");
            System.out.println("Clue       : Perhatikan dan dengarkan pertanyaannya!");
            System.out.println("Pertanyaan : *Penanya menepuk-nepuk tangan seperti sedang menangkap nyamuk* " +
                                 "Ada berapa nyamuk yang ketangkap?");
            No2 = tekateki.nextInt();

        }


        if (No2 == 5){
            System.out.println("True");
            bener=bener+1;
            score= score +20;
            System.out.println();
            System.out.println("No.3");
            System.out.println("Clue       : Perhatikan dan dengarkan pertanyaannya!");
            System.out.println("Pertanyaan : *Saya Menagkap Nyamuk 5 dan kabur 10, limanya mati* " +
                    "Ada berapa nyamuk yang masuk hidup?");
            No3 = tekateki.nextInt();
        }
        else{
            System.out.println("False");
            System.out.println("Penjelasan :");
            System.out.println("Kamu tidak perlu menghitung berapa kali si penanya menepuk nyamuk, " +
                                "melainkan kamu hanya perlu menghitung jumlah kata dalam pertanyaannya. " +
                                "Pertanyaannya adalah “Ada berapa nyamuk yang ketangkap?” yang mengandung lima kata," +
                                "maka jawabannya adalah lima. Jika pertanyaannya “Berapa yang ketangkap?”, " +
                                "maka jawabannya ialah tiga, dan begitu seterusnya.");
            score = score +0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.3");
            System.out.println("Clue       : Perhatikan dan dengarkan pertanyaannya!");
            System.out.println("Pertanyaan : *Saya Menagkap Nyamuk 5 dan kabur 10, limanya mati* " +
                                "Ada berapa nyamuk yang masuk hidup?");
            No2 = tekateki.nextInt();
        }

        if (No3==6){
            System.out.println("True");
            bener=bener+1;
            score= score +20;
            System.out.println();
            System.out.println("No.4");
            System.out.println("Clue       : Bumi Itu Bulat");
            System.out.println("Pertanyaan : 01x80=?");
            No4 = tekateki.nextInt();
        }
        else {
            System.out.println("False");
            System.out.println("Penjelasan :");
            System.out.println("Kamu tidak perlu menghitung berapa nyamuk yang masuk hidup melainkan menghitung jumlah " +
                                "kata dalam pertanyaanya.Pertanyaannya adalah “Ada berapa nyamuk yang masih hidup?” yang mengandung " +
                                "enam kata,");
            score=score+0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.4");
            System.out.println("Clue       : Bumi Itu Bulat");
            System.out.println("Pertanyaan : 01x80=?");
            No4 = tekateki.nextInt();
        }
        if (No4==4){
            System.out.println("True");
            bener=bener+1;
            score= score+20;
            System.out.println();
            System.out.println("No.5");
            System.out.println("Clue       : Hal pertama yang dilihat saat pertama kali bangun pagi.");
            System.out.println("Pertanyaan : Sekarang saya di lantai 2 kalau saya turun satu lantai lalu belok kiri," +
                                " maka sekarang saya di lantai berapa?");
            No5 = tekateki.nextInt();
        }
        else {
            System.out.println("False");
            System.out.println("Penjelasan :");
            System.out.println("Cluenya adalah bumi itu bulat, jadi pertanyaannya bukanlah tentang hasil penjumlahannya." +
                                " Melainkan yang harus kamu perhatikan adalah berapa jumlah lingkaran yang ada di pertanyaannya, " +
                                "nah di angka 1 tidak ada lingkaran sedangkan di angka 0 didepan 1 ada lingkaran dan 80 ada 3 " +
                                "lingkaran maka jawabannya adalah 4.");
            score=score+0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.5");
            System.out.println("Clue       : Hal pertama yang dilihat saat pertama kali bangun pagi.");
            System.out.println("Pertanyaan : Sekarang saya di lantai 2 kalau saya turun satu lantai lalu belok kiri," +
                    " maka sekarang saya di lantai berapa?");
            No5 = tekateki.nextInt();
        }

        if (No5==4){
            System.out.println("True");
            bener=bener+1;
            score= score +20;
            System.out.println();
        }
        else {
            System.out.println("False");
            score=score+0;
            salah=salah+1;
            System.out.println("Penjelasan :");
            System.out.println("Hal pertama yang dilihat saat pertama kali bangun pagi adalah handphone, " +
                    "nah coba memperhatikan tombol di handphone deh bentuknya seperti gedung berlantai bukan. " +
                    "Penanya sedang di lantai 2 berarti dia berada di tombol 2, lalu turun satu lantai dan ke kiri " +
                    "adalah tombol 4.");
        }


    }

    public void tekateki() {
        System.out.println();
        System.out.println("No.1");
        System.out.println("1,2,4,8,...,32,64");
        no1 = tekateki.nextInt();

        if (no1 == 16) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.2");
            System.out.println("4,8,16,?");
            no2 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("1,2,4,8,16,32,64");
            System.out.println("1+1=2");
            System.out.println("2+2=4");
            System.out.println("4+4=8");
            System.out.println("8+8=16");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.2");
            System.out.println("4,8,16,?");
            no2 = tekateki.nextInt();
        }

        if (no2 == 32) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.3");
            System.out.println("6=30");
            System.out.println("3=15");
            System.out.println("7=35");
            System.out.println("2=?");
            no3 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("4,8,16,32");
            System.out.println("Dikali 2");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.3");
            System.out.println("6=30");
            System.out.println("3=15");
            System.out.println("7=35");
            System.out.println("2=?");
            no3 = tekateki.nextInt();
        }

        if (no3 == 10) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.4");
            System.out.println("4,11,18,?");
            no4 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("2=10");
            System.out.println("dikali 5");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.4");
            System.out.println("4,11,18,?");
            no4 = tekateki.nextInt();
        }

        if (no4 == 25) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.5");
            System.out.println("A+B=60");
            System.out.println("A-B=40");
            System.out.println("A/B=?");
            no5 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("4,11,18,25");
            System.out.println("ditambah 7");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.5");
            System.out.println("A+B=60");
            System.out.println("A-B=40");
            System.out.println("A/B=?");
            no5 = tekateki.nextInt();
        }

        if (no5 == 5) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.6");
            System.out.println("13,18=31");
            System.out.println("7,25=32");
            System.out.println("12,30=42");
            System.out.println("26,13=?");
            no6 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("A/B=5");
            System.out.println("A=50,B=10");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.6");
            System.out.println("13,18=31");
            System.out.println("7,25=32");
            System.out.println("12,30=42");
            System.out.println("26,13=?");
            no6 = tekateki.nextInt();
        }
        if (no6 == 39) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.7");
            System.out.println("8-8/4x3=?");
            no7 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("29,13=39");
            System.out.println("kiri tambah kanan");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.7");
            System.out.println("8-8/4x3=?");
            no7 = tekateki.nextInt();
        }

        if (no7 == 2) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.8");
            System.out.println("11,15,20,?");
            no8 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("8-8/4x3=2");
            System.out.println("dibagi dulu lalu dikali baru dikurang");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.8");
            System.out.println("11,15,20,?");
            no8 = tekateki.nextInt();
        }

        if (no8 == 26) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.9");
            System.out.println("4,8=32");
            System.out.println("5,3=15");
            System.out.println("10,2=20");
            System.out.println("8,6=?");
            no9 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("11,15,20,26");
            System.out.println("11+4=15");
            System.out.println("15+5=20");
            System.out.println("20+6=26");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.9");
            System.out.println("4,8=32");
            System.out.println("5,3=15");
            System.out.println("10,2=20");
            System.out.println("8,6=?");
            no9 = tekateki.nextInt();
        }
        if (no9 == 48) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
            System.out.println();
            System.out.println("No.10");
            System.out.println("8=72");
            System.out.println("2=6");
            System.out.println("5=30");
            System.out.println("9=?");
            no10 = tekateki.nextInt();
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("8,6=48");
            System.out.println("Dikali");
            score = score + 0;
            salah=salah+1;
            System.out.println();
            System.out.println("No.10");
            System.out.println("8=72");
            System.out.println("2=6");
            System.out.println("5=30");
            System.out.println("9=?");
            no10 = tekateki.nextInt();
        }
        if (no10 == 90) {
            System.out.println("True");
            bener=bener+1;
            score = score + 10;
        } else {
            System.out.println("False");
            System.out.println("penjelasan :");
            System.out.println("9=90");
            System.out.println("dikali 1angka lebih besar dari angka kiri");
            score = score + 0;
            salah = salah + 1;
        }
    }

    public String toString() {
        return  "==========Data==========" +
                " \nnama    = " + nama  +
                " \nIdnam   = " + Idnama  +
                " \nage     = " + age  +
                " \ngame    = " + game +
                " \nbener   = " + bener +
                " \nsalah   = " + salah +
                " \nscore   = " + score ;
    }
}
