import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import com.google.gson.Gson;

public class FirstTest {

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) {
		try{
		/*RecievingData rd = new RecievingData();
		rd.setAccountID(1);
		rd.setEquipmentID(1);
		ArrayList<MeasuredData> md = new ArrayList<MeasuredData>();
		MeasuredData ms = new MeasuredData("hoje",5552.5,848466L);
		md.add(ms);
		rd.setMeasuredDataList(md);*/
			
		
		Gson gson =  new Gson();
		String outputString = gson.toJson(rd);     
		
		System.out.println(outputString);
		JSONObject json = new JSONObject(outputString);
		//json.put("hello", "world");
		
		HttpPost httpPost = new HttpPost("http://sophia-dev.elasticbeanstalk.com/DataCapturing/datacapturing/datacapturingservice/capture");
		httpPost.setEntity(new JSONEntity(json, true));		
		
		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpPost);
		IOUtils.copy(httpResponse.getEntity().getContent(), System.out);
		if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
			throw new RuntimeException(httpResponse.toString());
			
		}

		//System.out.println(httpResponse.getEntity().getContent());
		
		}catch(Exception ex){
			System.out.println(ex.toString());
		}

	}

}
