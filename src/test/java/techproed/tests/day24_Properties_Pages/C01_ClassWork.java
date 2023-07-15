package techproed.tests.day24_Properties_Pages;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_ClassWork {
        /*
        Driver sınıfı, WebDriver nesnesinin yönetildiği bir sınıftır.
        Bu sınıf, WebDriver nesnesinin yalnızca bir örneğine sahip olmasını
        sağlayan Singleton desenini uygulayabilir

getDriver() metodu, Driver sınıfının bir yöntemidir.
Bu yöntem, WebDriver örneğini döndürür.

ConfigReader sınıfı, yapılandırma dosyasından veri okumak için kullanılan
bir sınıftır.

getProperty("amazon_URL") ifadesi, "amazon_URL" adlı bir özelliği
(amazon_URL yerine gerçek bir özellik adı olabilir) ConfigReader sınıfından okur.

Şimdi, kod parçasının çalışma mantığını adım adım açıklayalım:

Driver.getDriver() ifadesi, Driver sınıfının getDriver() yöntemini çağırır.
Bu yöntem, WebDriver nesnesini döndürür. Örneğin,
WebDriver driver = Driver.getDriver(); şeklinde kullanılabilir.

ConfigReader.getProperty("amazon_URL") ifadesi,
ConfigReader sınıfının getProperty() yöntemini çağırır
ve "amazon_URL" özelliğini (Amazon URL'si gibi) alır.
Bu özellik, yapılandırma dosyasında tanımlanmış olmalıdır.

getDriver().get(ConfigReader.getProperty("amazon_URL")) ifadesi,
WebDriver nesnesini alır ve get() yöntemini çağırarak belirtilen
Amazon URL'sine yönlendirme yapar.

Sonuç olarak, verdiğiniz kod parçası,
Singleton deseni kullanarak bir WebDriver nesnesi alır,
ConfigReader sınıfından Amazon URL'sini okur ve WebDriver
nesnesini bu URL'ye yönlendirir. Bu şekilde,
Amazon sayfasına erişim sağlanmış olur.
         */



    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        Driver.closeDriver();
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));

    }
}
