package com.swing.jdbc;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class RegistrationForm {

	JFrame frame = new JFrame();
	JLabel idLabel, nameLabel, genderLabel, addressLabel, contactLabel;
	JTextField idField, nameField, genderField, addressField, contactField;
	JButton exitButton, registerButton, deleteButton, updateButton, resetButton, refreshButton;
	private JRadioButton maleButton, femaleButton;
	private ButtonGroup bg;
	JPanel formpanel, tabelPanel;
	JTable table;
	DefaultTableModel tabelModel;
	JScrollPane scrollPane;
	int selectModelIndex = -1;
	int selectedRow = -1;
	String[] columnNames = { "ID", "Name", "Gender", "Address", "Contact" };
	DataBaseHelper dbHelper;

	public RegistrationForm() {

		dbHelper = new DataBaseHelper();

		frame.setSize(800, 400);
		frame.setLocationRelativeTo(null);
		formpanel = new JPanel();
		formpanel.setLayout(new BorderLayout());
		formpanel.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(), "Registration Detail",
				TitledBorder.CENTER, TitledBorder.TOP));

		JPanel panel = new JPanel(new GridLayout(5, 2, 5, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

//Gender Radio Button

		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		maleButton = new JRadioButton("Male", true);
		femaleButton = new JRadioButton("Female", true);
		bg = new ButtonGroup();
		bg.add(maleButton);
		bg.add(femaleButton);
		genderPanel.add(maleButton);
		genderPanel.add(femaleButton);

		// initialize JLabel and JTextField

		idLabel = new JLabel("ID");
		nameLabel = new JLabel("Name");
		genderLabel = new JLabel("Gender");
		addressLabel = new JLabel("Address");
		contactLabel = new JLabel("Contact");

		idField = new JTextField("");
		nameField = new JTextField("");
		genderField = new JTextField("");
		addressField = new JTextField("");
		contactField = new JTextField("");
			
		idField.setEditable(false);
		// add components to panel

		panel.add(idLabel);
		panel.add(idField);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(genderLabel);
	    panel.add(genderPanel);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(contactLabel);
		panel.add(contactField);

		JPanel buttonPanel = new JPanel(new BorderLayout());
		JPanel btnGridPanel = new JPanel(new GridLayout(2, 2, 5, 5));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		// initialize button
		exitButton = new JButton("Exit");
		registerButton = new JButton("Register");
		deleteButton = new JButton("Delete");
		updateButton = new JButton("Update");

		btnGridPanel.add(exitButton);
		btnGridPanel.add(registerButton);
		btnGridPanel.add(deleteButton);
		btnGridPanel.add(updateButton);

		JPanel resetPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		resetButton = new JButton("Reset");
		resetPanel.add(resetButton);

		buttonPanel.add(btnGridPanel, BorderLayout.NORTH);
		buttonPanel.add(resetPanel, BorderLayout.SOUTH);
		formpanel.add(panel, BorderLayout.NORTH);
		formpanel.add(buttonPanel, BorderLayout.SOUTH);

		tabelPanel = new JPanel(new BorderLayout());
		tabelModel = new DefaultTableModel(columnNames, 0);

		table = new JTable(tabelModel);

		scrollPane = new JScrollPane(table);
		refreshButton = new JButton("Refresh Table");
		tabelPanel.add(scrollPane, BorderLayout.CENTER);

		tabelPanel.add(refreshButton, BorderLayout.SOUTH);
		frame.add(formpanel, BorderLayout.WEST);
		frame.add(tabelPanel, BorderLayout.CENTER);
		// formpanel.add(genderPanel, BorderLayout.CENTER);
		frame.setVisible(true);

		//JButton updateButton = new JButton("Update");
		//JButton deleteButton = new JButton("Delete");

		registerButton.addActionListener(e -> register());
		// System.out.println("Button Clicked")
		refreshButton.addActionListener(e -> readRecords());

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub int viewRow =tabel.getSelectedRow();
				// System.out.println("Row:"+viewRow);

				int viewRow = table.getSelectedRow();

				if (viewRow != -1) {

					selectModelIndex = table.convertRowIndexToModel(viewRow);
					idField.setText(tabelModel.getValueAt(selectModelIndex, 0).toString());
					nameField.setText(tabelModel.getValueAt(selectModelIndex, 1).toString());
					addressField.setText(tabelModel.getValueAt(selectModelIndex, 3).toString());
					contactField.setText(tabelModel.getValueAt(selectModelIndex, 4).toString());

					String gender = tabelModel.getValueAt(selectModelIndex, 2).toString();
					if (gender.equalsIgnoreCase("Male")) {
						maleButton.setSelected(true);
					} else {
						femaleButton.setSelected(true);

					}

				}

			}
		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				deleteUser();

			}
		});

		updateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateUser();

			}
		});

	}

	protected void updateRecord() {
		// TODO Auto-generated method stub

	}

	private void readRecords() {

		ArrayList<Student> studentList = dbHelper.readAllRecords();
		tabelModel.setRowCount(0);		// clear all table records 

		// clear all rows from table

		for (Student student : studentList) {

			tabelModel.addRow(new Object[] {

					student.getId(), student.getName(), student.getGender(), student.getAddress(),
					student.getContact() });

		}

	}

	private void updateUser() {
		int selectedRow = table.getSelectedRow();
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(idField, this, "Select a row to Update", 0);
			return;
		}
		String id = idField.getText();
		String name = nameField.getText();
		String address = addressField.getText();
		String contact = contactField.getText();
		String gender = maleButton.isSelected() ? "Male" : "female";
		
		Student student = new Student(Integer.parseInt(id), name, gender, address, contact);

		dbHelper.updateRecord(student);
	}

	private void deleteUser() {
		int selectedRow = table.getSelectedRow();
		
		System.out.println("Selected Row : "+selectedRow);
		if (selectedRow == -1) {
			JOptionPane.showMessageDialog(idField, this, "Select a row to delete", 0);
			return;
		}
		String id = idField.getText();
		dbHelper.deleteRecord(Integer.parseInt(id));
		
	}

	private void register() {
		// String id = idField.getText();
		String name = nameField.getText();
		String address = addressField.getText();
		String contact = contactField.getText();
		String gender = maleButton.isSelected() ? "Male" : "female";

		Student student = new Student( name, gender, address, contact);

		dbHelper.insertRecord(student);

		idField.setText("");
		nameField.setText("");
		contactField.setText("");
		addressField.setText("");

		maleButton.setSelected(true);

		JOptionPane.showMessageDialog(frame, "Hello, Welcome To Javapoint.");

	}

	public static void main(String[] args) {
		new RegistrationForm();
	}
}
