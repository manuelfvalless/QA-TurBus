package web2_0;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W2E1_Caso032_033_034Android {
	
	private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    Mantis mantis = new Mantis();
   	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso032_033_034Android";
   	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso032_033_034Android.zip";
   	private StringBuilder logEjecucion = new StringBuilder();
   	String className = this.getClass().getSimpleName();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {//En este método se indica la url y el browser a utilizar
        System.setProperty("webdriver.chrome.driver", "bin/web2_0/driver/chromedriver.exe");
        baseUrl = "http://172.20.4.233:8080/turbuscl/";
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Galaxy S5"); ChromeOptions chromeOptions = 
		new ChromeOptions(); chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
    }

    @Test //Validación correspondiente a datos del comprador, no genera el pago sin indicar el telf y correo
    public void testW2E1_Caso032_033_034() throws Exception{
        try {
    	driver.get(baseUrl);
    	logEjecucion.append("Se ingresa a la pág: " + baseUrl + " ");
        Thread.sleep(3000);
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
        driver.findElement(By.xpath("//div[2]/div/label/span")).click();//solo ida
        logEjecucion.append("Selecciona tipo de viaje sólo ida ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();
        logEjecucion.append("Selecciona fecha ");
        getFoto(driver);
        Thread.sleep(1000);
        int dia = 1;
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendarSingle\"]/div/div[1]/table"));
        List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
        tableRows.get(dia);
        WebElement element =tableRows.get(dia);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("confirmarFechaBtn")).click();
	    logEjecucion.append("Confirma fecha ");
	    getFoto(driver);
	    Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//span/strong")).getText(), "1");
            System.out.println(driver.findElement(By.xpath("//span/strong")).getText());
            getFoto(driver);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("buscarPasaje")).click();
        logEjecucion.append("Buscar pasaje ");
        getFoto(driver);
        Thread.sleep(18000);
        try {
            assertEquals(driver.findElement(By.xpath("//h2")).getText(), "SELECCIONA TU PASAJE DE IDA");
            System.out.println(driver.findElement(By.xpath("//h2")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div")).click();
        logEjecucion.append("Selecciona itinerario ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        logEjecucion.append("Confirmar itinerario ");
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[2]/label/span")).click();
        logEjecucion.append("Selecciona identificación pasaporte ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("3456789");
        logEjecucion.append("Ingresa nro de pasaporte ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Pedro");
        logEjecucion.append("Ingresa nombre de pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
        logEjecucion.append("Ingresa apellido de pasajero ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/button")).click();
        logEjecucion.append("Continuar con la selección de asiento ");
        getFoto(driver);
        Thread.sleep(8000);
        int asiento=0;
        WebElement asientos = driver.findElement(By.className("bus_seat"));//Selecciona asientos
        List<WebElement> tableAsientos = asientos.findElements(By.className("seat-undefined"));
        tableAsientos.get(asiento);
        element=null;
        element=tableAsientos.get(asiento);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/button")).click();
        logEjecucion.append("Selección de asiento ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/button")).click();
        logEjecucion.append("Continuar con el ingreso de datos del comprador ");
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.id("nombreComprador")).clear();
        driver.findElement(By.id("nombreComprador")).sendKeys("Pedro");
        logEjecucion.append("Ingreso de nombre del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Perez");
        logEjecucion.append("Ingreso de apellido del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("Perez");
        logEjecucion.append("Ingreso de 2do apellido del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/label/span")).click();
        logEjecucion.append("Selecciona identificación pasaporte ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("dni")).clear();
        driver.findElement(By.id("dni")).sendKeys("3344556");
        logEjecucion.append("Ingreso de nro pasaporte ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("phone")).sendKeys("2");
        logEjecucion.append("Ingreso de nro telf ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[6]/div/div/div/div/p")).getText(), "Debe ingresar un numero de telefono");
            System.out.println(driver.findElement(By.xpath("//div[6]/div/div/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("email")).sendKeys("d");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[7]/div/div/div/div/p")).getText(), "Debe ingresar un correo electronico valido");
            System.out.println(driver.findElement(By.xpath("//div[7]/div/div/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        if (driver.findElement(By.id("pay")).isEnabled()) {
            System.out.println("Error, permite continuar sin agregar número de telf y email del comprador");
            element = null;
            element = driver.findElement(By.id("pay"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            getFoto(driver);
        } else {
            System.out.println("Verificación exitosa, no permite continuar la compra sin agregar número de telf y email del comprador");
            element = null;
            element = driver.findElement(By.id("pay"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
            getFoto(driver);
        }
        } catch (Exception e) {
			System.err.println("No es posible interactuar con los elementos de la página, se sugiere consultar la evidencia para más detalle");
			logEjecucion.append("No es posible interactuar con los elementos de la página, se sugiere consultar la evidencia para más detalle");
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