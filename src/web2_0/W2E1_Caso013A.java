package web2_0;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W2E1_Caso013A {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	Mantis mantis = new Mantis();
	private static final String EVIDENCIA = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/W2E1_Caso013A";
	private static final String EVIDENCIAZIP = "C:/jenkins/workspace/Web2.0/bin/web2_0/evidencia/testW2E1_Caso013A.zip";
	private StringBuilder logEjecucion = new StringBuilder();
	String className = this.getClass().getSimpleName();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {// En este método se indica la url y el browser a utilizar
		System.setProperty("webdriver.chrome.driver", "bin/web2_0/driver/chromedriver.exe");
		baseUrl = "http://172.20.4.233:8080/turbuscl/";
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Galaxy S5");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(chromeOptions);

	}

	@Test
	public void testW2E1_Caso013() throws Exception {// Srcipt de prueba, valida error cuando solamente se ingresa ciudad destino
		StringBuilder resultado = new StringBuilder();
		try {
			driver.get(baseUrl);
			Thread.sleep(3000);
			logEjecucion.append("Se ingresa a la pág: " + baseUrl + " ");
			getFoto(driver);
			Thread.sleep(2000);
			driver.findElement(By.id("destino")).click();
			logEjecucion.append("Interacción con campo destino");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div/div/div/label/input")).clear();
			driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("Temuco");
			logEjecucion.append("Ingresa ciudad destino: Temuco");
			getFoto(driver);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).click();
			Thread.sleep(2000);
			resultado.append(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).getText());
			try {
				assertEquals(resultado.toString(), "Ciudades sugeridas");
				System.out.println("No muestra opciones de ciudades, solo muestra el siguiente texto: " + resultado.toString());
				getFoto(driver);
			} catch (Error e) {
				verificationErrors.append(e.toString());
				logEjecucion.append("Mensaje de validación no encontrado");
				Thread.sleep(1000);
				AppZip zip = new AppZip(EVIDENCIAZIP, EVIDENCIA);
				zip.comprimir();
				Thread.sleep(3000);
				mantis.creaIssue(EVIDENCIAZIP, logEjecucion.toString(), className);
			}
		} catch (Exception e) {
			logEjecucion.append("No es posible interactuar con los elementos de la página, se sugiere consultar la evidencia para más detalle");
			System.err.println("No es posible interactuar con los elementos de la página, se sugiere consultar la evidencia para más detalle");
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
			path.mkdirs(); // correct!
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