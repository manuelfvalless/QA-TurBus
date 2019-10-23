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

public class W2E1_Caso011Safari {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "/Users/MAC-Inovabiz/jenkins/workspace/Web_2.0_Safari/bin/web2_0/evidencia/W2E1_Caso011Safari/";
	private static final String EVIDENCIAZIP = "/Users/MAC-Inovabiz/jenkins/workspace/Web_2.0_Safari/bin/web2_0/evidencia/testW2E1_Caso011Safari.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {// En este m�todo se indica la url y el browser a utilizar
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        driver = new SafariDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
        driver.manage().window().setSize(new Dimension(767,768));
	}

	@Test
	public void testW2E1_Caso011() throws Exception {// Compra ida y vuelta, Santiago - Temuco 5 pasajeros 
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
			driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("temuco");
			logEjecucion.append("Ciudad destino Temuco ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
			logEjecucion.append("Selecciona de la lista Temuco ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("fechaIda")).click();// Id y vuelta
			getFoto(driver);
			Thread.sleep(1000);
			int dia = 0;
			WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div[1]/table"));
			List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
			tableRows.get(dia);
			WebElement element = tableRows.get(dia);
			element.click();
			logEjecucion.append("Selecciona fecha de viaje ida ");
			getFoto(driver);
			Thread.sleep(1000);
			element = null;
			element = tableRows.get(2);
			element.click();
			logEjecucion.append("Selecciona fecha de viaje vuelta ");
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
			logEjecucion.append("Selecciona cantidad de pasajeros 5 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("buscarPasaje")).click();
			logEjecucion.append("Busca pasajes ");
			getFoto(driver);
			Thread.sleep(20000);
			driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();// Selecciona itinerario
			logEjecucion.append("Selecciona itinerario ida ");
			getFoto(driver);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
			logEjecucion.append("Confirma itinerario ida ");
			getFoto(driver);
			Thread.sleep(5000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,-450)");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();
			logEjecucion.append("Selecciona itinerario vuelta ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
			logEjecucion.append("Confirma itinerario vuelta ");
			getFoto(driver);
			Thread.sleep(5000);
			driver.findElement(By.id("idPersona")).clear();// Datos pasajeros
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
			logEjecucion.append("Ingresa apellido pasajero 2 ");
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
			logEjecucion.append("Ingresa apellido pasajero 5 ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[7]/button")).click();
			logEjecucion.append("Continuar con la selecci�n de asientos ");
			getFoto(driver);
			Thread.sleep(8000);
			int asientoIda = 5;
			WebElement asientosIda = driver.findElement(By.className("bus_seat"));// Seleccci�n de asientos ida
			List<WebElement> tableAsientos = asientosIda.findElements(By.className("seat-undefined"));
			for (int i = 1; i <= asientoIda; i++) {
				element = null;
				element = tableAsientos.get(i);
				element.click();
				getFoto(driver);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li/button")).click();
				logEjecucion.append("Selecciona asiento viaje ida de pasajero " + i + " ");
				getFoto(driver);
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//div[2]/button")).click();
			logEjecucion.append("Continuar con la selecci�n de asiento viaje vuelta ");
			getFoto(driver);
			Thread.sleep(15000);
			int asientoVuelta = 5;
			WebElement asientosVuelta = driver.findElement(By.className("bus_seat"));// Seleccci�n de asientos vuelta
			List<WebElement> tableAsientosVuelta = asientosVuelta.findElements(By.className("seat-undefined"));
			for (int i = 1; i <= asientoVuelta; i++) {
				element = null;
				element = tableAsientosVuelta.get(i);
				element.click();
				getFoto(driver);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li/button")).click();
				logEjecucion.append("Selecciona asiento viaje vuelta de pasajero " + i + " ");
				getFoto(driver);
				Thread.sleep(1000);
			}
			driver.findElement(By.xpath("//div[2]/button")).click();
			logEjecucion.append("Continuar con el ingreso de datos del comprador ");
			getFoto(driver);
			Thread.sleep(8000);
			driver.findElement(By.id("nombreComprador")).clear();// Datos comprador
			driver.findElement(By.id("nombreComprador")).sendKeys("Carlos");
			logEjecucion.append("Ingresa nombre del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("lastname")).clear();
			driver.findElement(By.id("lastname")).sendKeys("segura");
			logEjecucion.append("Ingresa apellido del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
			driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("marquez");
			logEjecucion.append("Ingresa segundo apellido del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("rut")).clear();
			driver.findElement(By.id("rut")).sendKeys("10073319-6");
			logEjecucion.append("Ingresa RUT del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("phone")).clear();
			driver.findElement(By.id("phone")).sendKeys("2233445566");
			logEjecucion.append("Ingresa nro de telf del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("mvalles@inovabiz.com");
			logEjecucion.append("Ingresa email del comprador ");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.id("pay")).click();
			logEjecucion.append("Accede a webpay ");
			getFoto(driver);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[2]/h3")).click();// Ingreso a webpay
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