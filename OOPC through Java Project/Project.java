import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class Project {
    public static JFrame frame;
    static String[][] mobile = {
        {"Samsung", "8999", "Galaxy M12", "13+2MP","8MP","4GB", "64GB","Exynos 9866","FHD+ LCD 60Hz", "5000 mAh", "15W" },
		{"Samsung", "9999", "Galaxy M13", "13+2MP","8MP","4GB", "64GB","Exynos 9611","FHD+ LCD 60Hz", "5000 mAh", "15W" },
        {"Samsung", "17999", "Galaxy M32", "64+8+5MP","16MP","6GB", "64GB / 128GB","SD 695","FHD+ Amoled 90Hz", "6000 mAh", "25W" },
		{"Samsung", "25999", "Galaxy M53", "108+8+2+2MP","20MP","6GB / 8GB", "128GB / 256GB","Dimensity 900", "FHD+ Amoled 120Hz", "5000 mAh", "45W"},
		{"Realme", "8999", "C15", "13+2MP","8MP","3GB", "64GB","Helio G80","FHD+ LCD 60Hz", "6000 mAh", "15W" },
		{"Realme", "19999", "9 pro", "64+8+2MP","16MP","6GB", "128GB","SD 695","HD+ LCD 120Hz", "5000 mAh", "30W" },
		{"Realme", "24999", "9 pro+", "50MP+8+2","16MP","6GB / 8GB", "128GB","Dimensity 920","FHD+ Amoled 90Hz", "5000 mAh", "65W" },
		{"Vivo", "9449", "Y12s", "13+2MP","8MP","3GB", "64GB","SD 439","HD+ LCD 60Hz", "5000 mAh", "10W" },
		{"Vivo", "14999", "T1", "48+2+2MP","16MP","6GB", "64GB / 128GB","SD 695","FHD+ LCD 120Hz", "5000 mAh", "18W" },
		{"Vivo", "24449", "T1pro", "64+8+2MP","16MP","6GB / 8GB", "128GB","SD 778","FHD+ Amoled 120Hz", "4500 mAh", "65W" },
		{"Oppo", "8449", "Y53", "13+2MP","8MP","3GB", "32GB / 64GB","SD 439","HD+ LCD 60Hz", "5000 mAh", "10W" },
		{"Oppo", "18999", "F23", "48+2+2MP","16MP","6GB", "64GB / 128GB","SD 720","FHD+ LCD 120Hz", "5000 mAh", "18W" },
		{"Oppo", "26999", "Reno7", "108+8+2MP","16MP","6GB / 8GB", "128GB","Dimensity 900","FHD+ Amoled 60Hz", "4500 mAh", "33W" },
		{"Mi", "7999", "note 10 lite", "13+2+2MP","8MP","3GB", "64GB","Helio P35","HD+ LCD 60Hz", "5000 mAh", "10W" },
		{"Mi", "17999", "note 9 pro", "48+8+2MP","16MP","6GB", "64GB / 128GB","SD 695","FHD+ Amoled 120Hz", "5000 mAh", "33W" },
		{"Mi", "24999", "11 lite", "64+8+2MP","16MP","6GB / 8GB", "128GB","SD 778","FHD+ Amoled 120Hz", "4500 mAh", "65W" }
    };
    public static void main(String[] args) {
        frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
        frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("SELECT YOUR SMARTPHONE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(50, 23, 337, 104);
		frame.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Explore Now :)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window2();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(143, 147, 127, 32);
		frame.add(btnNewButton);
	}
	public static void Window2() {
		frame.getContentPane().removeAll();
        frame.repaint();	
		JLabel lblNewLabel = new JLabel("Select brand :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(29, 37, 85, 24);
		frame.add(lblNewLabel);
			
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("");
		comboBox.addItem("Samsung");
		comboBox.addItem("Realme");
		comboBox.addItem("Vivo");
		comboBox.addItem("Oppo");
		comboBox.addItem("Mi");
		comboBox.setBounds(136, 37, 110, 24);
		frame.add(comboBox);
			
		JLabel lblNewLabel_1 = new JLabel("Select price range :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 85, 122, 14);
		frame.add(lblNewLabel_1);
			
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("");
		comboBox_1.addItem("0");
		comboBox_1.addItem("10000");
		comboBox_1.addItem("20000");
		comboBox_1.addItem("30000");
		comboBox_1.addItem("40000");
		comboBox_1.addItem("50000");
		comboBox_1.setBounds(161, 81, 85, 22);
		frame.add(comboBox_1);
			
		JLabel lblNewLabel_2 = new JLabel("to");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(245, 85, 32, 14);
		frame.add(lblNewLabel_2);
			
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("");
		comboBox_2.addItem("10000");
		comboBox_2.addItem("20000");
		comboBox_2.addItem("30000");
		comboBox_2.addItem("40000");
		comboBox_2.addItem("50000");
		comboBox_2.setBounds(287, 81, 79, 22);
		frame.add(comboBox_2);
			
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(48, 174, 306, 34);
		frame.add(lblNewLabel_3);
			
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = (String)comboBox.getSelectedItem();
				String str1 = (String)comboBox_1.getSelectedItem();
				String str2 = (String)comboBox_2.getSelectedItem();
				if(str==""||str1==""||str2=="") {
					lblNewLabel_3.setText("Please fill all the following fields");
				}
				else {
					Window3(str, str1, str2);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(157, 128, 89, 23);
		frame.add(btnNewButton);	
	}
	public static void Window3(String str, String str1, String str2){
		frame.getContentPane().removeAll();
        frame.repaint();
		JLabel lblNewLabel = new JLabel("Recommended smartphone ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 11, 371, 28);
		frame.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(29, 50, 361, 14);
		//lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(29, 77, 371, 14);
		//lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(29, 102, 371, 14);
		//lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(29, 127, 371, 14);
		//lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(29, 152, 371, 14);
		//lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(29, 177, 371, 14);
		//lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(29, 202, 371, 14);
		//lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(lblNewLabel_7);

		int pri1 = Integer.parseInt(str1);
        int pri2 = Integer.parseInt(str2);
        boolean selected = false;
		for(int i = 0; i < mobile.length; i++){
            if(mobile[i][0].equals(str)){
                if(Integer.parseInt(mobile[i][1]) > pri1 && Integer.parseInt(mobile[i][1]) <= pri2) {
                    lblNewLabel_1.setText("Name : "+mobile[i][0]+" "+mobile[i][2]);
                    lblNewLabel_2.setText("Price : "+mobile[i][1]);
                    lblNewLabel_3.setText("Main & selfie camera : "+mobile[i][3]+", "+mobile[i][4]);
                    lblNewLabel_4.setText("RAM & ROM : "+mobile[i][5]+", "+mobile[i][6]);
                    lblNewLabel_5.setText("Processor : "+mobile[i][7]);
					lblNewLabel_6.setText("Screen : "+mobile[i][8]);
					lblNewLabel_7.setText("Battery & Charger : "+mobile[i][9]+", "+mobile[i][10]);
                    
					try{
						File file = new File("C:/Users/nakka/Documents/Java/Java_Programs/Project.txt");
						FileWriter fw = new FileWriter(file, true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write("Name : ");
						bw.write(mobile[i][0]);
						bw.write(" ");
						bw.write(mobile[i][2]);
						bw.write("\n");
						bw.write("Price : ");
						bw.write(mobile[i][1]);
						bw.write("\n");
						bw.write("Main & selfie Camera : ");
						bw.write(mobile[i][3]);
						bw.write(", ");
						bw.write(mobile[i][4]);
						bw.write("\n");
						bw.write("RAM & ROM : ");
						bw.write(mobile[i][5]);
						bw.write(", ");
						bw.write(mobile[i][6]);
						bw.write("\n");
						bw.write("Processor : ");
						bw.write(mobile[i][7]);
						bw.write("\n");
						bw.write("Screen : ");
						bw.write(mobile[i][8]);
						bw.write("\n");
						bw.write("Battery & Charger : ");
						bw.write(mobile[i][9]);
						bw.write(", ");
						bw.write(mobile[i][10]);
						bw.write("\n");
						bw.write("------------------------------------------------------------------");
						bw.write("\n");
						bw.close();
						fw.close();
					}
					catch(Exception e){}

                    selected = true;
                    break;
                }
            }
        }
		if(!selected){
            lblNewLabel_2.setText("No smart phone found");
        }
		JButton btnNewButton = new JButton("Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window2();
			}
		});
		btnNewButton.setBounds(169, 229, 89, 23);
		frame.add(btnNewButton);
	}
}