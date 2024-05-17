package hust.soict.globalict.aims.screen.manager;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);
    }

    @Override
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(5, 2));

        JLabel lblTitle = new JLabel("Title:");
        JTextField tfTitle = new JTextField();
        JLabel lblCategory = new JLabel("Category:");
        JTextField tfCategory = new JTextField();
        JLabel lblCost = new JLabel("Cost:");
        JTextField tfCost = new JTextField();

        JButton btnAdd = new JButton("Add Book");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                float cost = Float.parseFloat(tfCost.getText());
                store.addMedia(new Book(store.getItemsInStore().size() + 1, title, category, cost));
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
        center.add(new JLabel());
        center.add(btnAdd);

        return center;
    }
}
