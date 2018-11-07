/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umut_can_altin_hw2;

/**
 *
 * @author user
 */
public class Inventory implements InventoryInterface{
    LinkedList<Device> nlist = new LinkedList<>();
    @Override
    public void addResistor(String val, Integer cnt) {
        nlist.Insert(new Device("Resistor", "-", val, cnt)); 
    }

    @Override
    public void addCapacitor(String val, String typ, Integer cnt) {
        nlist.Insert(new Device("Capacitor", typ, val, cnt)); 
    }

    @Override
    public void addInductor(String val, Integer cnt) {
        nlist.Insert(new Device("Inductor", "-", val, cnt)); 
    }

    @Override
    public void addTransistor(String typ, Integer cnt) {
        nlist.Insert(new Device("Transistor",typ, "-", cnt)); 
    }

    @Override
    public int deleteResistor(String val, Integer cnt) {
        
        return nlist.Delete(new Device("Resistor", "-", val, cnt));
    }

    @Override
    public int deleteCapacitor(String val, String typ, Integer cnt) {
        return nlist.Delete(new Device("Capacitor", typ, val, cnt));
    }

    @Override
    public int deleteInductor(String val, Integer cnt) {
       return nlist.Delete(new Device("Inductor", "-", val, cnt)); 
    }

    @Override
    public int deleteTransistor(String typ, Integer cnt) {
         return nlist.Delete(new Device("Transistor",typ, "-", cnt)); 
    }

    @Override
    public void printInventory() {
        nlist.Output();
    }
    
}
