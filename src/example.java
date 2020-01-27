/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author windbit10
 */
public class example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gaji=987000000;
        
        if(gaji>=20000000){
            System.out.println("Anda Directur");
        }
        else if(gaji>=10000000){
            System.out.println("Anda manager");
        }else if(gaji>=7000000){
            System.out.println("anda kepala bagian");
        }else if(gaji<=7000000){
            System.out.println("kariawan produksi");
    }
    }
    
}
