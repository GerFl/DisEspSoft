package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class render2 extends DefaultTableCellRenderer
{
    
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        
        if(column % 9 == 3){
            setBackground(Color.LIGHT_GRAY);
       
        }else{
            setBackground(Color.WHITE);
        }
        setHorizontalAlignment(SwingConstants.CENTER);
       

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
    
    
}

