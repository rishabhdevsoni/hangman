package hangman;
import javax.swing.JFrame;
class FirstPage
{
JFrame frame;
FirstPage()
{
	frame=new JFrame();
	frame.setTitle("HANGMAN GAME");
	frame.setVisible(true);
	frame.setSize(500,500);
}
public static void main(String args[])
{
	FirstPage o = new FirstPage();
}
}