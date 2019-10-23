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

public class W2E1_Caso003Android {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso003Andorid";
	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso003Andorid.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {// En este m�todo se indica la url y el browser a utilizar
		System.setProperty("webdriver.chrome.driver", "bin/web2_0/driver/chromedriver.exe");
		baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Nexus 5");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
	}

	@Test
	public void testW2E1_Caso003() throws Exception {// Compra s�lo ida, Santigo - Concepci�n 2 pasajeros
		try {
			driver.get(baseUrl);
			Thread.sleep(3000);
			logEjecucion.append("Se ingresa a la p�g: " + baseUrl + " ");
			getFoto(driver);
			driver.findElement(By.id("origen")).click();
			logEjecucion.append("Hace clic en campo origen ");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/div/div/label/input")).clear();
			driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("Santiago");
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
			driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("Concepcion");
			logEjecucion.append("Ciudad destino Concepci�n ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
			logEjecucion.append("Selecciona de la lista ciudad Concepci�n ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div/label/span")).click();// selecciona tipo de viaje "Ida"
			logEjecucion.append("Selecciona viaje s�lo ida ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("fechaIda")).click();
			getFoto(driver);
			Thread.sleep(1000);
			int dia = 3;
			WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendarSingle\"]/div/div[1]/table"));
			List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
			tableRows.get(dia);
			WebElement element = tableRows.get(dia);
			element.click();
			logEjecucion.append("Selecciona fecha de viaje ");
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
			driver.findElement(By.xpath("//div[2]/app-itinerario/div/div/div/div/div/div/div[2]")).click();// Selecciona itinerario
			logEjecucion.append("Selecciona itinerario ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/app-itinerario/div/div[2]/div[3]/a")).click();
			logEjecucion.append("Confirma itinerario ");
			getFoto(driver);
			Thread.sleep(8000);
			driver.findElement(By.id("idPersona")).clear();// Datos del pasajero
			driver.findElement(By.id("idPersona")).sendKeys("25678530-7");
			logEjecucion.append("Ingresa RUT pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("nombrePasajero")).clear();
			driver.findElement(By.id("nombrePasajero")).sendKeys("Maria");
			logEjecucion.append("Ingresa nombre pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("apellidoPasajero")).clear();
			driver.findElement(By.id("apellidoPasajero")).sendKeys("Marquez");
			logEjecucion.append("Ingresa apellido pasajero 1 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("25678531-5");
			logEjecucion.append("Ingresa RUT pasajero 2 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Alvaro");
			logEjecucion.append("Ingresa nombre pasajero 2 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
			driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Segura");
			logEjecucion.append("Ingresa apellido pasajero 2 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[4]/button")).click();
			logEjecucion.append("Continuar con la selecci�n de asiento ");
			getFoto(driver);
			Thread.sleep(8000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-500)");
			getFoto(driver);
			Thread.sleep(1000);
			int asientoIda = 2;
			WebElement asientosIda = driver.findElement(By.className("bus_seat"));// Selecci�n de asientos
			List<WebElement> tableAsientos = asientosIda.findElements(By.className("seat-undefined"));
			for (int i = 1; i <= asientoIda; i++) {
				element = null;
				element = tableAsientos.get(i);
				element.click();
				getFoto(driver);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li/button")).click();
				logEjecucion.append("Selecci�n de asiento de pasajero: " + i + " ");
				getFoto(driver);
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//div[2]/button")).click();
			logEjecucion.append("Continuar con el ingreso de datos del comprador ");
			getFoto(driver);
			Thread.sleep(8000);
			driver.findElement(By.id("nombreComprador")).clear();// Datos del comprador
			driver.findElement(By.id("nombreComprador")).sendKeys("Carlos");
			logEjecucion.append("Ingresa nombre comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys("segura");
			logEjecucion.append("Ingresa apellido comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
			driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("marquez");
			logEjecucion.append("Ingresa segundo apellido comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("rut")).clear();
			driver.findElement(By.id("rut")).sendKeys("10073319-6");
			logEjecucion.append("Ingresa RUT comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("2233445566");
			logEjecucion.append("Ingresa nro telf comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("mvalles@inovabiz.com");
			logEjecucion.append("Ingresa emai comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("pay")).click();
			logEjecucion.append("Accede a webpay ");
			getFoto(driver);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[2]/h3")).click();// Ingresa a webpay
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
			Thread.sleep(58000);
			try {// Valida la compra
				assertEquals(driver.findElement(By.xpath("//h2")).getText(), "TU COMPRA HA SIDO REALIZADA CON �XITO");
				System.out.println(driver.findElement(By.xpath("//h2")).getText());
				getFoto(driver);
				Thread.sleep(1000);
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
		} catch (Exception e) {
			System.err.println("No es posible interactuar con los elementos de la p�gina, se sugiere consultar la evidencia para m�s detalle");
			logEjecucion.append("No es posible interactuar con los elementos de la p�gina, se sugiere consultar la evidencia para m�s detalle");
			getFoto(driver);
			Thread.sleep(1000);
			AppZip zip = new AppZip(EVIDENCIAZIP, EVIDENCIA);
			zip.comprimir();
			Thread.sleep(3000);
			mantis.creaIssue(EVIDENCIAZIP, logEjecucion.toString(), className);
			throw (e);
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