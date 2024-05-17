package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6, 2));

        JLabel lblTitle = new JLabel("Title:");
        JTextField tfTitle = new JTextField();
        JLabel lblCategory = new JLabel("Category:");
        JTextField tfCategory = new JTextField();
        JLabel lblCost = new JLabel("Cost:");
        JTextField tfCost = new JTextField();
        JLabel lblDirector = new JLabel("Director:");
        JTextField tfDirector = new JTextField();
        JLabel lblLength = new JLabel("Length:");
        JTextField tfLength = new JTextField();

        JButton btnAdd = new JButton("Add DVD");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                float cost = Float.parseFloat(tfCost.getText());
                String director = tfDirector.getText();
                int length = Integer.parseInt(tfLength.getText());
                store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
                new StoreManagerScreen(store);
                dispose();
            }
        });

        center.add(lblTitle);
        center.add(tfTitle);
        center.add(lblCategory);
        center.add(tfCategory);
        center.add(lblCost);
        center.add(tfCost);
        center.add(lblDirector);
        center.add(tfDirector);
        center.add(lblLength);
        center.add(tfLength);
        center.add(new JLabel());
        center.add(btnAdd);

        return center;
    }
}
