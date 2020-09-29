package modelo;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class render3 extends DefaultTableCellRenderer
{
    
    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        setHorizontalAlignment(SwingConstants.CENTER);
        table.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    }
    
    
}

