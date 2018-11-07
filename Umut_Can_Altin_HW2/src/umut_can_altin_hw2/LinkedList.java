/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umut_can_altin_hw2;

import java.util.Objects;





/**
 *
 * @author user
 * @param <AnyType>
 */
public class LinkedList <AnyType> extends LNode<AnyType>  {
     private LNode<AnyType> first;
    private int pos ;
   
    public void LinkedList(){
        first = null;   
        pos = 0;
        
        
    }
    
    public void Insert(Device newElement){
        
        LNode<AnyType> Dummy;
        
        
        if ((int)0 == pos) // Add to the first location
        {
            LNode<AnyType> NewNode;
            NewNode = new LNode<>();
            NewNode.Element = newElement;
            NewNode.link = null;
            first = NewNode;
            pos =1;
        }
        else
        {
            Dummy = first;
            int found=0;
            while (true)
            {
                  
                  if(Dummy.Element.Name.equals(newElement.Name)&&Dummy.Element.Type.equals(newElement.Type)&& Dummy.Element.Value.equals(newElement.Value))
                  {
                      Dummy.Element.Count += newElement.Count;
                      found=1;
                      break;
                  }
                  if (pos > 0 && Dummy.link == null){
                      break;
                  }
                  Dummy = Dummy.link;
                  
            }
            if (found ==0){
            LNode<AnyType> NewNode = new LNode<>();
            NewNode.Element = newElement;
            NewNode.link = null;
            Dummy.link = NewNode;
            }
        }
    }
    public int Delete(Device deleteElement){
        LNode<AnyType> Dummy;
        int position = 1;
        int cnt =0;
        Dummy = first;
            int found=0;
            while (true)
            {
                  
                  if(Dummy.Element.Name.equals(deleteElement.Name)&&Dummy.Element.Type.equals(deleteElement.Type)&& Dummy.Element.Value.equals(deleteElement.Value))
                  {
                      if(Dummy.Element.Count>deleteElement.Count){
                          Dummy.Element.Count -= deleteElement.Count;
                          cnt=Dummy.Element.Count;
                          break;
                      }
                      else{
                          
                            if (position == 1 && first != null){    // The First Element
                                
                                first = first.link;  
                            }else{
                            Dummy = first;
                            for (int i = 0; i < position-2; i++)
                            {
                                  Dummy = Dummy.link;
                                  
                            }
                            
                            Dummy.link = Dummy.link.link;
                            cnt=-1;
                            }
                      }
                      
                      
                  }else{cnt=-1;}
                  if (pos > 0 && Dummy.link == null){
                      cnt = -1 ;
                      break;
                      
                  }
                  Dummy = Dummy.link;
                  position +=1;
                  
            }
         
         return cnt;
        
    }
  
 

    public void Output(){
        LNode<AnyType> Dummy;
        Dummy = first;
        System.out.print("The Elements in the list are :\n");
        while (Dummy != null){
            if(Dummy.Element.Name.equals("Resistor")){
               System.out.print(Dummy.Element.Name +" "+Dummy.Element.Type + " "+ Dummy.Element.Value + " "  +Dummy.Element.Count + "\n");
            }
             Dummy = Dummy.link;
        }
        Dummy = first;
        while (Dummy != null){
            if(Dummy.Element.Name.equals("Capacitor")){
             System.out.print(Dummy.Element.Name +" "+Dummy.Element.Type + " "+ Dummy.Element.Value + " "  +Dummy.Element.Count+ "\n");
            }
             Dummy = Dummy.link;
        }
        Dummy = first;
        while (Dummy != null){
            if(Dummy.Element.Name.equals("Inductor")){
             System.out.print(Dummy.Element.Name+" "+Dummy.Element.Type  + " "+ Dummy.Element.Value + " "  +Dummy.Element.Count+ "\n");
            }
             Dummy = Dummy.link;
        }
        Dummy = first;
        while (Dummy != null){
            if(Dummy.Element.Name.equals("Transistor")){
             System.out.print(Dummy.Element.Name +" "+Dummy.Element.Type + " "+ Dummy.Element.Value + " "  +Dummy.Element.Count+ "\n");
            }
             Dummy = Dummy.link;
        }
        Dummy = first;
        System.out.println("");
        
    }
    
    
    
}
