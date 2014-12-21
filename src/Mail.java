class Mail
{
	String text;
	String subject;
	Person sender;
	Person reciver;
	
	Mail(String text, String subject, Person sender, Person reciver)
	{
		this.text = text;
		this.subject = subject;
		this.sender = sender;
		this.reciver = reciver;
	}
	
	public String toString()
	{
		return "sender: " + sender.getName() + " <" + sender.getMailaddresse() + ">" + 
			   "\nreciver: " + reciver.getName() + " <" + reciver.getMailaddresse() + ">" + 
			   "\nsubject: " + subject + "\nMail text: " + text;
	}
}
