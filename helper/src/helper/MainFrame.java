package helper;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import java.awt.List;
import javax.swing.table.*;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 525);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu(" \u6587\u4EF6 ");
		menuBar.add(menu);
		
		JMenuItem menuItem_1 = new JMenuItem(" \u65B0\u5EFA ");
		menu.add(menuItem_1);
		
		JMenuItem menuItem = new JMenuItem(" \u6253\u5F00 ");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5173\u4E8E");
		menu_1.add(menuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JList<String> list = new JList<String>();
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"www.baidu.com", "www.taobao.com", "www.jiangxindong.com"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.EAST);
		
		JLabel label = new JLabel("\u5730\u5740\uFF1A");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("\u81EA\u52A8");
		
		JPanel panel_2 = new JPanel();
		//TableModel cellData;
		Object[][] cellData = {{"row1-col1", "row1-col2"},{"row1-col1", "row1-col2"},{"row1-col1", "row1-col2"}};
		String[] columnNames = {"col1", "col2"};
		table = new JTable(cellData, columnNames){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		@Override
	        public boolean isCellEditable(int row, int column) {
            return false;
        }};
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("����", Font.PLAIN, 14));
		TableColumn firsetColumn = table.getColumnModel().getColumn(1);
		table.setRowHeight(25);
		table.setDefaultRenderer (Object.class, new TableCellRenderer ()
        {
            @Override
            public Component getTableCellRendererComponent ( JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column )
            {
                Component render =
                        new DefaultTableCellRenderer ().getTableCellRendererComponent (table, value, isSelected,
                            hasFocus, row, column);
                if (row%2==1)
                {
                    render.setBackground (Color.gray);
                }
                return render;
            }
        });
		
		
		
		
		JCheckBox checkBox = new JCheckBox("200");
		
		JCheckBox chckbxxx = new JCheckBox("3XX");
		
		JCheckBox checkBox_1 = new JCheckBox("403");
		
		JLabel label_2 = new JLabel("返回类型：");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(table, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(checkBox)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxxx)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(checkBox_1)
									.addGap(99)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(checkBox)
								.addComponent(chckbxxx)
								.addComponent(checkBox_1)
								.addComponent(label_2))
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(table, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))))
					.addContainerGap())
		);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
        firsetColumn.setPreferredWidth(30);
        firsetColumn.setMaxWidth(200);
        firsetColumn.setMinWidth(100);
		JPanel panel = new JPanel();
		tabbedPane.addTab("\u81EA\u52A8", null, panel, null);
		
		JList<?> list_1 = new JList<Object>();
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u5B57\u5178\u5E93", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(89)
					.addComponent(list_1)
					.addContainerGap(90, Short.MAX_VALUE))
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(list_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
		);
		
		JList<String> list_3 = new JList<String>();
		scrollPane_1.setViewportView(list_3);
		list_3.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"php.txt", "asp.txt"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		
		JList<String> list_2 = new JList<String>();
		scrollPane.setViewportView(list_2);
		list_2.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"asp.txt", "php.txt", "aspx.txt", "jsp.txt", "dir.txt", "mdb.txt", "ls.txt", "nihao.txt"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		panel_3.setLayout(gl_panel_3);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u624B\u52A8", null, panel_1, null);
		
		JTextArea textArea = new JTextArea();
		
		JButton button_1 = new JButton("添加");
		
		JButton button_2 = new JButton("清空");
		
		JLabel label_1 = new JLabel("输入字典，每行一条");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(button_1)
							.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
							.addComponent(button_2))
						.addComponent(label_1))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
