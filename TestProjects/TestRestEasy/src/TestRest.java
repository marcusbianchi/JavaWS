import java.util.ArrayList;
import java.util.Random;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class TestRest extends Thread {
	Random gerador = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			(new Thread(new TestRest())).start();
		}

	}

	public void run() {
		int id = gerador.nextInt();
		try {			
			ResteasyClient client = new ResteasyClientBuilder().disableTrustManager().build();
			WebTarget target1 = client.target(
					"https://sophia-dev.us-west-2.elasticbeanstalk.com/DataCapturing/datacapturing/datacapturingservice");
			ResteasyWebTarget target = (ResteasyWebTarget) target1;
			RecievingDataInterface customerProxy = target.proxy(RecievingDataInterface.class);
			for (int i = 0; i < 100; i++) {
				GlobalData rd = new GlobalData();
				rd.setAccountID(1);
				rd.setdataSourceID(2);
				ReceivingData rsd = new ReceivingData();
				rsd.setEquipmentID(12);
				ArrayList<MeasuredData> md = new ArrayList<MeasuredData>();
				for (int j = 0; j < 1000; j++) {
					MeasuredData ms = new MeasuredData("Número " + j + gerador.nextDouble(), gerador.nextFloat(),
							gerador.nextLong());
					md.add(ms);
				}
				rsd.setMeasuredDataList(md);
				ArrayList<ReceivingData> msd = new ArrayList<ReceivingData>();
				msd.add(rsd);
				rd.setRegisteredEquipment(msd);
				Response response = customerProxy.createCustomer(rd);
				System.out.println(response.readEntity(String.class));
				System.out.println("Done " + i + " ID: " + id);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());

		}
	}

}
