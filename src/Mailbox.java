import java.util.ArrayList;

/**
 * {@code Mailbox} ist die Klasse, welche das Postfach einer Person darstellt.
 * Hier ist der Benutzername und das Passwort der Person gespeichert.
 * Zudem werden die erhaltenen E-Mails verwaltet und können mit
 * Angabe des korrekten Benutzernamen und Passwords abgerufen werden.
 * 
 * @author Christoph Prinz
 */
class Mailbox
{
	String username;
	String password;
	ArrayList<Mail> mails;
	
	/**
	 * Konstruktor, um eine neue Mailbox mit gegebenem Benutzername und Passwort zu erstellen.
	 * 
	 * @param username	ist der Benutzername für das Postfach
	 * @param password	ist das dazugehörige Passwort
	 */
	Mailbox(String username, String password)
	{
		this.username = username;
		this.password = password;
		
		mails = new ArrayList<Mail>();
	}
	
	/**
	 * Diese Methode fügt neue E-Mails zu dem Postfach hinzu.
	 * 
	 * @param newMail	ist die neue E-Mail, welche hinzugefügt werden soll
	 */
	void storeMail(Mail newMail)
	{
		this.mails.add(newMail);
	}
	
	/**
	 * Gibt alle gespeicherten E-Mails aus
	 */
	void printMails()
	{
		System.out.println("-> print Mails for testing !!!!\n");
		for(int i=0; i<mails.size(); i++)
		{
			System.out.println(mails.get(i).toString());
			System.out.println();
		}
	}
	/**
	 * Mit der Klasse {@code retriveMails} werden alle E-Mails, welche in dem Postfach gespeichert sind,
	 * als Liste zurückgegeben und anschließend gelöscht. Wenn der Benutzername, oder das Passwort falsch sind,
	 * wird eine Fehlermeldung ausgegeben.
	 * 
	 * @param username	ist der Benutzername für das Postfach
	 * @param password	muss dass dazu passende Passwort sein
	 * @return			gibt alle E-Mails des Postfachs als {@code ArrayList<>} zurück
	 */
	ArrayList<Mail> retriveMails(String username, String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
		{
			ArrayList<Mail> ret = this.mails;
			this.mails.clear();
			return ret;
		}
		else
		{
			System.err.println("ERROR: Zugangsdaten sind falsch!!!");
			return new ArrayList<Mail>();
		}
	}
}
