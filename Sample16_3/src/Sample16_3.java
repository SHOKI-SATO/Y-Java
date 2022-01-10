import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sample16_3 extends Frame{
	private Button bt;
	
	public static void main(String[] args) {
		Sample16_3 sm = new Sample16_3();
	}
	public Sample16_3() {
		super("サンプル");
		
		bt = new Button("になちん");
		add(bt);
		
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener());
		
		setSize(250, 200);
		setVisible(true);
	}
	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	class SampleActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			bt.setLabel("おかえり");
		}
	}

}
