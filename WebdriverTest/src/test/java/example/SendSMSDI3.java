package example;

import java.io.IOException;

import org.testng.annotations.Test;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.MessageStatus;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.messages.TextMessage;

import kong.unirest.Unirest;

public class SendSMSDI3 extends NewTest {
  @Test
  public void FailSMS() throws IOException, NexmoClientException {
	  String NEXMO_API_KEY = "b09b9357";
      String NEXMO_API_SECRET = "2psWek5sMueHonpV";
      String TO_NUMBER = "+919748700373";
      String TO_NUMBER1 = "+917838061776";
      String NEXMO_BRAND_NAME = "The Luxury Closet";
         
      
      
      
      NexmoClient client = NexmoClient.builder().apiKey(NEXMO_API_KEY).apiSecret(NEXMO_API_SECRET).build();
      TextMessage message = new TextMessage(NEXMO_BRAND_NAME,
              TO_NUMBER,
              "!!P0 Critical Alert Desktop Server 188.166.90.228 is down!!"
      );
      

      SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);
      
      
      TextMessage message1 = new TextMessage(NEXMO_BRAND_NAME,
              TO_NUMBER1,
              "!!P0 Critical Alert Desktop Server 188.166.90.228 is down!!"
      );
      

      SmsSubmissionResponse response1 = client.getSmsClient().submitMessage(message1);
      
      kong.unirest.HttpResponse<String> responsew = Unirest
				.get("https://panel.apiwha.com/send_message.php?apikey=13NKKHFNFX1AN36OQL40&number=" + TO_NUMBER
						+ "&text=!!P0+Critical+Alert+Desktop+Server+188.166.90.228+is+down!!")
				.asString();

		kong.unirest.HttpResponse<String> responsew1 = Unirest
				.get("https://panel.apiwha.com/send_message.php?apikey=13NKKHFNFX1AN36OQL40&number=" + TO_NUMBER1
						+ "&text=!!P0+Critical+Alert+Desktop+Server+188.166.90.228+is+down!!")
				.asString();

      if (response.getMessages().get(0).getStatus() == MessageStatus.OK) {
          System.out.println("Message sent successfully.");
      } else {
          System.out.println("Message failed with error: " + response.getMessages().get(0).getErrorText());
      }
	  
  }
    
}
