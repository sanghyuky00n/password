import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SearchForm extends JFrame {

	JLabel la_box;
	 JTextField tf;
	 JButton bt_input, bt_cancel;
	 JComboBox box = new JComboBox(new Object[] {"Name", "ID", "Password", "link"});
	 JTextField textField;
	 ChangeListener listener;
	 
	 public SearchForm() {

		  setTitle("Insert");
		  
		  la_box = new JLabel ("Choose to Search");
		  
		  tf = new JTextField();
		  
		  bt_input = new JButton("OK");
		  bt_cancel = new JButton("Cancel");
		 
		  setLayout(null);

		  la_box.setBounds(30, 30, 120, 30);
		  box.setBounds(30, 80, 150, 30);
		  tf.setBounds(30, 120 , 250, 30);
		  bt_input.setBounds(30, 300, 60, 30);
		  bt_cancel.setBounds(100, 300, 120, 30);
		  
		  add(la_box);
		  add(box);
		  add(tf);
		  add(bt_input);  
		  add(bt_cancel);
		        
		  setBounds(500, 500, 400, 400);
	      setResizable(false);
	        
	 }
	 
	 public void initSearch(){//Search form
		 setTitle("Search");
		 /**
		  tf_name.setText("");
		  tf_id.setText("");
		  tf_pw.setText("");
		  tf_link.setText("");
		  tf_name.requestFocus();
		  */
		 tf.setText("");
		 tf.requestFocus();
		 }
}
