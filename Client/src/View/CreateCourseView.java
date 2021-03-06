package View;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Class used in the professor gui for creating new courses.
 * @author Justin Hung, Robert Dumitru, Magnus Lyngberg
 */
public class CreateCourseView extends JPanel{

	
	/** serialVersionUID */
	private static final long serialVersionUID = 1424663512425310103L;
	
	/** Field for inputing the course number. */
	private JTextField courseNumField = new JTextField();
	/** Field for inputing the course name. */
	private JTextField courseNameField = new JTextField();
	/** Check-box for setting whether a course is active. */
	private JCheckBox courseActiveBox = new JCheckBox("Set Active");
	/** Button for creating a new course. */
	private JButton createCourseButton = new JButton("Create Course");
	
	/** @return The value in courseNumField. */
	public Integer getCourseNum() {return Integer.parseInt(courseNumField.getText());}
	/** @return The value in courseNameField. */
	public String getCourseName() { return courseNameField.getText();}
	/** @return True if  courseActiveBox is checked, false otherwise. */
	public boolean getCourseIsActive() {return courseActiveBox.isSelected();}
	
	/**
	 * Adds an action listener for createCourseButton.
	 * @param a Action listener added to createCourseButton.
	 */
	public void addCreateCourseButtonActionListener(ActionListener a) {createCourseButton.addActionListener(a);}
	
	/** Constructor for initializing a new CreateCourseView. */
	public CreateCourseView()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel createCourseLabel = new JLabel("Create New Course");
		createCourseLabel.setFont(new Font("SansSerif", Font.PLAIN, 24));
		GridBagConstraints gbc_createCourseLabel = new GridBagConstraints();
		gbc_createCourseLabel.anchor = GridBagConstraints.WEST;
		gbc_createCourseLabel.gridwidth = 2;
		gbc_createCourseLabel.insets = new Insets(0, 0, 5, 5);
		gbc_createCourseLabel.gridx = 0;
		gbc_createCourseLabel.gridy = 1;
		add(createCourseLabel, gbc_createCourseLabel);
		
		JLabel courseNumLabel = new JLabel("Course Number:    ");
		GridBagConstraints gbc_courseNumLabel = new GridBagConstraints();
		gbc_courseNumLabel.anchor = GridBagConstraints.WEST;
		gbc_courseNumLabel.insets = new Insets(0, 0, 5, 5);
		gbc_courseNumLabel.gridx = 0;
		gbc_courseNumLabel.gridy = 3;
		add(courseNumLabel, gbc_courseNumLabel);
		
		GridBagConstraints gbc_courseNumField = new GridBagConstraints();
		gbc_courseNumField.anchor = GridBagConstraints.WEST;
		gbc_courseNumField.insets = new Insets(0, 0, 5, 5);
		gbc_courseNumField.gridx = 1;
		gbc_courseNumField.gridy = 3;
		add(courseNumField, gbc_courseNumField);
		courseNumField.setColumns(10);
		
		JLabel courseNameLabel = new JLabel("Course Name:    ");
		GridBagConstraints gbc_courseNameLabel = new GridBagConstraints();
		gbc_courseNameLabel.anchor = GridBagConstraints.WEST;
		gbc_courseNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_courseNameLabel.gridx = 0;
		gbc_courseNameLabel.gridy = 4;
		add(courseNameLabel, gbc_courseNameLabel);
		
		GridBagConstraints gbc_courseNameField = new GridBagConstraints();
		gbc_courseNameField.anchor = GridBagConstraints.WEST;
		gbc_courseNameField.insets = new Insets(0, 0, 5, 5);
		gbc_courseNameField.gridx = 1;
		gbc_courseNameField.gridy = 4;
		add(courseNameField, gbc_courseNameField);
		courseNameField.setColumns(10);
		
		GridBagConstraints gbc_courseActiveBox = new GridBagConstraints();
		gbc_courseActiveBox.insets = new Insets(0, 0, 5, 5);
		gbc_courseActiveBox.anchor = GridBagConstraints.WEST;
		gbc_courseActiveBox.gridx = 1;
		gbc_courseActiveBox.gridy = 5;
		add(courseActiveBox, gbc_courseActiveBox);
		
		GridBagConstraints gbc_createCourseButton = new GridBagConstraints();
		gbc_createCourseButton.insets = new Insets(0, 0, 5, 5);
		gbc_createCourseButton.gridx = 1;
		gbc_createCourseButton.gridy = 7;
		add(createCourseButton, gbc_createCourseButton);
	}
}
