package Sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InterfaceController {
    private String op="ADD";
    int s = 0;

    @FXML
    private Label result;
    @FXML
    private TextField op2;
    @FXML
    private TextField op1;
    @FXML
    private Button equalBtn;
    @FXML
    private Button addBtn;
    @FXML
    private Button multiBtn;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button subBtn;
    @FXML
    private Button dvdBtn;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn0;
    @FXML
    private Button resetBtn;
    @FXML
    private Button dotBtn;
    
    @FXML
    void addNum(ActionEvent event) {
        op="ADD";   // storing add when button press
        s = 1;
    }

    @FXML
    void multiNum(ActionEvent event) {
        op="MUL";// storing mul when button press
        s = 1;
    }
    
    @FXML
    private void subNum(ActionEvent event) {
        op="SUB";  // storing sub when button press
        s = 1;
    }

    @FXML
    private void dvdNum(ActionEvent event) {
        op="DIV";// storing div when button press
        s = 1;
    }
    // we use s = 1 so that wehn any opreator is pressed then it will make s = 1 and write to the 2nd text field
    @FXML
    void processOp(ActionEvent event) {
        String o1 = op1.getText();  // getting text from first text field
        String o2 = op2.getText();  // getting from 2nd textfield
        if(o2.equals(""))
            o2 = "0";
        double n1 = Double.parseDouble(o1);
        double n2 = Double.parseDouble(o2); //converting the values to double
        
        if(op.equals("ADD"))    // adding these number if selection is add
        {
            result.setText("" + (n1 + n2));
            result.setOpacity(1);
        }
        else if (op.equals("MUL"))
        {
            result.setText("" + (n1 * n2));
            result.setOpacity(1);
        }
        else if (op.equals("DIV"))
        {
            result.setText("" + (n1 / n2));
            result.setOpacity(1);
        }
        else if (op.equals("SUB"))
        {
            result.setText("" + (n1 - n2));
            result.setOpacity(1);   //settingvisibility when the result need to displayed
        }
       
    }

    @FXML
    private void processNums(ActionEvent event) {
        if( ((Button)event.getSource() ).getText().equals("0") )    // setting the values to the first and 2nd textfield
        {
            if(s == 0)
                op1.setText(op1.getText()+"0");
            if(s == 1)
                op2.setText(op2.getText()+"0");
        }
        if( ((Button)event.getSource() ).getText().equals("1") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"1");
            if(s == 1)
                op2.setText(op2.getText()+"1");
        }
        if( ((Button)event.getSource() ).getText().equals("2") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"2");
            if(s == 1)
                op2.setText(op2.getText()+"2");
        }
        if( ((Button)event.getSource() ).getText().equals("3") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"3");
            if(s == 1)
                op2.setText(op2.getText()+"3");
        }
        if( ((Button)event.getSource() ).getText().equals("4") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"4");
            if(s == 1)
                op2.setText(op2.getText()+"4");
        }
        if( ((Button)event.getSource() ).getText().equals("5") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"5");
            if(s == 1)
                op2.setText(op2.getText()+"5");
        }
        if( ((Button)event.getSource() ).getText().equals("6") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"6");
            if(s == 1)
                op2.setText(op2.getText()+"6");
        }
        if( ((Button)event.getSource() ).getText().equals("7") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"7");
            if(s == 1)
                op2.setText(op2.getText()+"7");
        }
        if( ((Button)event.getSource() ).getText().equals("8") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"8");
            if(s == 1)
                op2.setText(op2.getText()+"8");
        }
        if( ((Button)event.getSource() ).getText().equals("9") )
        {
            if(s == 0)
                op1.setText(op1.getText()+"9");
            if(s == 1)
                op2.setText(op2.getText()+"9");
        }
        if( ((Button)event.getSource() ).getText().equals(".") )
        {
            if(s == 0)
                op1.setText(op1.getText()+".");
            if(s == 1)
                op2.setText(op2.getText()+".");
        }
    }

    @FXML
    private void resetInput(ActionEvent event) {// reset method to clear all textfields and operator stored in variable will also be cleared
        op="ADD";
        s = 0;
        result.setOpacity(0);
        op1.setText("");
        op2.setText("");
    }

}
