package ui;

import util.AlertUtil;
import util.ValidationUtil;
import exception.ValidationException;

import javax.swing.*;
import java.awt.*;

public class PelangganForm extends JFrame {

    private JTextField txtNama;
    private JButton btnSimpan;

    public PelangganForm() {
        setTitle("Form Data Pelanggan");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(2,2,5,5));
        form.add(new JLabel("Nama Pelanggan"));
        txtNama = new JTextField();
        form.add(txtNama);

        btnSimpan = new JButton("Simpan");
        btnSimpan.addActionListener(e -> simpan());

        add(form, BorderLayout.CENTER);
        add(btnSimpan, BorderLayout.SOUTH);
    }

    private void simpan() {
        try {
            ValidationUtil.notEmpty(txtNama.getText(), "Nama Pelanggan");
            AlertUtil.showInfo("Data pelanggan valid");

        } catch (ValidationException e) {
            AlertUtil.showError(e.getMessage());
        }
    }
}
