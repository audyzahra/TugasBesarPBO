package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Car Sales Desktop System");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu masterMenu = new JMenu("Master Data");
        JMenuItem mobilItem = new JMenuItem("Data Mobil");
        JMenuItem pelangganItem = new JMenuItem("Data Pelanggan");

        mobilItem.addActionListener(e -> new MobilForm().setVisible(true));
        pelangganItem.addActionListener(e -> new PelangganForm().setVisible(true));

        masterMenu.add(mobilItem);
        masterMenu.add(pelangganItem);

        menuBar.add(masterMenu);
        setJMenuBar(menuBar);

        add(new JLabel("Dashboard Car Sales", JLabel.CENTER), BorderLayout.CENTER);
    }
}
