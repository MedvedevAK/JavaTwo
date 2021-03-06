import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {
    private JTextArea textAreaChat;
    private JTextField textFieldSend;
    private JButton buttonSend;

    public ChatWindow() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());

        textAreaChat = new JTextArea();
        textAreaChat.setEditable(false);
        add(textAreaChat, BorderLayout.CENTER);

        JPanel panelSend = new JPanel();
        panelSend.setLayout(new BorderLayout());

        textFieldSend = new JTextField();
        panelSend.add(textFieldSend, BorderLayout.CENTER);

        buttonSend = new JButton();
        buttonSend.setText("Send");
        panelSend.add(buttonSend, BorderLayout.LINE_END);

        add(panelSend, BorderLayout.PAGE_END);
        setVisible(true);

        textFieldSend.addActionListener(e -> sendText());
        buttonSend.addActionListener(e -> sendText());
    }

    private void sendText() {
        if(textFieldSend.getText().length() > 0) {
            textAreaChat.append("Я: " + textFieldSend.getText() + "\n\r");
            textFieldSend.setText("");
        }
    }
}