# Selenium Test
## Web Uygulama Testi
 Web uygulama testleri; web üzerinde barınan uygulamaların arabirimleri ve diğer işlevlerini test etmek için kullanılan özel bir test yöntemidir. Uygulamaların tamamen işlevsel, sorunsuz ve güvenli bir şekilde çalışmasını sağlamaktadırlar.
Web uygulamaları için Selenium ile test otomasyonları geliştirilebilir. Peki nedir bu Selenium?

### Selenium Nedir?
 Selenium tarayıcı üzerinden otomasyon yazmamıza yardımcı olan bir araçtır. Örneğin bir web siteniz var burada birden fazla butonlar ve fonksiyonlar bulunmakta. Siz bu sitedeki bütün fonksiyonları kendiniz test etmek yerine Selenium ile bir tane otomasyon yapıp webdriver’ın api sayesinde tek tek işlemleri sanal tarayıcı ile izleyip bu fonksiyonların sıkıntı yaratıp yaratmadığını görebilirsiniz. Ayrıca sitenizi sürekli güncelleyebilir yeni özellikler ekleyebilir mevcut olanları çıkarabilirsiniz. Bu işlemler sonunda mevcut fonksiyonlarınızın düzgün çalışıp çalışmadığını bu otomasyon testler sayesinde test edebilirsiniz. Tabi ki sadece kendi updateleriniz değil tarayıcı updateleri ile de mevcut fonksiyonlarınızın düzgün çalışıp çalışmadığını bir kere yazdığınız testler ile test edebilirsiniz.
   
   ![selenium](https://user-images.githubusercontent.com/57289819/166819789-22187144-5e15-4c23-8f37-2a0aa0ccb7f9.png)

#### Desteklediği Programlama Dilleri ve Tarayıcılar
Selenium farklı programlama dilleri ile yazılabilir. Python, PHP, Java, C#, Ruby…
Tarayıcı olarak ise Firefox, Chrome, Safari, Opera Browser, Internet Explorer desteklenmektedir.
Selenium’u dört ana başlıkta toplayabiliriz. Bunlar;
1.	Selenium IDE
2.	Selenium RC
3.	Selenium WebDriver
4.	Selenium Grid‘dir.

  ![selenium](https://user-images.githubusercontent.com/57289819/166819073-2a71ba12-f637-4e95-9dce-0fbd64691277.png)
### 1.	Selenium IDE
Japonyalı Shinya Kasatani, tarayıcıyı kayıt ve oynatma özellikleriyle otomatikleştirebilen Firefox uzantısı olarak ortaya çıkarttı. IDE, test ortamlarını oluşturmanızı ve düzenlemeler yapmanızı sağlayan ‘kayıt ve oynatma aracıdır’. Selenium testleri için kusursuz bir ortam sağlar.  Tarayıcıda ortaya çıkan etkileşimlerden senaryoları oluşturur ve bu etkileşimlerinizi adımlara dönüştürür. Bu adımlar sonradan Java, Python vb. gibi farklı programlama dilleriyle dışa aktarılır ve yürütülür. Sonuç olarak, sayfalardan veri almak için test komutları sağlar.
### 2.	Uzaktan Kumanda (RC)
Remote Control (RC), Java dilinde yazılmıştır. Selenium Core kullanıcıları, Origin politikasının getirdiği kısıtlamalar yüzünden test edilen uygulamayı ve web sunucusunu kendi bilgisayarlarına kurmak mecburiyetinde kaldılar. Bu gibi nedenlerden dolayı, ThoughtWork mühendisi olan Paul Hammant, tarayıcıya Selenium Core ve test edilen uygulamanın etki alanının aynı olduğunu inandırmak için HTTP üzerinde görevi olan bir sunucu oluşturdu. Bu tasarım Selenium Uzaktan kumanda ya da Selenium 1‘dir.  Fakat Selenium 2’nin piyasaya çıkmasıyla RC kullanımdan kaldırıldı.
### 3.	Web Driver (Web Sürücüsü)
WebDriver 2006 yılında İmon Stewart tarafından ortaya çıkmıştır. Web uygulamalarının Selenium Core'da kısıtlamaları sırasında bulunmuştur. Web Driver, test senaryolarını oluşturmak ve yürütmek için ortaya çıkan programlama arabirimidir. Oluşturulan komut dosyası direk tarayıcıyla etkileşime girmektedir. Böylece Selenium Uzaktan Kumandaya göre daha hızlıdır.  Kısacası Web Driver, tarayıcıyı işletim seviyesinde kontrol edebilen test framework’üdür.
### 4.	Selenium Grid
Grid, Patrick Lightbody tarafından ortaya çıkmıştır. Test süresini mümkün olduğunca en aza indirgemeyi amaçlamıştır ve önemli yerlerde tarayıcıdaki ekran görüntülerini yakalamaya ve aynı zamanda farklı cihazlara komut dosyasını göndermeyi sağlar 

  ![Hub](https://user-images.githubusercontent.com/57289819/166819324-cad5a5fa-1fed-463b-84cb-9e6e06153e70.png)

### ! Bu yazının detaylı Medium anlatımları için:
### ! [Yazılım Kalite Güvencesi ve Yazılım Testi (Selenium ile Web Testi) -1](https://medium.com/@ercelserap/yaz%C4%B1l%C4%B1m-kalite-g%C3%BCvencesi-ve-yaz%C4%B1l%C4%B1m-testi-selenium-ile-web-testi-1-cf381e8e9484) 
### ! [Yazılım Kalite Güvencesi ve Yazılım Testi (Selenium ile Web Testi) -2](https://medium.com/@ercelserap/yaz%C4%B1l%C4%B1m-kalite-g%C3%BCvencesi-ve-yaz%C4%B1l%C4%B1m-testi-selenium-ile-web-testi-2-cb68b1b701ed)
