package ui;

import util.AlertUtil;
import util.ValidationUtil;
import exception.ValidationException;

import javax.swing.*;
import java.awt.*;

public class MobilForm extends JFrame {

    private JTextField txtNama, txtHarga;
    private JButton btnSimpan;

    public MobilForm() {
        setTitle("Form Data Mobil");
        setSize(500, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Nama Mobil"), gbc);

        gbc.gridx = 1;
        txtNama = new JTextField(15);
        panel.add(txtNama, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Harga"), gbc);

        gbc.gridx = 1;
        txtHarga = new JTextField(15);
        panel.add(txtHarga, gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        btnSimpan = new JButton("Simpan");
        panel.add(btnSimpan, gbc);

        btnSimpan.addActionListener(e -> simpanData());

        add(panel);
    }

    private void simpanData() {
        try {
            ValidationUtil.notEmpty(txtNama.getText(), "Nama Mobil");
            ValidationUtil.isNumber(txtHarga.getText(), "Harga");

            AlertUtil.showInfo("Data mobil berhasil divalidasi");

        } catch (ValidationException ex) {
            AlertUtil.showError(ex.getMessage());
        }
    }
}
