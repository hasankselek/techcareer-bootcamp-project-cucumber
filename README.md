# TechCareer QA Mastery Bootcamp İçin Hazırlanan Proje

Bu proje, TechCareer tarafından gerçekleştirilen QA Mastery Bootcamp için hazırlanmıştır. Proje, Trendyol Türkiye web sitesi üzerinde çeşitli otomasyon senaryolarını içerir ve Selenium WebDriver, Cucumber gibi popüler test otomasyon araçları kullanılarak geliştirilmiştir. Bu proje, UI test otomasyonu testlerini kapsar.

## Kullanılan Teknolojiler

- **Java 17**: Projenin ana programlama dili.
- **Maven**: Proje yönetimi ve bağımlılık yönetimi için kullanıldı.
- **Selenium WebDriver**: Web sayfalarını otomatikleştirilmiş testler ile doğrulamak için kullanıldı.
- **Cucumber**: BDD (Behavior-Driven Development) çerçevesi ile test senaryolarını yazmak için kullanıldı.
- **JUnit**: Testlerin yürütülmesi ve raporlanması için kullanıldı.
- **JavaFaker**: Test verilerini dinamik olarak üretmek için kullanıldı.
- **ExtendReports**: Test sonuçlarını daha ayrıntılı olarak üretmek için kullanıldı.
- **Jenkins**:GitHub entegre edilerek, her kod değişikliği yapıldığında otomatik olarak bir işlem başlatılabildi, böylece hatalar erken aşamada tespit edilip düzeltildi.

## Proje Yapısı

- **`src/test/java/`**: Test senaryolarını ve adım tanımlarını içerir.
- **`src/main/resources/`**: Test senaryolarında kullanılan konfigürasyon dosyalarını içerir.
- **`pom.xml`**: Projede kullanılan tüm bağımlılıkları yöneten Maven yapılandırma dosyası.

## Özellikler

- **Giriş Yapma Senaryosu**: Kayıtlı kullanıcıların Trendyol Türkiye web sitesine giriş yapmalarını doğrular.
- **Ürünleri Favorilere Ekleme ve Çıkartma Senaryosu**: Ürünleri favorilere ekleme,çıkartma durumlarını test eder ve doğru ürün eklenip eklenmedigini doğrular
- **Sepete Ürün Ekleme Senaryosu**: Ürünleri sepete ekleme,çıkartma durumlarını,ürün sayısı ve ismi kontrollerini test eder. 
- **Ürün Filtreleme Senaryosu**: Çeşitli markalara ait dizüstü bilgisayarları filtreler ve bu ürünlerin doğru sıralandığını kontrol eder.
- **Ücretsiz Kargo Doğrulama Senaryosu**: Ürünlerde ücretsiz kargo olup olmadığını doğrular.
- **Negatif Senaryolar**: Yanlış giriş bilgileri ve hatalı kayıt işlemleri gibi durumları test eder.

## Raporlama

- **Cucumber Raporlama:** Test sonuçları, Cucumber tarafından oluşturulan HTML raporları ile ayriyeten "Extend Reports" ile daha ayrıntılı olarak incelenebilir.
         
- Bu raporlar, testlerin detaylı bir şekilde incelenmesini sağlar ve `target/Trendyol Reports` dizininde HTML,JSON,XML formatında saklanır.

- Maven komutu ile testleri çalıştırdığınızda raporlar 2 farklı türde olacak şekilde otomatik olarak oluşturulur.
  `target/cucumber-html-reports.html` ve `target/Trendyol Reports` dosyasında bulunur.

## Kurulum ve Çalıştırma

1. **Bağımlılıkları Yükleme**:
    - Maven aracılığıyla projenin bağımlılıklarını indirmek için `mvn clean install` komutunu çalıştırın.

2. **Testleri Çalıştırma**:
    - `src/test/java` altındaki test senaryolarını çalıştırmak için `mvn test` komutunu kullanın.
    - Test sonuçları JUnit veya Cucumber raporları ile `target/Trendyol Reports` dosyasında görüntülenebilir.

3. **Konfigürasyon**:
    - `configuration.properties` dosyası, test ortamı ayarlarını ve diğer yapılandırma parametrelerini içerir.
    - URL, kullanıcı bilgileri ve diğer parametreler bu dosyada tanımlanmıştır.

## Kullanım Senaryoları

- **Pozitif Senaryolar**: Doğru kullanıcı bilgileri ile giriş yapma, ürün filtreleme, sepete ürün ekleme, favorilere ekleme işlemlerinin doğruluğunu test eder.
- **Negatif Senaryolar**: Yanlış kullanıcı bilgileri ile yapılan işlemlerin uygun hata mesajları ile sonlandığını doğrular.

## Notlar

- Bu proje, TechCareer QA Mastery Bootcamp için bitirme projesi olarak hazırlanmıştır

- Test senaryoları, Trendyol Türkiye web sitesi üzerindeki giriş,ürün filtreleme,sepete ürün ekleme,
  favorilere ekleme işlemlerinin doğruluğunu kontrol etmek için tasarlanmıştır.

- Proje, UI test otomasyonunu kapsayacak şekilde yapılandırılmıştır.

### Test Results

## Extend Reports

![TestResult.png](https://github.com/hasankselek/techcareer-bootcamp-project-cucumber/blob/main/TestsSS/TestResults.png)

## Jenkins Reports

![JenkinsResult.png](https://github.com/hasankselek/techcareer-bootcamp-project-cucumber/blob/main/TestsSS/JenkinsResult.png)






