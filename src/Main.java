import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Patika.dev egitim kampi proje odevidir.

        /*Artık Yıl Nedir?

        Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün),
        normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

        Artık Yıl Nasıl Hesaplanır?

        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil,
        yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.*/

        int yıl;
        boolean artıkMı = false;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hesaplamak istediginiz yili giriniz = ");

        yıl = inp.nextInt();

        if(yıl % 4 == 0){
            if(yıl % 100 == 0){
                if(yıl % 400 == 0){
                    artıkMı = true;
                }else{
                    artıkMı = false;
                }
            }else{
                artıkMı = true;
            }
        }else{
            artıkMı = false;
        }

        if(artıkMı){
            System.out.println("Girmis oldugunuz yil artik yildir. "+yıl);
        }else{
            System.out.println("Girmis oldugunuz yil artik yil degildir."+yıl);
        }

    }
}
