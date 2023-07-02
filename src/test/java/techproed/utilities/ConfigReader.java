package techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
    ConfigReader sınıfı, bir yapılandırma dosyası olan configuration.properties dosyasını okuyan ve içerisindeki
    özelliklere erişim sağlayan bir yardımcı sınıftır.
     */
    //Önce properties dosyasındaki verileri okuyabilmek için java'dan properties class'ından bir obje oluştururuz
    public static Properties properties;
    /*
    public static Properties properties; ifadesi,
    Properties sınıfından properties adında bir static değişken tanımlar.
    Properties sınıfı, Java'da yapılandırma dosyalarını okumak için kullanılan bir sınıftır.
     */

    //Herşeyden önce çalışması için static bloc içerisinde, oluşturmuş olduğum properties dosyasını tanımlar
    //ve atamasını yaparız. FileInputStream ile dosya yolunu akışa alırız.



    /*
    static blok, sınıf yüklendiğinde bir kez çalışan bir bloktur.
    Bu blok, configuration.properties dosyasını okur ve properties değişkenine yükler.

String dosyaYolu = "configuration.properties"; ifadesi,
okunacak yapılandırma dosyasının yolunu belirtir.

FileInputStream fis = new FileInputStream(dosyaYolu); ifadesi,
dosyaYolu değişkenine göre bir FileInputStream oluşturur ve configuration.properties dosyasını okumak için kullanılır.

properties = new Properties(); ifadesi,
Properties sınıfından bir nesne oluşturur ve properties değişkenine atar.

properties.load(fis); ifadesi,
fis tarafından okunan bilgileri properties nesnesine yükler.
Bu sayede, yapılandırma dosyasındaki özelliklere erişim sağlayabiliriz.
     */
    static {
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties(); //objeyi oluşturduk ve atamasını gerçekleştirdik
            properties.load(fis);//fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //properties dosyasındaki key değerini alıp test methodumda
    //kullanabilmek için bir method oluşturmalıyız






    /*
    public static String getProperty(String Key) metodu, belirli bir özelliğin değerini döndürür.
    Bu metodun bir parametresi vardır: Key, aranan özelliğin anahtarıdır.
     */
    public static String getProperty(String Key){//String bir değer döndürmesi için
                                                 //String bir parametre atarız
        /*
            Test method'undan gönderdiğimiz string key değerini alıp ConfigReader class'ından
        getProperty() methodunu kullanarak bu key'e ait value'yu bize getirir.
         */


        return properties.getProperty(Key);
        /*
        return properties.getProperty(Key); ifadesi,
        properties nesnesinden Key parametresine göre ilgili özelliğin değerini döndürür.
         */
        //burdaki key dğerini test clasında döndürülen değer için configüration propertiisten alır
    }



}