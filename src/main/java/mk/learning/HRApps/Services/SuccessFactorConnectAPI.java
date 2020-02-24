package mk.learning.HRApps.Services;



import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Component
public class SuccessFactorConnectAPI {
	
	@SuppressWarnings("unchecked")
	public Object  GenerateToken() throws IOException
	{
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
		/***learn****/
		//client.interceptors();
				Request request = new Request.Builder()
				  .url("")
				  .method("GET", null)
				  .addHeader("","")
				  .build();
				Response response = client.newCall(request).execute();
				//System.out.println(response.body().string());
				ObjectMapper om = new ObjectMapper();
				Map <String,Object> repMap= om.readValue(response.body().string(), Map.class);
				repMap.get("Token");
				System.out.println(repMap.get("Token"));
				return repMap.get("Token");
	}
	
	
}
