package JTableExample;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class JTableExample extends JFrame
{
    public JTableExample()
    {
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Kg", "Gamer"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 80.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
            };
            
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        //add(table);
        add(new JScrollPane(table));
         
        setTitle("Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        pack();
        setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTableExample();
            }
        });
    }   
}
