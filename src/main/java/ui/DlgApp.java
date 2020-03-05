package ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class DlgApp extends JDialog {
    DlgApp oJFrame = this;
    JList jList = new JList<>();
    JLabel messageLabel = new JLabel("Cette application est en conception!");
    JButton jButton = new JButton("Build another Application");

    JLabel jLabel = new JLabel("Did you appreciate this application ?");
    private String[] notelist = {"1", "2", "3", "4", "5"};

    public DlgApp(JFrame owner, String title, boolean modal) {
        super(owner, title, modal);

        this.setSize(550, 350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.initComponent();


    }

    private void initComponent() {
        JPanel content = new JPanel();
        content.setBackground(Color.white);
        content.add(panelCenter());
        content.add(jButton);
        add(content);
        listenerEvent();
    }


    private JPanel panelCenter() {

        ImageIcon imageIcon = new ImageIcon(("icon/pngConst.png"));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        messageLabel.setIcon(imageIcon);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setPreferredSize(new Dimension(500, 250));
        jPanel.setBorder(BorderFactory.createTitledBorder("Application construit"));
        jPanel.add(jList);
        jPanel.add(messageLabel);
        return jPanel;
    }

    private void listenerEvent() {
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selection = JOptionPane.showOptionDialog(null, jLabel, "Note pour l'application",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, notelist,
                        notelist[0]);

                if (selection > 0) {
                    System.out.println("your appreciation is: " + notelist[selection]);
                }
                dispose();
            }

        });


    }

}
