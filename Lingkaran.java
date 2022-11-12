paket  Nusput . P6 . Bangun_Datar ;

 kelas  publik Lingkaran  extends  BangunDatar {

    apung  jari_jari ;

     Lingkaran publik ( float  jari_jari ){
        ini . jari_jari = jari_jari ;
    }

    @ Ganti
    float  getLuas () {
        kembali ( float ) Matematika . PI * jari_jari * jari_jari ;
    }
}
