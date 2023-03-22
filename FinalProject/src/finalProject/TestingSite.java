package finalProject;
import javax.swing.*;
  
public class TestingSite
{
  public static void main(String[] args)
  {
    JTextField a[] = new JTextField[]
    {
      new JTextField(),
      new JTextField(10),
      new JTextField("Hello"),
      new JTextField("Goodbye", 20)
    };
    
    // use the array
    a[3] = new JTextField("I Must be Going");
    a[2].setText("Greetings");
  }
}
