package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(5, 2));

        JLabel lblId = new JLabel("ID:");
        JTextField tfId = new JTextField();
        JLabel lblTitle = new JLabel("Title:");
        JTextField tfTitle = new JTextField();
        JLabel lblCategory = new JLabel("Category:");
        JTextField tfCategory = new JTextField();
        JLabel lblCost = new JLabel("Cost:");
        JTextField tfCost = new JTextField();
        JLabel lblLength = new JLabel("Length:");
        JTextField tfLength = new JTextField();
        JLabel lblDirector = new JLabel("Director:");
        JTextField tfDirector = new JTextField();
        JLabel lblArtist = new JLabel("Artist:");
        JTextField tfArtist = new JTextField();

        JButton btnAdd = new JButton("Add CD");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(tfId.getText());
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                float cost = Float.parseFloat(tfCost.getText());
                int length = Integer.parseInt(tfLength.getText());
                String director = tfDirector.getText();
                String artist = tfArtist.getText();
                store.addMedia(new CompactDisc(id, title, category, cost, length, director, artist));
                new StoreManagerScreen(store);
                dispose();
            }
        });

        center.add(lblId);
        center.add(tfId);
        center.add(lblTitle);
        center.add(tfTitle);
        center.add(lblCategory);
        center.add(tfCategory);
        center.add(lblCost);
        center.add(tfCost);
        center.add(lblLength);
        center.add(tfLength);
        center.add(lblDirector);
        center.add(tfDirector);
        center.add(lblArtist);
        center.add(tfArtist);
        center.add(new JLabel());
        center.add(btnAdd);

        return center;
    }
}
