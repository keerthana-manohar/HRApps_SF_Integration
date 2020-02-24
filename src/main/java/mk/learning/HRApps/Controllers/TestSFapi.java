package mk.learning.HRApps.Controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mk.learning.HRApps.Services.SuccessFactorConnectAPI;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


@RestController
public class TestSFapi {
	
	@Autowired
	SuccessFactorConnectAPI ConnectAPI;
	

	@RequestMapping(value = "/test/{empcode}", method = RequestMethod.GET , produces = "application/json")
	public Object Test(@PathVariable String empcode) throws IOException {
	 Object repon=	ConnectAPI.GenerateToken();
	 OkHttpClient client = new OkHttpClient().newBuilder()
			  .build();
			Request request = new Request.Builder()
			  .url("")
			  .method("GET", null)
			  .addHeader("Authorization", repon.toString())
			  .build();
			Response response = client.newCall(request).execute();
	 return response.body().string();
		
		
	}
}
