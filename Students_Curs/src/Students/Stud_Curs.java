package Students;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Stud_Curs {

	public static void main(String[] args) {
		// Окно приложения и таблица
		JFrame frame = new JFrame();
		JTable table = new JTable();

		// создаем столбцы таблицы
		Object[] columns = { "ID", "Имя", "Фамилия", "Курс", "Кол-во кредитов" };
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);

		// Измена стилей шрифта и фона
		table.setBackground(Color.LIGHT_GRAY);
		table.setForeground(Color.blue);
		Font font = new Font("", 1, 14);
		table.setFont(font);
		table.setRowHeight(30);

		JTextField Id = new JTextField();
		JTextField FName = new JTextField();
		JTextField LName = new JTextField();
		JTextField Curs = new JTextField();
		JTextField Credits = new JTextField();

		JLabel ID = new JLabel("ID: ");
		JLabel Fname = new JLabel("Имя: ");
		JLabel Lname = new JLabel("Фамилия: ");
		JLabel curs = new JLabel("Курс: ");
		JLabel credits = new JLabel("Кол-во кредитов: ");

		JButton btnImport = new JButton("Импорт");
		JButton btnAdd = new JButton("Добавить");
		JButton btnDelete = new JButton("Удалить");
		JButton btnUpdate = new JButton("Обновить");
		JButton btnExport = new JButton("Экспорт");

		ID.setBounds(20, 20, 100, 25);
		Fname.setBounds(120, 20, 100, 25);
		Lname.setBounds(220, 20, 100, 25);
		curs.setBounds(320, 20, 100, 25);
		credits.setBounds(420, 20, 100, 25);

		
		 Id.setBounds(20, 50, 100, 25); 
		 FName.setBounds(120, 50, 100, 25);
		 LName.setBounds(220, 50, 100, 25); 
		 Curs.setBounds(320, 50, 100, 25); 
		 Credits.setBounds(420, 50, 100, 25);
		 
		 btnImport.setBounds(20, 80, 100, 25); 
		 btnAdd.setBounds(120, 80, 100, 25);
		 btnUpdate.setBounds(220, 80, 100, 25); 
		 btnDelete.setBounds(320, 80, 100, 25); 
		 btnExport.setBounds(420, 80, 100, 25);
		 

		// создается панелька
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(5, 150, 880, 250);

		frame.setLayout(null);

		frame.add(pane);

		frame.add(ID);
		frame.add(FName);
		frame.add(LName);
		frame.add(Curs);
		frame.add(Credits);

		frame.add(Id);
		frame.add(Fname);
		frame.add(Lname);
		frame.add(curs);
		frame.add(credits);

		frame.add(btnImport);
		frame.add(btnAdd);
		frame.add(btnDelete);
		frame.add(btnUpdate);
		frame.add(btnExport);

		// массив объектовв для строки
		Object[] row = new Object[5];

		// импорт из txt file
		btnImport.addActionListener(new ActionListener() {

			String filePath = "C:\\Users\\User\\Desktop\\student.txt";
			File file = new File(filePath);

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					// строки из txt
					Object[] tableLines = br.lines().toArray();

					// извекает информацию из строк
					// устанавливает информацию в модели jtable
					for (int i = 0; i < tableLines.length; i++) {
						String line = tableLines[i].toString().trim();
						String[] dataRow = line.split("/");
						model.addRow(dataRow);
					}

				} catch (Exception ex) {

				}

			}
		});

		// экспорт данных в txt file
		btnExport.addActionListener(new ActionListener() {

			String filePath = "C:\\Users\\user\\Desktop\\students2.txt";
			File file = new File(filePath);

			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					TableModel model = table.getModel();

					for (int i = 0; i < model.getRowCount(); i++) {// rows
						for (int j = 0; j < model.getColumnCount(); j++) {// columns
							bw.write(model.getValueAt(i, j).toString() + "/");
						}
						bw.newLine();
					}

					bw.close();
					fw.close();

				} catch (IOException ex) {
				}

			}
		});

		// добавление студента
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				row[0] = Id.getText();
				row[1] = FName.getText();
				row[2] = LName.getText();
				row[3] = Curs.getText();
				row[4] = Credits.getText();

				model.addRow(row);
			}
		});

		// удаление информации об студенте
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int i = table.getSelectedRow();
				if (i >= 0) {

					model.removeRow(i);
				} else {
					JOptionPane.showMessageDialog(pane, "Delete Error. Please be more attention!");
				}
			}
		});

		table.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				int i = table.getSelectedRow();

				Id.setText(model.getValueAt(i, 0).toString());
				FName.setText(model.getValueAt(i, 1).toString());
				LName.setText(model.getValueAt(i, 2).toString());
				Curs.setText(model.getValueAt(i, 3).toString());
				Credits.setText(model.getValueAt(i, 4).toString());
			}
		});

		// обновление информации
		btnUpdate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int i = table.getSelectedRow();

				if (i >= 0) {
					model.setValueAt(Id.getText(), i, 0);
					model.setValueAt(FName.getText(), i, 1);
					model.setValueAt(LName.getText(), i, 2);
					model.setValueAt(Curs.getText(), i, 3);
					model.setValueAt(Credits.getText(), i, 4);
				} else {
					JOptionPane.showMessageDialog(pane, "Update Error. Please be more attention!");
				}
			}
		});

		frame.setSize(900, 450);
		frame.setTitle("Student Curs");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
