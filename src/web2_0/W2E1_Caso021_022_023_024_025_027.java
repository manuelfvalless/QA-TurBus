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
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2E1_Caso021_022_023_024_025_027 {

    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso021_022_023_024_025_027";
	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso021_022_023_024_025_027.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {//En este método se indica la url y el browser a utilizar
        System.setProperty("webdriver.chrome.driver", "bin/web2_0/driver/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "bin/web2_0/driver/geckodriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
        driver.manage().window().maximize();
    }

    @Test //Validación correspondiente a datos de pasajero (no pueden quedar en blanco) selección de asientos
    public void testW2E1_Caso021_022_023_024_025_027() throws Exception {
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
        driver.findElement(By.xpath("//div[2]/div/label/span")).click();//Sólo ida
        logEjecucion.append("Selecciona tipo de viaje sólo ida ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();//Solo Ida
        getFoto(driver);
        Thread.sleep(1000);
        int dia = 0;
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendarSingle\"]/div/div[1]/table"));
        List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
        tableRows.get(dia);
        WebElement element =tableRows.get(dia);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("buscarPasaje")).click();
        logEjecucion.append("Busca pasajes ");
        getFoto(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();
        logEjecucion.append("Selecciona itinerario ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        logEjecucion.append("Confirma itinerario ");
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.id("idPersona")).sendKeys("11");
        logEjecucion.append("Ingresa RUT ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//form/div/div[2]/div/div/p")).getText(), "Debe ingresar un RUT");
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//form/div/div[2]/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("nombrePasajero")).sendKeys("Da");
        logEjecucion.append("Ingresa nombre ");
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/div/div/p")).getText(), "Debe ingresar un nombre");
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//div[3]/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Pe");
        logEjecucion.append("Ingresa apellido ");
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[4]/div/div/p")).getText(), "Debe ingresar un apellido");
            getFoto(driver);
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//div[4]/div/div/p")).getText());
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[2]/label/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("117822789");
        logEjecucion.append("Ingresa RUT ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Daniela");
        logEjecucion.append("Ingresa nombre ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
        logEjecucion.append("Ingresa apellido ");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        logEjecucion.append("Continuar ");
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//button")).click();
        logEjecucion.append("Continuar sin seleccionar asiento ");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//app-popup-error/div/div/p")).getText(), "Debe seleccionar sus asientos antes de continuar.");
            System.out.println("Mensaje: " + driver.findElement(By.xpath("//app-popup-error/div/div/p")).getText());
            logEjecucion.append(driver.findElement(By.xpath("//app-popup-error/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
            logEjecucion.append(verificationErrors.append(e.toString()));
        }
        driver.findElement(By.xpath("//div[2]/a")).click();
        getFoto(driver);
        Thread.sleep(1000);
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