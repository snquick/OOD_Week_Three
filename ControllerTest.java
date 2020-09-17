/* Developer: Stephanie Quick
 * Course: Object Oriented Development
 * Date: September 17 2020
 * Program: Christmas Decorations -- Command Pattern 
*/
public class ControllerTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		ChristmasTree tree = new ChristmasTree();
		OutsideLights outside = new OutsideLights();
		SantaInflatable santa = new SantaInflatable();
		Fireplace fireplace = new Fireplace();
		
		remote.setCommand(tree::on); // turning tree on
		remote.buttonWasPressed();
		remote.setCommand(outside::on); // turning outside lights on
		remote.buttonWasPressed();
		remote.setCommand(outside::twinkle); // twinkle mode for outside lights on
		remote.buttonWasPressed();
		remote.setCommand(santa::on); // blowing up inflatable outdoor santa 
		remote.buttonWasPressed();
		remote.setCommand(fireplace::ignite);
		remote.buttonWasPressed();
		
		remote.setCommand(fireplace::off);
		remote.buttonWasPressed();
		remote.setCommand(outside::off);
		remote.buttonWasPressed();
    }

}