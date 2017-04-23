package JPopupMenu;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.*;

/**
 * Example of a JPopupMenu from Java Swing, 2nd edition. Modified & adapted by Aythami Torrado & Ernesto Echeverría
 * 
 * @author Marc Loy, Robert Eckstein, Dave Wood, James Elliott, Brian Cole, Aythami Torrado & Ernesto Echeverría
 *
 */
public class JPopupMenuExample extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPopupMenu popup;
	protected final static int WINDOWSIZE = 300;
	
  public JPopupMenuExample() {
    popup = new JPopupMenu();
    ActionListener menuListener = new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println(event.getActionCommand() + " was pressed.");
      }
    };
    JMenuItem item;
    popup.add(item = new JMenuItem("Left"));
    item.addActionListener(menuListener);
    popup.add(item = new JMenuItem("Center"));
    item.addActionListener(menuListener);
    popup.add(item = new JMenuItem("Right"));
    item.addActionListener(menuListener);
    popup.add(item = new JMenuItem("Full"));
    item.addActionListener(menuListener);
    
    popup.addSeparator();
    
    popup.add(item = new JMenuItem("Settings..."));
    item.addActionListener(menuListener);

    popup.setLabel("Justification");
    popup.setBorder(new BevelBorder(BevelBorder.RAISED));
    popup.addPopupMenuListener(new PopupPrintListener());

    addMouseListener(new MousePopupListener());
  }
  public JPopupMenu getPopup() {
  	return popup;
  }

  // An inner class to check whether mouse events are the popup trigger
  class MousePopupListener extends MouseAdapter {
    public void mousePressed(MouseEvent event) {
      checkPopup(event);
    }
    public void mouseClicked(MouseEvent event) {
      checkPopup(event);
    }
    public void mouseReleased(MouseEvent event) {
      checkPopup(event);
    }
    private void checkPopup(MouseEvent event) {
      if (event.isPopupTrigger()) {
        getPopup().show(JPopupMenuExample.this, event.getX(), event.getY());
      }
    }
  }

  // An inner class to show when popup events occur
  class PopupPrintListener implements PopupMenuListener {
    public void popupMenuWillBecomeVisible(PopupMenuEvent event) {
      System.out.println("Popup menu will be visible!");
    }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent event) {
      System.out.println("Popup menu will be invisible!");
    }

    public void popupMenuCanceled(PopupMenuEvent event) {
      System.out.println("Popup menu is hidden!");
    }
  }

  public static void main(String args[]) {
    JFrame frame = new JFrame("JPopupMenu Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new JPopupMenuExample());
    frame.setSize(WINDOWSIZE, WINDOWSIZE);
    frame.setVisible(true);
  }
}