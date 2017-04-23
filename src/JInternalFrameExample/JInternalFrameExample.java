package JInternalFrameExample;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class JInternalFrameExample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JDesktopPane jdpDesktop;
	protected final int INSET = 50;
	protected final int SIZE = 300;
	static int openFrameCount = 0;
	
	
	public JInternalFrameExample() {
		super("JInternalFrame Usage Demo");
		// Make the main window positioned as 50 pixels from each edge of the
		// screen.
		setBounds(INSET, INSET, Toolkit.getDefaultToolkit().getScreenSize().width - INSET * 2, Toolkit.getDefaultToolkit().getScreenSize().height - INSET * 2);
		// Add a Window Exit Listener
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent evento) {
				System.exit(0);
			}
		});
		// Create and Set up the GUI.
		jdpDesktop = new JDesktopPane();
		// A specialized layered pane to be used with JInternalFrames
		createFrame(); // Create first window
		setContentPane(jdpDesktop);
		setJMenuBar(createMenuBar());
		// Make dragging faster by setting drag mode to Outline
		jdpDesktop.putClientProperty("JDesktopPane.dragMode", "outline");
	}
	protected JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Frame");
		menu.setMnemonic(KeyEvent.VK_N);
		JMenuItem menuItem = new JMenuItem("New IFrame");
		menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				createFrame();
			}
		});
		menu.add(menuItem);
		menuBar.add(menu);
		return menuBar;
	}
	protected void createFrame() {
		MyInternalFrame frame = new MyInternalFrame();
		frame.setVisible(true);
		// Every JInternalFrame must be added to content pane using JDesktopPane
		frame.add(new JLabel ("Nueva ventana."));
		getJdpDesktop().add(frame);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
		}
	}
	public static void main(String[] args) {
		JInternalFrameExample frame = new JInternalFrameExample();
		frame.setVisible(true);
	}
	
	class MyInternalFrame extends JInternalFrame {

		private static final long serialVersionUID = 1L;
		protected static final int XPOSITION = 30, YPOSITION = 30;
		public MyInternalFrame() {
			super("IFrame #" + (++openFrameCount),
					true, // resizable
					true, // closable
					true, // maximizable
					true);// iconifiable
			setSize(SIZE, SIZE);
			// Set the window's location.
			setLocation(XPOSITION * openFrameCount, YPOSITION	* openFrameCount);
		}
	}
	public JDesktopPane getJdpDesktop() {
		return jdpDesktop;
	}
}