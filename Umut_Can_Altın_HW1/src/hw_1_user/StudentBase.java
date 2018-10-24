/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_1_user;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public  class StudentBase {
    
    public ArrayList<Student> sort_ID(ArrayList<Student>Student_array){
        for(int i=0;i<Student_array.size();i++){
            Student key =Student_array.get(i);
            int j = i-1;
            while (j >= 0 && key.ID < Student_array.get(j).ID ){
                key = Student_array.set(j+1,Student_array.get(j));
                Student_array.set(j,key);
                j--;
              }

           
        }
        return Student_array;
        
    }
    public ArrayList<Student> sort_Year(ArrayList<Student>Student_array){
        for(int i=0;i<Student_array.size();i++){
            Student key =Student_array.get(i);
            int j = i-1;
            while (j >= 0 && key.admYear< Student_array.get(j).admYear ){
                key = Student_array.set(j+1,Student_array.get(j));
                Student_array.set(j,key);
                j--;
              }

           
        }
        return Student_array;
    }
    public ArrayList<Student> sort_Age(ArrayList<Student>Student_array){
         for(int i=0;i<Student_array.size();i++){
            Student key =Student_array.get(i);
            int j = i-1;
            while (j >= 0 && key.age< Student_array.get(j).age ){
                key = Student_array.set(j+1,Student_array.get(j));
                Student_array.set(j,key);
                j--;
              }

           
        }
        return Student_array;
                } 
}
