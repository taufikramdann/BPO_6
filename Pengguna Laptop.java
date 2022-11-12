paket  Nusput . P6 . Laptopku ;

 LaptopUser kelas  publik {
     laptop Laptop  pribadi ;

     Pengguna Laptop publik ( Laptop  laptop ){
        ini . laptop = laptop ;
    }

    void  turnOnLaptop (){
        ini . laptop . daya Hidup ();
    }

    membatalkan  turnOffLaptop (){
        ini . laptop . matikan ();
    }

    batal  makeLaptopLouder (){
        ini . laptop . volumeNaik ();
    }

    membatalkan  makeLaptopSilence (){
        ini . laptop . volume Turun ();
    }
}
