/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_gui.bsuir.pokos.Reports;

import java.io.File;
import javax.swing.text.Document;

/**
 *
 * @author Vladislav
 */
public class FactoryMethod {
    
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }
    
}
