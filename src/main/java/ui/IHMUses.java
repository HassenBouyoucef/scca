package ui;

import modeles.Composant;
import services.Scan;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


public class IHMUses extends JFrame {
    private Class<IHMUses> logger = IHMUses.class;
    private final String nameApp = "SCAA";
    private IHMUses ihmUses;
    private JButton valideButton = new JButton("Build your application");
    private JLabel titleLaabel = new JLabel("Please select a Component");
    private JComboBox<Composant> composantJComboBox = new JComboBox<>();


    public IHMUses() {
        setTitle(nameApp);
        setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        add(principalPanel());
        initialisation();
        listenerEvent();
    }

    private void initialisation() {
        Scan scan = new Scan();
        for (Composant cm : scan.scanEnvironement()) {
            composantJComboBox.addItem(cm);
        }

    }

    private JPanel principalPanel() {
        JPanel mainPanel = new JPanel();
        Border compound = null;
        composantJComboBox.setPreferredSize(new Dimension(120, 20));
        compound = BorderFactory.createTitledBorder(compound, "SCAA Construction", TitledBorder.LEFT, TitledBorder.ABOVE_TOP);
        mainPanel.setBorder(compound);

        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(titleLaabel);
        mainPanel.add(composantJComboBox);
        mainPanel.add(valideButton);
        return mainPanel;
    }


    private void listenerEvent() {
        ihmUses = this;
        valideButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, composantJComboBox.getSelectedItem());

                DlgApp dlgApp = new DlgApp(ihmUses, "Application", true);

                dlgApp.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        new IHMUses().setVisible(true);
    }
}
