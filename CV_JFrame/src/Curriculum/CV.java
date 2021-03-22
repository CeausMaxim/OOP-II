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
		super("Форма Curriculum Vite");
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(15, 2));
		label = new JLabel("Форма для заполнения данных", JLabel.CENTER);
        cont.add(label);
        label1 = new JLabel("");
        cont.add(label1);
        name = new JLabel("     " + " Фамилия Имя");
        cont.add(name);
        input = new JTextField();
        cont.add(input);
        pol = new JLabel("     " + " Ваш пол");
        cont.add(pol);
        tip2 = new JComboBox<String>();
        tip2.addItem("Мужской");
        tip2.addItem("Женский");
        tip2.setSelectedIndex(0);
        cont.add(tip2);
        date = new JLabel("     " + " Дата Рождения");
        cont.add(date);
        input1 = new JTextField("");
        cont.add(input1);
        age = new JLabel("     " + " Возраст");
        cont.add(age);
        input2 = new JTextField("");
        cont.add(input2);
        mail = new JLabel("     " + " Адресс электронной почты");
        cont.add(mail);
        input3 = new JTextField("");
        cont.add(input3);
        phone = new JLabel("     " + " Мобильный Телефон");
        cont.add(phone);
        input4 = new JTextField("");
        cont.add(input4);
        school = new JLabel("     " + " Образование");
        cont.add(school);
        tip = new JComboBox<String>();
        tip.addItem("Университет, например(Alecu Russo)");
        tip.addItem("Теоретический лицей");
        tip.addItem("Гимназия");
        tip.addItem("Академия наук");
        tip.setSelectedIndex(0);
        cont.add(tip);
        language = new JLabel("     " + "  Родной Язык");
        cont.add(language);
        tip1 = new JComboBox<String>();
        tip1.addItem("Немецкий");
        tip1.addItem("Английский");
        tip1.addItem("Русский");
        tip1.addItem("Румынский");
        tip1.setSelectedIndex(0);
        cont.add(tip1);
        language1 = new JLabel("     " + " Язык который вы изучаете");
        cont.add(language1);
        tip3 = new JComboBox<String>();
        tip3.addItem("Английский");
        tip3.addItem("Испанский");
        tip3.addItem("Французский");
        tip3.addItem("Немецкий");
        tip3.setSelectedIndex(0);
        cont.add(tip3);
        work = new JLabel("     " + " Желаемая работа");
        cont.add(work);
        tip4 = new JComboBox<String>();
        tip4.addItem("Архитектор");
        tip4.addItem("Переводчик");
        tip4.addItem("Программист");
        tip4.addItem("Дизайнер");
        tip4.setSelectedIndex(0);
        cont.add(tip4);
        comments = new JLabel("     " + "  О себе");
        cont.add(comments);
        text = new JTextArea();
        cont.add(text);
        
        JButton info = new JButton("Сохранить и Отправить данные");
        cont.add(info);
        info.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sms = "";
		sms += "Данные успешно сохранены и отправлены!.\n";
		sms += "\n";
		sms += "Фамилия Имя: " + input.getText() + "\n";
		sms += "Пол: " + tip2.getSelectedItem().toString() +  "\n";
		sms += "Дата Рождения: " + input1.getText() + "\n";
		sms += "Возраст: " + input2.getText() + "\n";
		sms += "Адресс электронной почты: " + input3.getText() + "\n";
		sms += "Мобильный телефон: " + input4.getText() + "\n";
		sms += "Образование: " + tip.getSelectedItem().toString() +  "\n";
		sms += "Родной язык: " + tip1.getSelectedItem().toString() +  "\n";
		sms += "Изучаемый язык: " + tip3.getSelectedItem().toString() +  "\n";
		sms += "Желаемая работа: " + tip4.getSelectedItem().toString() +  "\n";
        sms += "О себе: " + text.getText() + "\n";
        
        JOptionPane.showMessageDialog(null, sms, "Сводка о введенных данных", JOptionPane.PLAIN_MESSAGE);
	}
}
