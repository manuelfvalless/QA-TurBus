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

public class W2E1_Caso045Iphone {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso045Iphone";
	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso045Iphone.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {// En este método se indica la url y el browser a utilizar
		System.setProperty("webdriver.chrome.driver", "bin/web2_0/driver/chromedriver.exe");
		baseUrl = "http://172.20.4.233:8080/turbuscl/";
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "iPhone 6/7/8"); ChromeOptions chromeOptions = 
		new ChromeOptions(); chromeOptions.setExperimentalOption("mobileEmulation",mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
	}

	@Test // Validación con respecto a la selección de asientos cuando el viaje es ida y vuelta
	public void testW2E1_Caso045() throws Exception{
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
			driver.findElement(By.id("fechaIda")).click();
			logEjecucion.append("Selecciona fecha de viaje ");
			getFoto(driver);
			Thread.sleep(1000);
			int dia = 0;
			WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div[1]/table"));
			List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
			tableRows.get(dia);
			WebElement element = tableRows.get(dia);
			element.click();
			logEjecucion.append("Selecciona fecha de ida ");
			getFoto(driver);
			Thread.sleep(1000);
			element = null;
			element = tableRows.get(2);
			element.click();
			logEjecucion.append("Selecciona fecha de vuelta ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("confirmarFechaBtn")).click();
		    logEjecucion.append("Confirma fecha ");
		    getFoto(driver);
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//span[3]/button")).click();
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[3]/button")).click();
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[3]/button")).click();
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[3]/button")).click();
			logEjecucion.append("Selecciona 5 asientos ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("buscarPasaje")).click();
			logEjecucion.append("Busca pasajes ");
			getFoto(driver);
			Thread.sleep(20000);
			driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();
			logEjecucion.append("Selecciona itinerario ida ");
			getFoto(driver);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
			logEjecucion.append("Confirma itinerario ida ");
			getFoto(driver);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[2]/app-itinerario/div/div/div/div/div")).click();
			logEjecucion.append("Selecciona itinerario vuelta ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/app-itinerario/div/div[2]/div[3]/a")).click();
			logEjecucion.append("Confirma itinerario vuelta ");
			getFoto(driver);
			Thread.sleep(5000);
			driver.findElement(By.id("idPersona")).clear();
			driver.findElement(By.id("idPersona")).sendKeys("256785315");
			logEjecucion.append("Ingresa RUT pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("nombrePasajero")).clear();
			driver.findElement(By.id("nombrePasajero")).sendKeys("Pedro");
			logEjecucion.append("Ingresa nombre pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("apellidoPasajero")).clear();
			driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
			logEjecucion.append("Ingresa apellido pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("167591507");
			logEjecucion.append("Ingresa RUT pasajero 2 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Carla");
			logEjecucion.append("Ingresa nombre pasajero 2 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Gonzalez");
			logEjecucion.append("Ingresa apellido pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/div[2]/label/input")).clear();
			driver.findElement(By.xpath("//div[3]/div[2]/label/input")).sendKeys("184745305");
			logEjecucion.append("Ingresa RUT pasajero 3 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/div[3]/label/input")).clear();
			driver.findElement(By.xpath("//div[3]/div[3]/label/input")).sendKeys("Maria");
			logEjecucion.append("Ingresa nombre pasajero 3 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/div[4]/label/input")).clear();
			driver.findElement(By.xpath("//div[3]/div[4]/label/input")).sendKeys("Perez");
			logEjecucion.append("Ingresa apellido pasajero 3 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[4]/div[2]/label/input")).clear();
			driver.findElement(By.xpath("//div[4]/div[2]/label/input")).sendKeys("184745305");
			logEjecucion.append("Ingresa RUT pasajero 4 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[4]/div[3]/label/input")).clear();
			driver.findElement(By.xpath("//div[4]/div[3]/label/input")).sendKeys("Daniela");
			logEjecucion.append("Ingresa nombre pasajero 4 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[4]/div[4]/label/input")).clear();
			driver.findElement(By.xpath("//div[4]/div[4]/label/input")).sendKeys("Gonzalez");
			logEjecucion.append("Ingresa apellido pasajero 4 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[5]/div[2]/label/input")).clear();
			driver.findElement(By.xpath("//div[5]/div[2]/label/input")).sendKeys("141590707");
			logEjecucion.append("Ingresa RUT pasajero 5 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[5]/div[3]/label/input")).clear();
			driver.findElement(By.xpath("//div[5]/div[3]/label/input")).sendKeys("Claudia");
			logEjecucion.append("Ingresa nombre pasajero 5 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[5]/div[4]/label/input")).clear();
			driver.findElement(By.xpath("//div[5]/div[4]/label/input")).sendKeys("Perez");
			logEjecucion.append("Ingresa nombre pasajero 5 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[7]/button")).click();
			logEjecucion.append("Continuar con la selección de asientos ");
			getFoto(driver);
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-850)");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/button")).click();
			logEjecucion.append("Continuar con el pago de pasajes ");
			getFoto(driver);
			Thread.sleep(1000);
			try {
				assertEquals(driver.findElement(By.xpath("//app-popup-error/div/div/p")).getText(),"Debe seleccionar sus asientos antes de continuar.");
				getFoto(driver);
				System.out.println(driver.findElement(By.xpath("//app-popup-error/div/div/p")).getText());
				Thread.sleep(1000);
			} catch (Error e) {
				verificationErrors.append(e.toString());
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