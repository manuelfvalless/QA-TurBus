package web2_0;

import biz.futureware.mantis.rpc.soap.client.IssueData;
import biz.futureware.mantis.rpc.soap.client.MantisConnectLocator;
import biz.futureware.mantis.rpc.soap.client.MantisConnectPortType;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Mantis {

	public void creaIssue(String rutaEvidencia, String log, String nombreClase) throws ServiceException, MalformedURLException, RemoteException, IOException {
		MantisConnectLocator mcl = new MantisConnectLocator();
		MantisConnectPortType mcp = mcl.getMantisConnectPort(new URL("http://gestorqa.starken.cl/mantis/api/soap/mantisconnect.php"));
		int id = 523;
		IssueData issue = mcp.mc_issue_get("administrator", "desa.2017", BigInteger.valueOf(id));
		System.out.println("stado:" + issue.toString());
		IssueData defecto = mcp.mc_issue_get("administrator", "desa.2017", BigInteger.valueOf(523));
		System.out.println("defecto " + defecto.getSummary());
		defecto.setDescription(log);
		defecto.setSummary("Defecto automático: "+nombreClase);
		BigInteger defectoAuto = mcp.mc_issue_add("administrator", "desa.2017", defecto);
		System.out.println(rutaEvidencia);
		byte[] fileContent = Files.readAllBytes(new File(rutaEvidencia).toPath());
		mcp.mc_issue_attachment_add("administrator", "desa.2017", defectoAuto, nombreClase +".zip", "zip", fileContent);
	}
}