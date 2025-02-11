package endtermAssignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import endtermAssignment.domain.Employee;
import endtermAssignment.repo.CompanyRepository;
import endtermAssignment.repo.DepartmentRepository;
import endtermAssignment.repo.EmployeesRepository;
import endtermAssignment.domain.Company;
import endtermAssignment.domain.Department;

public class MainApp extends JFrame {
    private String currentMenu = "C";
    private Company selectedCompany = null;
    private Department selectedDepartment = null;
    private final Dimension buttonSize = new Dimension(Integer.MAX_VALUE, 35);
    private final Color mainColor = new Color(29, 88, 122);
    // private final Font standardFont = new Font("Arial", Font.PLAIN, 16);
    private final Font TitleFont = new Font("Arial", Font.BOLD, 20);
    private JPanel mainPanel = new JPanel();
    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    
    public MainApp() {
            initialize();
    }

    public void initialize() {

        setTitle("Company-Department manager");
        



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

        // Company company1 = new Company("Company A");
        // Department dep1 = new Department("Dept1", company1);
        // Department dep2 = new Department("Dept2", company1);
        // company1.addDepartment(dep1);
        // company1.addDepartment(dep2);
        // departments.add(dep1);
        // departments.add(dep2);
        // companies.add(company1);
    
        // Company company2 = new Company("Company B");
        // Department dep3 = new Department("Dept3", company2);
        // company2.addDepartment(dep3);
        // departments.add(dep3);
        // companies.add(company2);
        
        mainPanel.setPreferredSize(new Dimension(400, 350));
        mainPanel.setBackground(Color.white);
        // mainPanel.setBorder(new EmptyBorder(50, 20, 0, 20));
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 15));
        
        if(currentMenu.equals("C")) {
            loadCompanies(companies);
        }
        

        JPanel titlePanel = new JPanel();
        // titlePanel.setBackground(Color.BLACK);
        JLabel titleLabel2 = new JLabel("Companies list: ");
        titleLabel2.setFont(TitleFont);
        titleLabel2.setForeground(mainColor);
        // titleLabel.setFont(new );
        titlePanel.add(titleLabel2);     
        add(titlePanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        JLabel bottomLabel = new JLabel("Wellcome to Maksat's project");
        bottomLabel.setForeground(mainColor);
        bottomPanel.add(bottomLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        // --------------Обработка нажатия кнопок---------------//


        btnCompany.addActionListener(e -> {
            if (!currentMenu.equals("C")) {
                currentMenu = "C";
                selectedCompany = null;
                titleLabel2.setText("Companies list");
                loadCompanies(companies);
                bottomLabel.setText("Wellcome to Maksat's project");
            }
        });

        btnDepartment.addActionListener(e -> {
            if (!currentMenu.equals("D")) {
                if (selectedCompany == null) {
                    currentMenu = "D";
                    titleLabel2.setText("Departments list");
                    loadDepartments(departments);
                    bottomLabel.setText("Чтобы добавить Department, первым делом выберите Company");
                } else {
                    currentMenu = "D";
                    titleLabel2.setText("Departments list");
                    loadDepartments(selectedCompany);
                    bottomLabel.setText("Wellcome to Maksat's project");
                }
            }
        });

        btnEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentMenu.equals("E")) {
                    if (selectedDepartment == null) {
                        currentMenu = "E";
                        titleLabel2.setText("Employees list");
                        loadEmployees(employees);
                        bottomLabel.setText("Чтобы добавить Employee, первым делом выберите Department");
                    } else {
                        currentMenu = "E";
                        titleLabel2.setText("Employees list");
                        bottomLabel.setText("Чтобы просмотреть информацию о Employee, нажмите на него");
                        loadEmployees(selectedDepartment);
                    }
                }
            }
        });

        // Панель компаний
        // mainPanel = new JPanel();
        // mainPanel.setLayout(new FlowLayout());
        
        add(mainPanel, BorderLayout.EAST);
        add(sidePanel, BorderLayout.CENTER);
        setPreferredSize(new Dimension(600, 350));
        setMinimumSize(new Dimension(400, 225));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    





    
    //-----------------------------Functions------------------------------//
    //-------------Companies functions--------------//
    
    private void loadCompanies(ArrayList<Company> companies) {
        mainPanel.removeAll();
        CompanyRepository companyRepository = new CompanyRepository(); 
        companies = companyRepository.getAllCompanies();    
        for (Company company : companies) {
            JButton companyButton = new JButton(company.getName());
            companyButton.addActionListener(e -> {
                selectedCompany = company;
                currentMenu = "D";
                loadDepartments(selectedCompany);
            });
            companyButton.setBackground(Color.WHITE);
            companyButton.setForeground(mainColor);
            companyButton.setPreferredSize(new Dimension(100, 80));
            mainPanel.add(companyButton);
        }
        JButton addCompanyButton = new JButton("+");
        addCompanyButton.addActionListener(e -> {
            String newCompName = JOptionPane.showInputDialog("Введите название компании:");
            if (newCompName != null && !newCompName.trim().isEmpty()) {
                companyRepository.addCompany(newCompName);
                loadCompanies(companyRepository.getAllCompanies());
            }
        });
        addCompanyButton.setBackground(Color.WHITE);
        addCompanyButton.setForeground(mainColor);
        addCompanyButton.setPreferredSize(new Dimension(100, 80));
        mainPanel.add(addCompanyButton);
        mainPanel.revalidate();
        mainPanel.repaint();

    }

    //-------------Departments functions--------------//

    private void loadDepartments(ArrayList<Department> departments) {
        mainPanel.removeAll();
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departments = departmentRepository.getAllDepartments();
        for (Department department : departments) {
            JPanel card = new JPanel();
            card.setPreferredSize(new Dimension(100, 100));
            card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            card.add(new JLabel(department.getName()));
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    loadEmployees(department);
                }
            });
            card.setBackground(Color.WHITE);
            card.setForeground(mainColor);
            card.setPreferredSize(new Dimension(100, 80));
            mainPanel.add(card);
        }
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void loadDepartments(Company company) {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departments = departmentRepository.getDepartmentsByCompany(company);
        mainPanel.removeAll();
        if (company != null) {
            for (Department department : departments) {
                JPanel card = new JPanel();
                card.setPreferredSize(new Dimension(100, 100));
                card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                card.add(new JLabel(department.getName()));
                card.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        loadEmployees(department);
                    }
                });
                card.setBackground(Color.WHITE);
                card.setForeground(mainColor);
                card.setPreferredSize(new Dimension(100, 80));
                mainPanel.add(card);
            }
        } 

        JButton addDepartmentButton = new JButton("+");
        addDepartmentButton.addActionListener(e -> {
        String newDeptName = JOptionPane.showInputDialog("Введите название отдела:");
        if (newDeptName != null && !newDeptName.trim().isEmpty()) {
            departmentRepository.addDepartment(newDeptName, company.getId());
            loadDepartments(company);
        }
    });
        mainPanel.add(addDepartmentButton);
        
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    //-------------Employees functions--------------//
       
    private void loadEmployees (ArrayList<Employee> employees) {
        mainPanel.removeAll();
        EmployeesRepository employeesRepository = new EmployeesRepository();
        employees = employeesRepository.getAllEmployees();
        for (Employee employee : employees) {
            JPanel card = new JPanel();
            card.setPreferredSize(new Dimension(100, 100));
            card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            card.add(new JLabel(employee.getFullName()));
            showEmpInfo(card, employee);
            card.setBackground(Color.WHITE);
            card.setForeground(mainColor);
            card.setPreferredSize(new Dimension(100, 80));
        mainPanel.add(card);
        mainPanel.revalidate();
        mainPanel.repaint();
        }
    }

    private void showEmpInfo(JPanel card, Employee employee) {
        card.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, 
                "Имя: " + employee.getFullName() + 
                "\nДолжность: " + employee.getPosition() + 
                "\nЗарплата: " + employee.getSalary() +
                "\nDepartment: " + employee.getDepartment().getName() + 
                "\nCompany: " + employee.getDepartment().getCompany().getName());

            }
        });
    }


    private void loadEmployees(Department department) {
        mainPanel.removeAll();
        EmployeesRepository employeesRepository = new EmployeesRepository();
        ArrayList<Employee> employees = employeesRepository.getEmployeesByDepartment(department.getId());
        if(department != null) {
            for (Employee employee : employees) {
                JPanel card = new JPanel();
                card.setPreferredSize(new Dimension(100, 100));
                card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                card.add(new JLabel(employee.getFullName()));
                
                showEmpInfo(card, employee);
                mainPanel.add(card);
            }
        }

        JButton addDepartmentButton = new JButton("+");
        addDepartmentButton.addActionListener(e -> addEmpDepartment(department));
        mainPanel.add(addDepartmentButton);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
        
    private void addEmpDepartment(Department department) {
        if (department != null) {
            EmployeesRepository employeesRepository = new EmployeesRepository();
            String newEmpName = JOptionPane.showInputDialog("Введите имя сотрудника:");
            String newEmpPosition = JOptionPane.showInputDialog("Введите его должность:");
            String newEmpSalary = JOptionPane.showInputDialog("Введите его зарплату:");
            try {
                Integer salary = Integer.parseInt(newEmpSalary);
            
                if (newEmpName != null && !newEmpName.trim().isEmpty() ||
                    newEmpPosition != null && newEmpPosition.trim().isEmpty()) {
                    employeesRepository.addEmployee(newEmpName, newEmpPosition, salary, department.getId());
                    loadEmployees(department);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Введите корректную зарплату!", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}
