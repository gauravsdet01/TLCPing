package example;

//Java Program to Ping an IP address 
import java.io.*; 
import java.net.*;
import java.net.http.HttpResponse;

import kong.unirest.Unirest; 

class IPTest
{ 
//Sends ping request to a provided IP address 
public static void sendPingRequest(String ipAddress) 
			throws UnknownHostException, IOException 
{ 
	InetAddress geek = InetAddress.getByName(ipAddress); 
	System.out.println("Sending Ping Request to " + ipAddress); 
	if (geek.isReachable(5000)) 
	System.out.println("Host is reachable"); 
	else
	System.out.println("Sorry ! We can't reach to this host"); 
} 

//Driver code 
public static void main(String[] args) 
		throws UnknownHostException, IOException 
{ 
	String ipAddress = "188.166.33.121"; 
	sendPingRequest(ipAddress); 

	ipAddress = "188.166.26.197"; 
	sendPingRequest(ipAddress); 

	ipAddress = "188.166.90.228"; 
	sendPingRequest(ipAddress); 
	
	kong.unirest.HttpResponse<String> response = Unirest.get("https://panel.apiwha.com/send_message.php?apikey=GBIF65QRN7SJC3M422P0&number=919541880003&text=!!P0+Critical+Alert+TLC+website+is+down!!W")
			  .asString();
	
	
} 
} 
