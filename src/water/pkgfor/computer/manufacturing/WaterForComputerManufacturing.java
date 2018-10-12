/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package water.pkgfor.computer.manufacturing;
import java.util.Scanner;
/**
 *
 * @author SeKna6164
 */
public class WaterForComputerManufacturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        double water, rig, waterUsed;
        water = 1.5;
        System.out.println("Enter how many computer monitor combos you have:");
        rig = keyedInput.nextDouble();
        waterUsed = water*rig;
        System.out.println(waterUsed + " Tons of water were used to create your computers and monitors");
        
    }
    
}
