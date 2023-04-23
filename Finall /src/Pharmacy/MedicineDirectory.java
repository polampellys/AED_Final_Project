/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author saketh
 */
public class MedicineDirectory {
    private ArrayList<Medicine> medicinelist;
    
    public MedicineDirectory(){
        this.medicinelist = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicinelist() {
        return medicinelist;
    }

    public void setMedicinelist(ArrayList<Medicine> medicinelist) {
        this.medicinelist = medicinelist;
    }
    
    public Medicine createMedicine(int number,String name, int quantity){
        Medicine medicine = new Medicine();
        
        medicine.setNumber(number);
        medicine.setName(name);
        medicine.setQuantity(quantity);
        
        this.medicinelist.add(medicine);
        
        return medicine;
        
    }
    
    public Boolean checkUniqueMedicineNumber(int num){
        for(Medicine vehicle: this.medicinelist){
            if(vehicle.getNumber()==num){
                return false;
            }
        }return true;
    }
    
    public void deleteMedicine(Medicine medicine){
        this.medicinelist.remove(medicine);
    }
    
    public Medicine getMedicineById(int num){
        for(Medicine medicine: this.getMedicinelist()){
            if(medicine.getNumber()==num){
                return medicine;
            }
        }return null;
    }
    
}
