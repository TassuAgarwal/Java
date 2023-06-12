import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Frame implements ActionListener {
    private Label lblUsername;
    private Label lblPassword;
    private TextField txtUsername;
    private TextField txtPassword;
    private Button btnLogin;
    private Checkbox cbRememberMe;
    private List selectedItems;

    public LoginFrame() {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        lblUsername = new Label("Username:");
        add(lblUsername);

        txtUsername = new TextField(20);
        add(txtUsername);

        lblPassword = new Label("Password:");
        add(lblPassword);

        txtPassword = new TextField(20);
        txtPassword.setEchoChar('*');
        add(txtPassword);

        cbRememberMe = new Checkbox("Remember Me");
        add(cbRememberMe);

        selectedItems = new List(3, true);
        selectedItems.add("Checkbox 1");
        selectedItems.add("Checkbox 2");
        selectedItems.add("Checkbox 3");
        add(selectedItems);

        btnLogin = new Button("Login");
        add(btnLogin);
        btnLogin.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            boolean rememberMe = cbRememberMe.getState();
            String[] selectedCheckboxItems = selectedItems.getSelectedItems();

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Remember Me: " + rememberMe);
            System.out.println("Selected Checkbox Items:");
            for (String item : selectedCheckboxItems) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
