package Curriculum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CV extends JFrame implements ActionListener {
	JLabel label, label1, name, pol, date, age, mail, phone, school, year, language,
	comments, language1, work;
	JTextField input, input1, input2, input3, input4;
	JComboBox<String> tip, tip1, tip2, tip3, tip4;
	JTextArea text;
		
	public CV() {
		super("����� Curriculum Vite");
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(15, 2));
		label = new JLabel("����� ��� ���������� ������", JLabel.CENTER);
        cont.add(label);
        label1 = new JLabel("");
        cont.add(label1);
        name = new JLabel("     " + " ������� ���");
        cont.add(name);
        input = new JTextField();
        cont.add(input);
        pol = new JLabel("     " + " ��� ���");
        cont.add(pol);
        tip2 = new JComboBox<String>();
        tip2.addItem("�������");
        tip2.addItem("�������");
        tip2.setSelectedIndex(0);
        cont.add(tip2);
        date = new JLabel("     " + " ���� ��������");
        cont.add(date);
        input1 = new JTextField("");
        cont.add(input1);
        age = new JLabel("     " + " �������");
        cont.add(age);
        input2 = new JTextField("");
        cont.add(input2);
        mail = new JLabel("     " + " ������ ����������� �����");
        cont.add(mail);
        input3 = new JTextField("");
        cont.add(input3);
        phone = new JLabel("     " + " ��������� �������");
        cont.add(phone);
        input4 = new JTextField("");
        cont.add(input4);
        school = new JLabel("     " + " �����������");
        cont.add(school);
        tip = new JComboBox<String>();
        tip.addItem("�����������, ��������(Alecu Russo)");
        tip.addItem("������������� �����");
        tip.addItem("��������");
        tip.addItem("�������� ����");
        tip.setSelectedIndex(0);
        cont.add(tip);
        language = new JLabel("     " + "  ������ ����");
        cont.add(language);
        tip1 = new JComboBox<String>();
        tip1.addItem("��������");
        tip1.addItem("����������");
        tip1.addItem("�������");
        tip1.addItem("���������");
        tip1.setSelectedIndex(0);
        cont.add(tip1);
        language1 = new JLabel("     " + " ���� ������� �� ��������");
        cont.add(language1);
        tip3 = new JComboBox<String>();
        tip3.addItem("����������");
        tip3.addItem("���������");
        tip3.addItem("�����������");
        tip3.addItem("��������");
        tip3.setSelectedIndex(0);
        cont.add(tip3);
        work = new JLabel("     " + " �������� ������");
        cont.add(work);
        tip4 = new JComboBox<String>();
        tip4.addItem("����������");
        tip4.addItem("����������");
        tip4.addItem("�����������");
        tip4.addItem("��������");
        tip4.setSelectedIndex(0);
        cont.add(tip4);
        comments = new JLabel("     " + "  � ����");
        cont.add(comments);
        text = new JTextArea();
        cont.add(text);
        
        JButton info = new JButton("��������� � ��������� ������");
        cont.add(info);
        info.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sms = "";
		sms += "������ ������� ��������� � ����������!.\n";
		sms += "\n";
		sms += "������� ���: " + input.getText() + "\n";
		sms += "���: " + tip2.getSelectedItem().toString() +  "\n";
		sms += "���� ��������: " + input1.getText() + "\n";
		sms += "�������: " + input2.getText() + "\n";
		sms += "������ ����������� �����: " + input3.getText() + "\n";
		sms += "��������� �������: " + input4.getText() + "\n";
		sms += "�����������: " + tip.getSelectedItem().toString() +  "\n";
		sms += "������ ����: " + tip1.getSelectedItem().toString() +  "\n";
		sms += "��������� ����: " + tip3.getSelectedItem().toString() +  "\n";
		sms += "�������� ������: " + tip4.getSelectedItem().toString() +  "\n";
        sms += "� ����: " + text.getText() + "\n";
        
        JOptionPane.showMessageDialog(null, sms, "������ � ��������� ������", JOptionPane.PLAIN_MESSAGE);
	}
}
