import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JProgressBarExample extends JFrame  implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton startButton;
	private JProgressBarInnerClass progressBarObject;
	public class JProgressBarInnerClass extends JProgressBar {
		private static final long serialVersionUID = 1L;
		
		private int progress;
		public JProgressBarInnerClass() {
			super(0, 100);
			setValue(0);
			setStringPainted(true);
		}
		public int getProgress() {
			return progress;
		}
		public void setProgress(int progress) {
			this.progress = progress;
		}
		
	}
	public JProgressBarExample() {
		super();
		setLayout(new FlowLayout());
		progressBarObject = new JProgressBarInnerClass();
		add(progressBarObject);
		startButton = new JButton("Avanzar un paso");
		add(startButton);
		startButton.addActionListener(this);
		pack();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JProgressBarExample();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		progressBarObject.setProgress(progressBarObject.getProgress() + 1);
		progressBarObject.setValue(progressBarObject.getProgress());
		
	}
}
