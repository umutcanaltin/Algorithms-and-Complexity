
package hw_1_user;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author user
 */
public class HW_1_USER extends JFrame{

   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Umut Can Altın HW_1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        
        JPanel panel = new JPanel(); 
        JLabel label = new JLabel("Select sorting function :");
        JPanel seacrh_panel = new JPanel();
        JButton seacrh_file = new JButton("SEARCH");
        JButton bttn_id = new JButton("ID");
        JButton bttn_year = new JButton("YEAR");
        JButton bttn_age = new JButton("AGE");
        bttn_id.setEnabled(false);
        bttn_age.setEnabled(false);
        bttn_year.setEnabled(false);
        panel.add(label); 
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        ArrayList<Student> theStudentsList = new ArrayList<>(); 
        textArea.setEditable(false);
        
        StudentBase studentbase = new StudentBase();
        
        seacrh_file.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
                fc.setFileFilter(filter);
                int returnVal = fc.showOpenDialog(frame);
               
                if(returnVal == JFileChooser.APPROVE_OPTION){
                File selFile = fc.getSelectedFile();
                String file_path = selFile.getAbsolutePath();
                
                
                    try {
                        String sCurrentLine;
                        BufferedReader br = new BufferedReader(new FileReader(file_path));
                        int line_num = Integer.parseInt(br.readLine());
                         
                while ((sCurrentLine = br.readLine()) != null) {
                   
                        String[] parts = sCurrentLine.split(" ");
                        Student student = new Student();
                        student.ID = Long.parseLong(parts[0]);
                        student.name= parts[1];
                        student.surname= parts[2];
                        student.age= Integer.parseInt(parts[3]);
                        student.admYear=Integer.parseInt(parts[4]);
                        theStudentsList.add(student);
                    
                    
                }
                bttn_age.setEnabled(true);
                bttn_year.setEnabled(true);
                bttn_id.setEnabled(true);
                    } 
                    catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,ex,"Fatal error",JOptionPane.ERROR_MESSAGE);
                    }
                
                
                
                }
                else{
                JOptionPane.showMessageDialog(frame, "Please Select A File");
                }
                
                
                
                        
            }
        });
        
        bttn_id.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setText(" ");
                 ArrayList<Student> list = studentbase.sort_ID(theStudentsList);
                  for(int i=0;i<list.size();i++){
                      textArea.append(list.get(i).ID + " ");
            
                      textArea.append(list.get(i).name+ " ");
                      textArea.append(list.get(i).surname+ " ");
                      textArea.append(list.get(i).age+ " ");
                      textArea.append(list.get(i).admYear+ " \n");
                      
                      
        }
            }
        });
        
        bttn_year.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setText(" ");
                 ArrayList<Student> list = studentbase.sort_Year(theStudentsList);
                  for(int i=0;i<list.size();i++){
                      textArea.append(list.get(i).ID + " ");
            
                      textArea.append(list.get(i).name+ " ");
                      textArea.append(list.get(i).surname+ " ");
                      textArea.append(list.get(i).age+ " ");
                      textArea.append(list.get(i).admYear+ " \n");
                      
                      
        }
            }
        });
        bttn_age.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                textArea.setText(" ");
                 ArrayList<Student> list = studentbase.sort_Age(theStudentsList);
                  for(int i=0;i<list.size();i++){
                      textArea.append(list.get(i).ID + " ");
            
                      textArea.append(list.get(i).name+ " ");
                      textArea.append(list.get(i).surname+ " ");
                      textArea.append(list.get(i).age+ " ");
                      textArea.append(list.get(i).admYear+ " \n");
                      
                      
        }
            }
        });
        
        
        
        panel.add(bttn_id);
        panel.add(bttn_year);
        panel.add(bttn_age);
        seacrh_panel.add(new JLabel("Search text file : "));
        seacrh_panel.add(seacrh_file);
        
        
        
        
        frame.getContentPane().add(BorderLayout.NORTH,seacrh_panel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        
       
        
        frame.setVisible(true);
    }
    
}
