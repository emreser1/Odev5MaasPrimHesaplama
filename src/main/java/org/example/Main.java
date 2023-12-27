package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int maasPrimHesapla(int calisilanGun){
        int gunlukMaas = 200;
        int gunlukPrim = 1000;
        int hakEdilenPrim ;
        int maasPrimToplam;



        int maas = calisilanGun * gunlukMaas;
        if (calisilanGun>25) {
            hakEdilenPrim = (calisilanGun-25) * gunlukPrim;

        }
        else {
            hakEdilenPrim = 0;

        }
        maasPrimToplam = maas + hakEdilenPrim;

        return maasPrimToplam;








    }
    static int primHesapla(int calisilanGun){

        int gunlukPrim = 1000;
        int hakEdilenPrim ;





        if (calisilanGun>25) {
            hakEdilenPrim = (calisilanGun-25) * gunlukPrim;

        }
        else {
            hakEdilenPrim = 0;

        }
        return hakEdilenPrim;









    }
    public static void main(String[] args) {

        System.out.println("çalışılan gün : " + 15 + " hak edilen prim =" +primHesapla(15) + " hak edilen maaş ve prim toplamı : " + maasPrimHesapla(15) );
        System.out.println("çalışılan gün : " + 28 + " hak edilen prim =" +primHesapla(28) + " hak edilen maaş ve prim toplamı : " + maasPrimHesapla(28) );



    }





}


