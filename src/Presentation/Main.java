/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import StaticData.Language;
import StaticData.MyColor;
import StaticData.MyFont;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Bjarke Carlsen
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("PointClick.main - starting");        
        
        // Booting up language
        Language.setLanguage(Language.danish);
        
        // Look and feel of MenuBar
        UIManager.put("MenuBar.background",MyColor.panel);
        UIManager.put("MenuBar.foreground",MyColor.text);
        UIManager.put("MenuBar.highlight",MyColor.lightselection);
        UIManager.put("MenuBar.selectionBackground",MyColor.lightselection);
        UIManager.put("MenuBar.selectionForeground",MyColor.panel);
        UIManager.put("MenuBar.shadow",MyColor.panel);
        
        
        // Look and feel of Menu
        UIManager.put("Menu.background",MyColor.panel);
        UIManager.put("Menu.foreground",MyColor.text);

        
        // Look and feel of MenuItem
        UIManager.put("MenuItem.background",MyColor.panel);
        UIManager.put("MenuItem.foreground",MyColor.text);
        
        
        // Look and feel of Panels
        UIManager.put("Panel.background",MyColor.panel);
        
        
        // Look and feel of Labels
        UIManager.put("Label.background",MyColor.panel);
        UIManager.put("Label.foreground",MyColor.text);
        UIManager.put("Label.font",MyFont.label);
        
        
        // Look and feel of Buttons
        UIManager.put("Button.background",MyColor.button);
        UIManager.put("Button.foreground",MyColor.text);
        UIManager.put("Button.font",MyFont.button);

        
        // Look and feel of Textfields
        UIManager.put("FormattedTextField.background",MyColor.textfield);
        UIManager.put("FormattedTextField.foreground",MyColor.text);
        UIManager.put("FormattedTextField.selectionForeground",MyColor.textselection);
        UIManager.put("FormattedTextField.font",MyFont.field);
        
        
        // Look and feel of Textareas
        UIManager.put("TextArea.background",MyColor.textarea);
        UIManager.put("TextArea.foreground",MyColor.text);
        UIManager.put("TextArea.selectionForeground",MyColor.textselection);
        UIManager.put("TextArea.font",MyFont.textarea);
        
        
        // Look and feel of ScrollPane
        UIManager.put("ScrollPane.border",BorderFactory.createEmptyBorder());
        UIManager.put("ScrollBar.background",MyColor.textarea);
               
        
        // Look and feel of Lists
        UIManager.put("List.background",MyColor.list);
        UIManager.put("List.foreground",MyColor.text);
        UIManager.put("List.selectionBackground",MyColor.selection);
        UIManager.put("List.selectionForeground",MyColor.textselection);
        UIManager.put("List.font",MyFont.list);
        
        
        // Look and feel of Comboboxes
        UIManager.put("ComboBox.background",MyColor.combobox);
        UIManager.put("ComboBox.foreground",MyColor.text);
        UIManager.put("ComboBox.selectionBackground",MyColor.selection);
        UIManager.put("ComboBox.selectionForeground",MyColor.textselection);
        UIManager.put("ComboBox.font",MyFont.box);

        
        // Look and feel of Tabbed Panes
        UIManager.put("TabbedPane.background",MyColor.tabbedpane);
        UIManager.put("TabbedPane.foreground",MyColor.text);
        UIManager.put("TabbedPane.selected",MyColor.selection);
        UIManager.put("TabbedPane.borderHightlightColor",MyColor.textfield);
        UIManager.put("TabbedPane.contentBorderInsets",new Insets(1, 0, 0, 0));
        UIManager.put("TabbedPane.tabInsets",new Insets(19,5,10,5));
        UIManager.put("TabbedPane.font",MyFont.tabbedpane);
        
        UIManager.put("Focus.color",MyColor.text);
        
        // Look and feel of JOptionPane
        UIManager.put("OptionPane.background",MyColor.panel);
        UIManager.put("OptionPane.messageForeground",MyColor.text);
        UIManager.put("OptionPane.messageFont",MyFont.labelH1);
        UIManager.put("TextField.background",MyColor.textfield);
        UIManager.put("TextField.foreground",MyColor.text);
        UIManager.put("TextField.font",MyFont.field);
        
        // Creating form
        Frame form = new Frame();
        
        
        // Look and feel of the window
        
        form.setResizable(false);
        form.setLocation(40,40);
        
        // frame icon
        java.net.URL url = ClassLoader.getSystemResource("images/point_click.png");
        if(url != null) {
            ImageIcon img = new ImageIcon(url);
            form.setIconImage(img.getImage());
        }

        form.setVisible(true);
    }
}