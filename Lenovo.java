paket  Nusput . P6 . Laptopku ;

 kelas  publik Lenovo  mengimplementasikan  Laptop {
     volume int  pribadi ;
    boolean  is_power_on ;

    publik  Lenovo (){
        ini . volum = 50 ;
    }

    @ Ganti
    public  void  powerOn (){
        is_power_on = benar ;
        Sistem . keluar . println ( "Laptop Hidup" );
        Sistem . keluar . println ( "Lenovo ThinkPad" );
    }

    @ Ganti
    public  void  powerOff (){
        is_power_on = salah ;
        Sistem . keluar . println ( "Matikan dalam proses..." );
    }

    @ Ganti
    public  void  volumeUp (){
        jika ( is_power_on ){
            if ( ini . volume == MAX_VOL ){
                Sistem . keluar . println ( "Volume Penuh " );
            }
            lain {
                ini . volum += 10 ;
                Sistem . keluar . println ( "Volume adalah : " + getVolume ());
            }
        }
    }

    @ Ganti
     volume batal  publikDown (){
        jika ( is_power_on ){
            if ( ini . volume == MIN_VOL ){
                Sistem . keluar . println ( "Volumenya 0%" );
            }
            lain {
                ini . volume -= 10 ;
                Sistem . keluar . println ( "Volume adalah : " + getVolume ());
            }
        }
    }

    publik  int  getVolume (){
        kembali  ini . volume ;
    }
}
