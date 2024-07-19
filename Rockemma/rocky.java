package Rockemma;

import javax.swing.*;
import java.awt.*;

public class rocky {


    public class Main {
        public static void main(String[] args) {

            JFrame frame = new JFrame("ROCKY");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 300);
            frame.setLayout(new BorderLayout());

            JLabel title = new JLabel("ROCKY", JLabel.CENTER);
            title.setForeground(Color.BLUE);
            frame.add(title, BorderLayout.NORTH);

            JPanel listPanel = new JPanel();
            listPanel.setLayout(new GridBagLayout());
            listPanel.setBackground(null);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.fill = GridBagConstraints.NONE;
            gbc.anchor = GridBagConstraints.CENTER;

            Dimension buttonSize = new Dimension(80, 40); // Tamaño de los botones
            for (int i = 1; i <= 6; i++) {
                JButton button = new JButton(String.valueOf(i));
                button.setPreferredSize(buttonSize);
                gbc.gridx = (i - 1) % 2;
                gbc.gridy = (i - 1) / 2;
                listPanel.add(button, gbc);
            }
            frame.add(listPanel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            JButton checkButton = new JButton("✓");
            checkButton.setBackground(Color.RED);
            buttonPanel.add(checkButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        }
    }

}
