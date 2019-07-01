package example;

import java.io.IOException;

import org.testng.annotations.Test;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.NexmoClientException;
import com.nexmo.client.sms.MessageStatus;
import com.nexmo.client.sms.SmsSubmissionResponse;
import com.nexmo.client.sms.messages.TextMessage;

public class SendSMSStakeholders2 {
  @Test
  public void FailSMS() throws IOException, NexmoClientException {
	  String NEXMO_API_KEY = "667c1687";
      String NEXMO_API_SECRET = "098f4123c62c9530";
      String TO_NUMBER = "+917838061776"; 
      String NEXMO_BRAND_NAME = "The Luxury Closet";
      
      NexmoClient client = NexmoClient.builder().apiKey(NEXMO_API_KEY).apiSecret(NEXMO_API_SECRET).build();

      TextMessage message = new TextMessage(NEXMO_BRAND_NAME,
              TO_NUMBER,
              "!!P0 Critical Alert TLC website is down!!"
      );

      SmsSubmissionResponse response = client.getSmsClient().submitMessage(message);

      if (response.getMessages().get(0).getStatus() == MessageStatus.OK) {
          System.out.println("Message sent successfully.");
      } else {
          System.out.println("Message failed with error: " + response.getMessages().get(0).getErrorText());
      }
	  
  }
}
