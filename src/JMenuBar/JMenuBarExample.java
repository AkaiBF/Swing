package JMenuBar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Example of JSeparator, JMenuBar, JMenu & JMenuItem
 * @author Aythami Torrado & Ernesto Echeverría
 *
 */
public class JMenuBarExample extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenu editMenu;
  private JMenuItem openMenuItem;
  private JMenuItem cutMenuItem;
  private JMenuItem copyMenuItem;
  private JMenuItem pasteMenuItem;

  public static void main(String[] args) {
  	new JMenuBarExample();
  }

  private JSeparator getSep() {
  	JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
  	// separators need preferred size in GridBagLayout
  	separator.setPreferredSize(new Dimension(100, 20));
  	separator.setMinimumSize(new Dimension(100, 20));
  	return separator;
  }
  public JMenuBarExample() {
    super("Java Menubar Example");
    menuBar = new JMenuBar();
   
    // build the File menu
    fileMenu = new JMenu("File");
    openMenuItem = new JMenuItem("Open");
    openMenuItem.addActionListener(this);
    fileMenu.add(openMenuItem);

    // build the Edit menu
    editMenu = new JMenu("Edit");
    cutMenuItem = new JMenuItem("Cut");
    copyMenuItem = new JMenuItem("Copy");
    pasteMenuItem = new JMenuItem("Paste");
    editMenu.add(cutMenuItem);
    editMenu.add(getSep());
    editMenu.add(copyMenuItem);
    editMenu.add(pasteMenuItem);

    // add menus to menubar
    menuBar.add(fileMenu);
    menuBar.add(editMenu);

    // put the menubar on the frame
    setJMenuBar(menuBar);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setPreferredSize(new Dimension(400, 300));
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }

	@Override
	public void actionPerformed(ActionEvent evento) {
		System.out.println("Open has been pushed.");
		
	}

}