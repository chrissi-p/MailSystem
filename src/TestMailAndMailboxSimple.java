import java.util.ArrayList;

public class TestMailAndMailboxSimple
{

	public static void main(String[] args)
	{
		Mailbox meineMailbox = new Mailbox("username", "passwort");
		
		Person p1 = new Person("Hans Peter", "hans@gmail.com");
		Person p2 = new Person("Klaus", "klaus@web.de");
		
		Mail m1 = new Mail("Das ist der Text von m1.", "sub1", p1, p2);
		Mail m2 = new Mail("Das ist der Text von m2.", "sub2", p1, p2);
		Mail m3 = new Mail("Das ist der Text von m3.", "sub3", p1, p2);
		Mail m4 = new Mail("Das ist der Text von m4.", "sub4", p1, p2);
		
		meineMailbox.storeMail(m1);
		meineMailbox.storeMail(m2);
		meineMailbox.storeMail(m3);
		meineMailbox.storeMail(m4);
		
		//meineMailbox.printMails();
		
		ArrayList<Mail> erhalteneMails = meineMailbox.retriveMails("username", "passwort");
		
		if(erhalteneMails.size() != 0)
		{
			System.out.println("-> Erhaltene Mails:\n");
		}
		else
		{
			System.out.println("-> keine Mails");
		}
			
		for(int i=0; i<erhalteneMails.size(); i++)
		{
			System.out.println("****** " + (i+1) + ". Mail ******");
			System.out.println(erhalteneMails.get(i).toString());
			System.out.println();
		}
	}
}
