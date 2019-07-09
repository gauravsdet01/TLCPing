package example;

import java.io.IOException;

import org.testng.annotations.Test;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.MessageStatus;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.messages.TextMessage;

public class SendSMSAdmin2 extends NewTest {
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
              "!!P0 Critical Alert Admin Server 188.166.90.227 is down!!"
      );
      

      SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);
      
      
      TextMessage message1 = new TextMessage(NEXMO_BRAND_NAME,
              TO_NUMBER1,
              "!!P0 Critical Alert Admin Server 188.166.90.227 is down!!"
      );
      

      SmsSubmissionResponse response1 = client.getSmsClient().submitMessage(message1);
      
      

      if (response.getMessages().get(0).getStatus() == MessageStatus.OK) {
          System.out.println("Message sent successfully.");
      } else {
          System.out.println("Message failed with error: " + response.getMessages().get(0).getErrorText());
      }
	  
  }
    
}
