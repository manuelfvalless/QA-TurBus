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

public class W2E1_Caso046_047_048_049_050_051Android {

	private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
	Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso046Android";
	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso046Android.zip";
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

    @Test //Validación en viaje ida y vuelta, sin agregar datos del comprador
    public void testW2E1_Caso046_047_048_049_050_051() throws Exception{
        try {
        driver.get(baseUrl);
        Thread.sleep(3000);
        logEjecucion.append("Se ingresa a la pág: " + baseUrl + " ");
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
        driver.findElement(By.id("fechaIda")).click();
        logEjecucion.append("Selecciona fecha de viaje ");
        getFoto(driver);
        Thread.sleep(1000);
        int dia = 2;
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div[1]/table"));
        List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
        tableRows.get(dia);
        WebElement element = tableRows.get(dia);
        element.click();
        logEjecucion.append("Selecciona fecha de ida ");
        getFoto(driver);
        Thread.sleep(1000);
        element = null;
        element = tableRows.get(3);
        element.click();
        logEjecucion.append("Selecciona fecha de vuelta ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("confirmarFechaBtn")).click();
	    logEjecucion.append("Confirma fecha ");
	    getFoto(driver);
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//span[3]/button")).click();
        logEjecucion.append("Selecciona 2 pasajeros ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("buscarPasaje")).click();
        logEjecucion.append("Busca pasajes ");
        getFoto(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//div[2]/app-itinerario/div/div/div/div/div")).click();
        logEjecucion.append("Selecciona itinerario ida ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/app-itinerario/div/div[2]/div[3]/a")).click();
        logEjecucion.append("Confirma itinerario ida ");
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[2]/app-itinerario/div/div/div/div/div")).click();
        logEjecucion.append("Selecciona itinerario vuelta ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/app-itinerario/div/div[2]/div[3]/a")).click();
        logEjecucion.append("Confirma itinerario vuelta ");
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("25678522-6");
        logEjecucion.append("Ingresa RUT pasajero 1 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Nelson");
        logEjecucion.append("Ingresa nombre pasajero 1 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Gonzalez");
        logEjecucion.append("Ingresa apellido pasajero 1 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("25678523-4");
        logEjecucion.append("Ingresa RUT pasajero 2 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Maria");
        logEjecucion.append("Ingresa nombre pasajero 2 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Perez");
        logEjecucion.append("Ingresa apellido pasajero 2 ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[4]/button")).click();
        logEjecucion.append("Continuar con la selección de asientos viaje ida ");
        getFoto(driver);
        Thread.sleep(8000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-800)");
        getFoto(driver);
        Thread.sleep(1000);
        int asientoIda = 2;
        WebElement asientosIda = driver.findElement(By.className("bus_seat"));//Selección de asientos
        List<WebElement> tableAsientos = asientosIda.findElements(By.className("seat-undefined"));
        for (int i = 1; i <= asientoIda; i++) {
            element=null;
            element = tableAsientos.get(i);
            element.click();
            getFoto(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li/button")).click();
            logEjecucion.append("Selección de asiento pasajero: "+i+" viaje ida ");
            getFoto(driver);
            Thread.sleep(1000);
        }
        driver.findElement(By.xpath("//div[2]/button")).click();
        logEjecucion.append("Selección de asientos viaje vuelta ");
        getFoto(driver);
        Thread.sleep(8000);
        int asientoVuelta = 1;
        WebElement asientosVuelta = driver.findElement(By.className("bus_seat"));
        List<WebElement> tableAsientosVuelta = asientosVuelta.findElements(By.className("seat-undefined"));
        for (int i = 0; i <= asientoVuelta; i++) {
            element=null;
            element = tableAsientosVuelta.get(i);
            element.click();
            getFoto(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li/button")).click();
            logEjecucion.append("Selección de asiento pasajero: "+i+" viaje vuelta ");
            getFoto(driver);
            Thread.sleep(1000);
        }
        driver.findElement(By.xpath("//div[2]/button")).click();
        logEjecucion.append("Continuar con el ingreso de datos del comprador ");
        getFoto(driver);
        Thread.sleep(8000);
        try {
            assertEquals(driver.findElement(By.xpath("//h2")).getText(), "DATOS COMPRADOR");
            getFoto(driver);
            System.out.println(driver.findElement(By.xpath("//h2")).getText());
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("nombreComprador")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("nombreComprador")).clear();
        driver.findElement(By.id("nombreComprador")).sendKeys("a");
        logEjecucion.append("Ingreso nombre del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div/div/div/div/div/p")).getText(), "Debe ingresar el nombre");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("a");
        logEjecucion.append("Ingreso apellido del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[2]/div/div/div/div/p")).getText(), "Debe ingresar el apellido paterno");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("e");
        logEjecucion.append("Ingreso segundo apellido del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/div/div/div/div/p")).getText(), "Debe ingresar el apellido materno");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        js.executeScript("window.scrollBy(0,500)");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("12");
        logEjecucion.append("Ingreso RUT del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[5]/div/div/div/div/p")).getText(), "Debe ingresar un RUT valido");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("1");
        logEjecucion.append("Ingreso nro telf del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[6]/div/div/div/div/p")).getText(), "Debe ingresar un numero de telefono");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("ds");
        logEjecucion.append("Ingreso email del comprador ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[7]/div/div/div/div/p")).getText(), "Debe ingresar un correo electronico valido");
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        if (driver.findElement(By.id("pay")).isEnabled()) {
            getFoto(driver);
            System.out.println("Permite continuar con el pago sin agregar datos del comprador");
        } else {
            getFoto(driver);
            System.out.println("Validación exitosa, no permite continuar con el pago sin agregar datos del comprador");
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