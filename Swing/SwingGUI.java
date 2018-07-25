import javax.swing.*;

import javafx.scene.control.ScrollPane;

public class SwingGUI extends JFrame{
    public static void main(String[] args){

        /**Creating Default Constructor */
        new SwingGUI();
    }

    public SwingGUI(){
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

        /**Create Textfield */
        JTextField textfield1 = new JTextField("Type Here",15);
        textfield1.setToolTipText("Type something");

        /**Create Text Area */
        JTextArea textArea1 = new JTextArea(15,20);

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
}