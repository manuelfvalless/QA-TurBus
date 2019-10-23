package web2_0;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;

public class W2E1_Caso001Iphone {
	
	private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "/Users/MAC-Inovabiz/jenkins/workspace/Web_2.0_Safari/bin/web2_0/evidencia/W2E1_Caso001Safari/";
	private static final String EVIDENCIAZIP = "/Users/MAC-Inovabiz/jenkins/workspace/Web_2.0_Safari/bin/web2_0/evidencia/testW2E1_Caso001Safari.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {//En este m�todo se indica la url y el browser a utilizar
    	System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        driver = new SafariDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
        driver.manage().window().setSize(new Dimension(767,768)); 
    }
    
    @Test
    public void testW2E1_Caso001() throws Exception {//Script de la prueba
        try {
    	driver.get(baseUrl);
        Thread.sleep(6000);
        logEjecucion.append("Se ingresa a la p�g: " + baseUrl + " ");
        getFoto(driver);
        driver.findElement(By.id("origen")).click();
        logEjecucion.append("Hace clic en campo origen ");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("santiago");
        logEjecucion.append("Ciudad origen Santiago ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
        logEjecucion.append("Selecciona de la lista ciudad Santiago ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("destino")).click();
        logEjecucion.append("Hace clic en campo destino ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("Valparaiso");
        logEjecucion.append("Ciudad origen destino Valparaiso ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
        logEjecucion.append("Selecciona de la lista ciudad Valparaiso ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div/label/span")).click();//S�lo ida
        logEjecucion.append("Selecciona viaje s�lo ida ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();
        getFoto(driver);
        Thread.sleep(1000);
        int dia = 1;
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendarSingle\"]/div/div[1]/table"));
        List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
        tableRows.get(dia);
        WebElement element =tableRows.get(dia);
        element.click();
        logEjecucion.append("Selecciona fecha de viaje ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("confirmarFechaBtn")).click();
	    logEjecucion.append("Confirma fecha ");
	    getFoto(driver);
	    Thread.sleep(1000);
        driver.findElement(By.id("buscarPasaje")).click();//Busca pasaje seg�n los datos ingresados
        logEjecucion.append("Busca pasajes ");
        getFoto(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();//Selecciona itinerario
        logEjecucion.append("Selecciona itinerario ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        logEjecucion.append("Confirma itinerario ");
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.id("idPersona")).clear();//Ingresa dots del pasajero
        driver.findElement(By.id("idPersona")).sendKeys("25678525-0");
        logEjecucion.append("Ingresa RUT pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Daniela");
        logEjecucion.append("Ingresa nombre pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Colmenarez");
        logEjecucion.append("Ingresa apellido pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");
        driver.findElement(By.xpath("/html/body/app-root/app-ingresa-pasajero/main/div/div/div[2]/div/form/div[3]/button")).click();
        logEjecucion.append("Continuar con la selecci�n de asiento ");
        getFoto(driver);
        Thread.sleep(8000);
        int asiento=0;//Selecciona asientos
        WebElement asientos = driver.findElement(By.className("bus_seat"));
        List<WebElement> tableAsientos = asientos.findElements(By.className("seat-undefined"));
        tableAsientos.get(asiento);
        element=null;
        element=tableAsientos.get(asiento);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/button")).click();
        logEjecucion.append("Selecci�n de asiento del pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/button")).click();
        logEjecucion.append("Continuar con el ingreso de datos del comprador ");
        getFoto(driver);
        Thread.sleep(15000);
        driver.findElement(By.id("nombreComprador")).click();//Se indica datos del comprador
        logEjecucion.append("Se cargan datos del comprador  ");
        getFoto(driver);
        driver.findElement(By.xpath("//li/button")).click();
        logEjecucion.append("Selecci�n datos del comprador  ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("Varas");
        logEjecucion.append("Ingreso segundo apellido del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("223456789");
        logEjecucion.append("Ingreso nro telf del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("danielacolmenarez@gmail.com");
        logEjecucion.append("Ingreso email del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("pay")).click();//Accede a webpay
        logEjecucion.append("Accede a webpay ");
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[2]/h3")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[2]/a")).click();
        logEjecucion.append("Selecci�n de banco ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.name("pan")).clear();
        driver.findElement(By.name("pan")).sendKeys("4051885600446623");
        logEjecucion.append("Ingreso de nro de tarjeta ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form/button")).click();
        logEjecucion.append("Continuar con el pago ");
        getFoto(driver);
        Thread.sleep(20000);
        driver.switchTo().frame("transicion");
        driver.findElement(By.id("rutClient")).clear();
        driver.findElement(By.id("rutClient")).sendKeys("11.111.111-1");
        logEjecucion.append("Ingreso RUT cliente ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("passwordClient")).clear();
        driver.findElement(By.id("passwordClient")).sendKeys("123");
        logEjecucion.append("Ingreso password de tarjeta ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr[9]/td/input")).click();
        logEjecucion.append("Hacer clic en bot�n Aceptar ");
        getFoto(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td/input")).click();
        logEjecucion.append("Hacer clic en bot�n Continuar ");
        getFoto(driver);
        driver.switchTo().defaultContent();
        Thread.sleep(58000);//Busca si la compra fu exitosa
        try {
            assertEquals(driver.findElement(By.xpath("//h2")).getText(), "TU COMPRA HA SIDO REALIZADA CON �XITO");
            System.out.println(driver.findElement(By.xpath("//h2")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[3]/a")).click();
        logEjecucion.append("Descarga boletos ");
        getFoto(driver);
        Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println("No es posible interactuar con los elementos de la p�gina, se sugiere consultar la evidencia para m�s detalle");
			logEjecucion.append("No es posible interactuar con los elementos de la p�gina, se sugiere consultar la evidencia para m�s detalle");
			getFoto(driver);
			Thread.sleep(1000);
			AppZip zip = new AppZip(EVIDENCIAZIP, EVIDENCIA);
			zip.comprimir();
			Thread.sleep(3000);
			mantis.creaIssue(EVIDENCIAZIP, logEjecucion.toString(), className);
			throw(e);
		}
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        getFoto(driver);
        Thread.sleep(1000);
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
    
    private void getFoto(WebDriver webDriver) {
        try {
            File path = new File(EVIDENCIA);
            path.mkdir();
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
            String timestamp = sd.format(d);
            String imgname = path + "\\" + timestamp + ".png";
            File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(imgname));
        } catch (IOException ex) {
            System.out.println("Error al capturar secuencia: " + ex);
        }
    }	
}