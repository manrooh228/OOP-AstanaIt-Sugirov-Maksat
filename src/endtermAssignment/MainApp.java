package endtermAssignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import endtermAssignment.domain.Company;

public class MainApp extends JFrame {
    private String currentMenu = "C";
    private final Dimension buttonSize = new Dimension(Integer.MAX_VALUE, 35);
    private final Color mainColor = new Color(29, 88, 122);
    private JPanel mainPanel = new JPanel();

    public MainApp() {
            initialize();
    }

    public void initialize() {

        setTitle("EndTerm OOP");
        



        // --------------Боковая панель с кнопками---------------//
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBackground(mainColor);
        sidePanel.setBorder(new EmptyBorder(20, 20, 20, 20));//padding
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));

        JLabel titleLabel = new JLabel("EndTerm OOP", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));//margin 
        JLabel titleLabel1 = new JLabel("Variant #1", SwingConstants.CENTER);
        titleLabel1.setForeground(Color.WHITE);
        titleLabel1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); 
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        buttonsPanel.setBackground(null);

        JButton btnCompany = new JButton("Company");
        // btnCompany.setBackground(Color.WHITE);
        // btnCompany.setForeground(mainColor);
        JButton btnEmployee = new JButton("Employee");
        // btnEmployee.setBackground(Color.WHITE);
        // btnEmployee.setForeground(mainColor);
        JButton btnDepartment = new JButton("Department");
        // btnDepartment.setBackground(Color.WHITE);
        // btnDepartment.setForeground(mainColor);
        
        for (JButton btn : new JButton[]{btnCompany, btnEmployee, btnDepartment}) {
            btn.setBackground(Color.WHITE);
            btn.setForeground(mainColor);
            btn.setMaximumSize(buttonSize);
            buttonsPanel.add(btn);
            buttonsPanel.add(Box.createVerticalStrut(10));
        }

        sidePanel.add(titleLabel);
        sidePanel.add(titleLabel1);
        sidePanel.add(Box.createVerticalStrut(20));
        sidePanel.add(buttonsPanel); 
        


        // --------------Main panel---------------//

        ArrayList<Company> companies = new ArrayList<>();
        companies.add(new Company("Nigger Co."));
        companies.add(new Company("Niggars Co."));
        companies.add(new Company("Niggars Co."));
        
        mainPanel.setPreferredSize(new Dimension(400, 350));
        mainPanel.setBackground(Color.CYAN);
        // mainPanel.setBorder(new EmptyBorder(20, 10, 20, 0));

        if(currentMenu.equals("C")) {
            loadCompanies(companies);
        }
        








        // --------------Обработка нажатия кнопок---------------//


        btnCompany.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentMenu.equals("C")) {
                    currentMenu = "C";
                    initialize();
                    loadCompanies(companies);
                }
            }
        });

        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentMenu.equals("D")) {
                    currentMenu = "D";
                    initialize();
                }
            }
        });

        btnEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentMenu.equals("E")) {
                    currentMenu = "E";
                    initialize();
                }
            }
        });

        // Панель компаний
        // mainPanel = new JPanel();
        // mainPanel.setLayout(new FlowLayout());
        add(mainPanel, BorderLayout.EAST);
        add(sidePanel, BorderLayout.CENTER);
        setTitle("Company");
        setPreferredSize(new Dimension(600, 350));
        setMinimumSize(new Dimension(400, 225));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void loadCompanies(ArrayList<Company> companies) {
        mainPanel.removeAll();
        for (Company company : companies) {
            JPanel card = new JPanel();
            card.setPreferredSize(new Dimension(100, 100));
            card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            card.add(new JLabel(company.getName()));
            mainPanel.add(card);
        }
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}
