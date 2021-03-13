package comps;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class Emaill {
	public static void sendMail(String recipent) throws Exception {
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		String myAccountEmail="Youremail";
		String password="Yourpassword";
		Session session=Session.getInstance(properties, new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			// TODO Auto-generated method stub
			return new PasswordAuthentication(myAccountEmail, password);
		}
		});
		Message message= prepareMessage(session,myAccountEmail,recipent);
	Transport.send(message);
	System.out.println("Sent succesfully");
	
	}
	
	
	
	 private static Message prepareMessage(Session session,String myAccountEmail,String recipient) {
		try {
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
			message.setSubject("text");
			message.setText("hello world");
			return message;
		}catch(Exception e) {
			Logger.getLogger(Emaill.class.getName()).log(Level.SEVERE,null,e);
		}
		return null;
	}



	public static void main(String [] args) throws Exception {    
	    Emaill.sendMail("receiving email");
	   }
	}