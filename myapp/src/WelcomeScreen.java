import java.io.File;

/*
 * private File logo;
 * /*private String email;
 * /*private String password;
 * /*
 * /*public void WelcomeScreen() {
 * /* this.logo = logo;
 * /* this.email = email;
 * /* this.password = password;
 * /*}
 * /*
 * /*public String getemail() {
 * /* return email;
 * /*}
 * /*
 * /*public String getpassword() {
 * /* return password;
 * /*}
 * /*
 * /*public void pushtodb() {
 * /*
 * /*}
 * /*
 * /*public boolean checkcred(String email, String password) {
 * /* return false;
 * /*
 * /*}
 * /*
 * /*public int welcomeScreen() {
 * /* return -1;
 * /*}
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// Welcome Screen
public class WelcomeScreen extends JFrame {
    private File logo;
    private String email;
    private String password;

    private JLabel logoLabel;
    private JLabel emailLabel;
    private JLabel passwordLabel;
    private JTextField emailField;
    private JTextField passwordField;
    private JButton noAccountButton;

    public WelcomeScreen(File logo, String email, String password) {
        this.logo = logo;
        this.email = email;
        this.password = password;

        initUI();
    }

    private void initUI() {
        // Set up the logo label
        ImageIcon logoIcon = new ImageIcon(logo.getAbsolutePath());
        Image logoImage = logoIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        logoIcon = new ImageIcon(logoImage);
        logoLabel = new JLabel(logoIcon);
        logoLabel.setPreferredSize(new Dimension(200, 200));

        // Set up the email field
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(email);
        emailField.setPreferredSize(new Dimension(200, 30));

        // Set up the password field
        passwordLabel = new JLabel("Password:");
        passwordField = new JTextField(password);
        passwordField.setPreferredSize(new Dimension(200, 30));

        // Set up the "No account?" button
        noAccountButton = new JButton("No account?");
        noAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to handle clicking the "No account?" button goes here
            }
        });

        // Create a panel to hold the email and password fields
        JPanel inputPanel = new JPanel();
        inputPanel.add(emailLabel);
        inputPanel.add(emailField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        // Create a panel to hold the "No account?" button
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(noAccountButton);

        // Add the logo, input panel, and button panel to the frame
        add(logoLabel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set up the frame
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public void pushToDb() {
        // Code to push the email and password to a database goes here
    }

    public boolean checkCred(String email, String password) {
        // Code to check if the email and password match what's stored in the database
        // Return true if the credentials are valid, false otherwise
        return true;
    }
    // Signup page
    public class Signup {
        private String name;
        private int age;
        private String email;
        private String password;

        public Signup(String name, int age, String email, String password) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.password = password;
        }

        public void pushToDb() {
            // Code to push the signup information to a database goes here
        }

        // Getters and setters for the attributes go here
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void main(String[] args) {
            // Example usage: create a Signup object and push the information to the

            Signup signup = new Signup("John Doe", 30, "johndoe@example.com", "password");
            signup.pushToDb();
        }
    }
    // dashboard
    public class dashboard{
        private String text1;
        private String text2;
        private String text3;
        private String button1;
        private String button2;
        private String Activity1;
        private String Activity2;
        public dashboard(String text1, String text2){
            this.text1 =text1;
            this.text2 =text2;
            this.text3 =text3;
            this.button1 =button1;
            this.button2 =button2;
            this.Activity1 =Activity1;
            this.Activity2 =Activity2;
        } 
        public void getfeed(){
            //request the feed from the backend server
        }
    }
    // Backend Screen class
    public class Backend {
        private String password;
        
        public Backend(String password) {
            this.password = password;
        }
        
        public String getPassword() {
            return password;
        }
        
        public boolean checkCred(String email, String password) {
            // Code to check the credentials of the user goes here
            // Return true if the credentials are valid, false otherwise
            return true;
        }
        
        public void pushToDb(String data) {
            // Code to push data to a database goes here
        }
        
        public List<String> getFeed() {
            // Code to retrieve a list of feed items from a database goes here
            // Return the list of feed items
            return new ArrayList<String>();
        }
        
        public static void main(String[] args) {
            // Example usage: create a Backend object and call the methods
            Backend backend = new Backend("password123");
            String password = backend.getPassword();
            boolean credValid = backend.checkCred("johndoe@example.com", "password");
            backend.pushToDb("data");
            List<String> feed = backend.getFeed();
        }
    }
    
    public static void main(String[] args) {
        // Example usage: create a WelcomeScreen object and show the welcome screen
        WelcomeScreen welcomeScreen = new WelcomeScreen(new File("logo.png"), "example@email.com", "password");
        welcomeScreen.setVisible(true);
    }

}
