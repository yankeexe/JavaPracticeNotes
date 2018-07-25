import javax.swing.*;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.MouseEvent;
import com.sun.javafx.stage.WindowEventDispatcher;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

public class GUIEventHandling extends JFrame{
    
    JButton button1; 
    JTextField textField1;
    JTextArea textArea1; 
    int buttonClicked; 

    public static void main(String[] args){
        new GUIEventHandling();
    }

    public GUIEventHandling(){
        /** Size of the Frame */
        this.setSize(400,400);

        /**Position of the Frame 'centered' */
        this.setLocationRelativeTo(null);
        
        /**Allow resizing of Window. 'true' by default */
        this.setResizable(false);

        /**Closes the frame when you click the cross icon */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**set title of the frame */
        setTitle("Swing GUI");

        /**Create a panel area */
        JPanel panel = new JPanel();
        
        /**Label is just plain text */
        JLabel label1 = new JLabel("Tell me somthing");

        /** Shows a pop-up when you hover your mouse in the label. */
        label1.setToolTipText("Write something...anything!!!");

        /**Create a button */
        JButton button1 = new JButton("Send");
        button1.setToolTipText("Press it to find out!");
        ListenforButton lforButton = new ListenforButton();
        button1.addActionListener(lforButton);

        /**Create Textfield */
        JTextField textfield1 = new JTextField("",15);
        textfield1.setToolTipText("Type something");

        ListenforKeys lforKeys = new ListenforKeys();
        textfield1.addKeyListener(lforKeys);

        /**Create Text Area */
        JTextArea textArea1 = new JTextArea(15,20);

        textArea1.setText("Tracking events");

        /**Whenever you reach the end of the line, you go to another line */
        textArea1.setLineWrap(true);
        
        /**Makes sure words doesn't get broken up when line breaking. */
        textArea1.setWrapStyleWord(true);

        /**Show number of lines in writeen in textArea1. */
        int numOfLines = textArea1.getLineCount();
        textArea1.append("Number of Lines: " + numOfLines);

        /**Set focus to textArea1 */
        textArea1.requestFocus();

        /**Add Scroll Bar to the scrollPane1 */
        JScrollPane scrollPane1 = new JScrollPane(textArea1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        ListenforWindow lForWindow = new ListenforWindow();
        this.addWindowListener(lForWindow);

        ListenforMouse lForMouse = new ListenforMouse();
        panel.addMouseListener(lForMouse);
        
        /**Add containers to panel */
        panel.add(label1);
        panel.add(button1);
        panel.add(textfield1);
        panel.add(scrollPane1);
        /**Add panel to frame */
        this.add(panel);

        /**Make the Frame Visible */
        this.setVisible(true);

        /**Set Highlight to textArea1 */
        textArea1.requestFocus();
    
    }

    /**Listeners */

    private class ListenforButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button1){
                buttonClicked++;
                textArea1.append("Button Click Count: " + buttonClicked + " times\n");
            }
        }
    }

    private class ListenforKeys implements KeyListener{
        public void keyPressed(KeyEvent e){
            textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
        }
    }

    private class ListenforWindow implements WindowListener{
        public void windowActivated(WindowEvent e){
            textArea1.append("Window is active");
        }
        public void windowDeactivated(WindowEvent e){
            textArea1.append("Window is not active");
        }
    }

    private class ListenforMouse implements MouseListener{
        public void mouseClicked(MouseEvent e){
            textArea1.append("Mouse Panel pos: " + e.getX()+ "" + e.getY()+"\n");
            textArea1.append("Mouse Screen pos: " + e.getXOnScreen()+ "" + e.getYOnScreen()+"\n");
            textArea1.append("Mouse Button Clicked: " + e.getButton()+"\n");
            textArea1.append("Mouse Button Clicked: " + e.getClickCount()+"\n");



        }
    }
}