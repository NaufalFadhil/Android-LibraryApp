package com.google.perpustakaandigital.Model;

import com.google.perpustakaandigital.R;

import java.util.ArrayList;

public class BooksData {

    private static String[] bookTitles = {
            "Kami (Bukan) Sarjan Kertas",
            "Kami (Bukan) Jongos Berdasi",
            "Filosofi Teras",
            "Bumi Manusia",
            "Garis Waktu",
            "Konspirasi Alam Semesta",
            "11:11",
            "Arah langkah"
    };

    private static String[] bookDetails = {
            "Di Kampus UDEL, terjebaklah tujuh mahasiswa yang hidup segan kuliah tak mau. Mereka terpaksa kuliah di kampus yang Google saja tak dapat mendeteksi. Cobalah sekarang Anda googling \"Kampus UDEL,\" takkan bertemu!\n" +
                    "\n" +
                    "Alasan mereka masuk UDEL macam-macam. Ada yang otaknya tak mampu masuk negeri, ada yang uang orangtuanya tak cukup masuk swasta unggul, ada pula yang karena... biar kuliah aja.\n" +
                    "\n" +
                    "Hari pertama kuliah, Ibu Lira Estrini - dosen konseling yang masih muda - menggemparkan kelas dengan sebuah kejadian gila, lucu dan tak masuk akal. Ia membawa sekotak piza dan koper berisi tikus. Seisi kelas panik, tapi anehnya, semangat para mahasiswa buangan ini justru terbakar untuk berani bermimpi!\n" +
                    "\n" +
                    "Akankah mereka bertahan di kampus yang amburadul ini? Sekalipun iya, bisakah mereka jadi sarjana yang tidak sekadar di atas kertas?\n" +
                    "\n" +
                    "Buku ini wajib dibaca pelajar SMA, mahasiswa, para orangtua, karyawan, petinggi perusahaan, para pengambil kebijakan di institusi pendidikan, anak start-up, anak muda berkarya, pengemudi ojek online, abang ondel-ondel, hingga Presiden Korea Utara agar kita dapat memutuskan seberapa penting sebenarnya nilai sebuah ijazah.\n" +
                    "\n" +
                    "-------\n" +
                    "\n" +
                    "Tiap kita punya musuh besar.\n" +
                    "\n" +
                    "Ia hadir lebih menakutkan dari kegelapan.\n" +
                    "Menyengat lebih panas dari Aldebaran.\n" +
                    "Lebih berbahaya dari bisa King Cobra yang melumpuhkan.\n" +
                    "Lebih dingin daripada kutub Bumi yang membekukan.\n" +
                    "\n" +
                    "Di mana musuh itu berada? Dalam jiwa kita sendiri.\n" +
                    "Cara menaklukkannya? Engkau sendiri yang tahu, kawan.",
            "Alumni Kampus UDEL kini telah lulus. Masuk ke dunia nyata yang penuh tikus. Ada yang bertahan, ada yang sebentar lagi mampus.\n" +
                    "\n" +
                    "Kerja di Bank EEK? Ada. Kerjanya pindah terus? Ada. Bimbang ikut keinginan orangtua atau ikut kata hati? Ada. Apa lagi pengangguran banyak acara, pasti ada. Namun, diam-diam ada juga yang karirnya lancar, gajinya mekar, dan jodohnya gempar menggelegar.\n" +
                    "\n" +
                    "Mendapat intimidasi dari rekan kerja, lingkungan, dan keluarga itu sudah biasa. Mendapat cemoohan bagi yang ingin berkarya, jelas jauh lebih biasa. Menerima perlakuan semena-mena, hingga tertawaan dan hinaan adalah sarapan pagi.\n" +
                    "\n" +
                    "Akankah mereka bertahan di dunia yang penuh intrik ini? Atau mereka harus jadi jongos berdasi, pura-pura mampu beradaptasi, dengan tantangan dunia yang terus gonta-ganti?\n" +
                    "\n" +
                    "Buku ini wajib dibaca oleh pelajar SMA, mahasiswa, para orangtua, karyawan, petinggi perusahaan, para pencari kerja, mereka yang ingin berkarya, para pengambil kebijakan di berbagai institusi, hingga Presiden Korea Utara agar kita bisa memutuskan apakah besok libur atau kerja dan berkarya.\n" +
                    "\n" +
                    "Buku kedua dari serial novel \"KAMI (BUKAN) SARJANA KERTAS.\"\n" +
                    "\n" +
                    "-------\n" +
                    "\n" +
                    "\"Tak apa rasa lelah hingga ke tulang.\n" +
                    "Untuk tempat yang kita sebut pulang.\n" +
                    "Hidup ini memang soal tualang.\n" +
                    "Bukan soal siapa kalah siapa menang.\"",
            "Apakah kamu sering merasa khawatir akan banyak hal? baperan? susah move-on? mudah tersinggung dan marah-marah di social media maupun dunia nyata?\n" +
                    "\n" +
                    "Lebih dari 2.000 tahun lalu, sebuah mazhab filsafat menemukan akar masalah dan juga solusi dari banyak emosi negatif. Stoisisme, atau Filosofi Teras, adalah filsafat Yunani-Romawi kuno yang bisa membantu kita mengatasi emosi negatif dan menghasilkan mental yang tangguh dalam menghadapi naik-turunnya kehidupan. Jauh dari kesan filsafat sebagai topik berat dan mengawang-awang, Filosofi Teras justru bersifat praktis dan relevan dengan kehidupan Generasi Milenial dan Gen-Z masa kini.",
            "Roman Tetralogi Buru mengambil latar belakang dan cikal bakal nation Indonesia di awal abad ke-20. Dengan membacanya waktu kita dibalikkan sedemikian rupa dan hidup di era membibitnya pergerakan nasional mula-mula, juga pertautan rasa, kegamangan jiwa, percintaan, dan pertarungan kekuatan anonim para srikandi yang mengawal penyemaian bangunan nasional yang kemudian kelak melahirkan Indonesia modern.\n" +
                    "\n" +
                    "Roman bagian pertama; Bumi Manusia, sebagai periode penyemaian dan kegelisahan dimana Minke sebagai aktor sekaligus kreator adalah manusia berdarah priyayi yang semampu mungkin keluar dari kepompong kejawaannya menuju manusia yang bebas dan merdeka, di sudut lain membelah jiwa ke-Eropa-an yang menjadi simbol dan kiblat dari ketinggian pengetahuan dan peradaban.\n" +
                    "\n" +
                    "Pram menggambarkan sebuah adegan antara Minke dengan ayahnya yang sangat sentimentil: Aku mengangkat sembah sebagaimana biasa aku lihat dilakukan punggawa terhadap kakekku dan nenekku dan orangtuaku, waktu lebaran. Dan yang sekarang tak juga kuturunkan sebelum Bupati itu duduk enak di tempatnya. Dalam mengangkat sembah serasa hilang seluruh ilmu dan pengetahuan yang kupelajari tahun demi tahun belakangan ini. Hilang indahnya dunia sebagaimana dijanjikan oleh kemajuan ilmu .... Sembah pengagungan pada leluhur dan pembesar melalui perendahan dan penghinaan diri! Sampai sedatar tanah kalau mungkin! Uh, anak-cucuku tak kurelakan menjalani kehinaan ini.\n" +
                    "\n" +
                    "\"Kita kalah, Ma,\" bisikku.\n" +
                    "\n" +
                    "\"Kita telah melawan, Nak, Nyo, sebaik-baiknya, sehormat-hormatnya.\"",
            "Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau bertemu dengan satu orang yang mengubah hidupmu untuk selamanya. Kemudian, satu orang tersebut akan menjadi bagian terbesar dalam agendamu. Dan hatimu takkan memberikan pilihan apa pun kecuali jatuh cinta, biarpun logika terus berkata bahwa risiko dari jatuh cinta adalah terjerembab di dasar nestapa.\n" +
                    "\n" +
                    "Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau terluka dan kehilangan pegangan. Yang paling menggiurkan setelahnya adalah berbaring, menikmati kepedihan dan membiarkan garis waktu menyeretmu yang niat-tak niat menjalani hidup. Lantas, mau sampai kapan? Sampai segalanya terlambat untuk dibenahi? Sampai cahayamu benar-benar padam? Sadarkah bahwa Tuhan mengujimu karena Dia percaya dirimu lebih kuat dari yang kau duga? Bangkit. Hidup takkan menunggu.\n" +
                    "Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau ingin melompat mundur pada titik-titik kenangan tertentu. Namun tiada guna, garis waktu takkan memperlambat gerakkannya barang sedetik pun. Ia hanya mampu maju, dan terus maju. Dan mau tidak mau, kita harus ikut terseret dalam alurnya. Maka, ikhlaskan saja kalau begitu. Karena sesungguhnya, yang lebih menyakitkan dari melepaskan sesuatu adalah berpegangan pada sesuatu yang menyakitimu secara perlahan.",
            "Seperti apakah warna cinta? Apakah merah muda mewakili rekahannya, ataukah kelabu mewakili pecahannya?",
            "Orang bilang, jodoh takkan ke mana. Aku rasa mereka keliru. Jodoh akan kemana-mana terlebih dahulu sebelum akhirnya menetap. Ketika waktunya telah tiba, ketika segala rasa sudah tidak bisa lagi dilawan, yang bisa kita lakukan hanyalah merangkul tanpa perlu banyak kompromi.",
            "Bulan April, tahun 2013, berawal dengan niat dan tujuan yang berbeda—salah satunya karena hati yang terluka, tiga pengelana memulai sebuah perjalanan menyusuri daerah-daerah di Indonesia. Lewat cara yang seru tapi menantang, mereka tidak hanya menyaksikan langsung keindahan negeri ini, mereka juga harus menghadapi pertarungan dengan kegelisahan yang dibawa masing-masing.\n" +
                    "\n" +
                    "Arah Langkah bukan sekadar catatan perjalanan yang melukiskan keindahan alam, budaya, dan manusia lewat teks dan foto. Tetapi juga memberikan cerita lain tentang kondisi negeri yang tidak selalu sebagus seperti di layar televisi. Meskipun begitu, semua daerah memang memiliki cerita yang berbeda-beda, namun di dalam perbedaan itu, cinta dan persahabatan selalu bisa ditemukan. "
    };

    private static int[] booksImages = {
            R.drawable.sarjana_kertas,
            R.drawable.jongos_berdasi,
            R.drawable.filosofi_teras,
            R.drawable.bumi_manusia,
            R.drawable.garis_waktu,
            R.drawable.konspirasi_alam,
            R.drawable.sebelas,
            R.drawable.arah_langkah
    };

    public static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < bookTitles.length; position++) {
            Book book = new Book();
            book.setTitle(bookTitles[position]);
            book.setDetail(bookDetails[position]);
            book.setPhoto(booksImages[position]);
            list.add(book);
        }
        return list;
    }
}

