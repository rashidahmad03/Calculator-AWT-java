import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cal extends Frame {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	Panel p1, p2;
	TextField t1, t2;

	String input = "0";
	String input1 = "0";
	static char c = ' ';

	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {

				if (c == ' ')
					input1 += "7";
				else
					input += "7";

				t1.setText(input1 + c + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class B implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {

				if (c == ' ')
					input1 += "8";
				else
					input += "8";

				t1.setText(input1 + c + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "9";
				else
					input += "9";

				t1.setText(input1 + c + input);
			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class D implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "4";
				else
					input += "4";

				t1.setText(input1 + c + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class E implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "5";
				else
					input += "5";

				t1.setText(input1 + c + input);
			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class F implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "6";
				else
					input += "6";

				t1.setText(input1 + c + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class G implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "1";
				else
					input += "1";

				t1.setText(input1 + c + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class H implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "2";
				else
					input += "2";

				t1.setText(input1 + c + input);
			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class I implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "3";
				else
					input += "3";

				t1.setText(input1 +c+ input);
			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class J implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (c == ' ')
					input1 += "0";
				else
					input += "0";

				t1.setText(input1 + input);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class K implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				c = '+';
				t1.setText(input1 + c);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class L implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				c = '-';
				t1.setText(input1 + c);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class M implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				c = '*';
				t1.setText(input1 + c);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class N implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				c = '/';
				t1.setText(input1 + c);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class O implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				c = '%';
				t1.setText(input1 + c);

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class P implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				int n1 = Integer.parseInt(input1);
				int n2 = Integer.parseInt(input);

				int n = 0;
				switch (c) {
				case '+':
					n = n1 + n2;
					break;
				case '-':
					n = n1 - n2;
					break;

				case '*':
					n = n1 * n2;
					break;

				case '/':
					n = n1 / n2;
					break;

				case '%':
					n = n1 % n2;
					break;
				}
				input1=""+n;
				input="";
				t1.setText(String.valueOf(input1));

			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	class Q implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				input = "";
				input1 = "";
				c = ' ';

				t1.setText(null);
			} catch (Exception ex) {
				t1.setText(ex.getMessage());
			}
		}
	}

	cal() {
		setTitle("MyCalci");
		setSize(800, 700);
		setBackground(Color.red);
		setLayout(null);
		p1 = new Panel();
		p1.setLayout(null);
		p1.setBackground(Color.orange);
		p1.setBounds(50, 100, 700, 120);
		add(p1);
		t1 = new TextField();
		t1.setBounds(30, 40, 350, 45);
		t1.setForeground(Color.black);
		p1.add(t1);
		b1 = new Button("Clear");
		b1.setBounds(550, 40, 110, 45);
		b1.addActionListener(new Q());
		b1.setForeground(Color.red);
		p1.add(b1);
		p2 = new Panel();
		p2.setLayout(null);
		p2.setBounds(50, 260, 700, 360);
		p2.setBackground(Color.orange);
		add(p2);
		b2 = new Button("7");
		b2.addActionListener(new A());
		b2.setBounds(30, 30, 50, 50);
		p2.add(b2);
		b3 = new Button("8");
		b3.setBounds(120, 30, 50, 50);
		b3.addActionListener(new B());
		p2.add(b3);
		b4 = new Button("9");
		b4.setBounds(210, 30, 50, 50);
		b4.addActionListener(new C());
		p2.add(b4);
		b5 = new Button("4");
		b5.setBounds(30, 120, 50, 50);
		b5.addActionListener(new D());
		p2.add(b5);
		b6 = new Button("1");
		b6.setBounds(30, 210, 50, 50);
		b6.addActionListener(new G());

		p2.add(b6);
		b7 = new Button("0");
		b7.setBounds(30, 290, 50, 50);
		b7.addActionListener(new J());

		p2.add(b7);
		b8 = new Button("5");
		b8.setBounds(120, 120, 50, 50);
		b8.addActionListener(new E());

		p2.add(b8);
		b9 = new Button("6");
		b9.setBounds(210, 120, 50, 50);
		b9.addActionListener(new F());

		p2.add(b9);
		b10 = new Button("2");
		b10.setBounds(120, 210, 50, 50);
		b10.addActionListener(new H());

		p2.add(b10);
		b11 = new Button("3");
		b11.setBounds(210, 210, 50, 50);
		b11.addActionListener(new I());
		p2.add(b11);
		b12 = new Button("=");
		b12.setBounds(120, 290, 140, 50);
		b12.addActionListener(new P());
		p2.add(b12);
		b13 = new Button("+");
		b13.setBounds(330, 30, 100, 100);
		b13.setForeground(Color.green);
		b13.addActionListener(new K());
		p2.add(b13);
		b14 = new Button("-");
		b14.setBounds(330, 240, 100, 100);
		b14.setForeground(Color.blue);
		b14.addActionListener(new L());
		p2.add(b14);
		b15 = new Button("/");
		b15.setBounds(560, 30, 100, 100);
		b15.setForeground(Color.BLUE);
		b15.addActionListener(new N());
		p2.add(b15);
		b2 = new Button("*");
		b2.setBounds(560, 240, 100, 100);
		b2.setForeground(Color.darkGray);
		b2.addActionListener(new M());
		p2.add(b2);
		b2 = new Button("%");
		b2.setBounds(445, 135, 100, 100);
		b2.addActionListener(new O());
		p2.add(b2);

	}

}

public class calculator {

	public static void main(String[] args) {
		cal a = new cal();
		a.setVisible(true);

	}

}
