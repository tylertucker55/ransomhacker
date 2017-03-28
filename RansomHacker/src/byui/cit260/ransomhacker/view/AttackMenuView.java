/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

/**
 *
 * @author 50mm3r
 */
public class AttackMenuView extends View {
    
    public AttackMenuView() {
        super("\n"
                + "\n[Job]"
                + "\n1 - [Attack]"
                + "\nSkills Required: [Skill - Level]"
                + "\nEquipment Required: [Equipment]"
                + "\nDetection: [%]"
                + "\nChance of Success: [%]"
                + "\nTime Cost: [# Days]"
                + "\n2 - [Attack]"
                + "\nSkills Required: [Skill - Level]"
                + "\nEquipment Required: [Equipment]"
                + "\nDetection: [%]"
                + "\nChance of Success: [%]"
                + "\nTime Cost: [# Days]"
                + "\n2 - [Attack]"
                + "\nSkills Required: [Skill - Level]"
                + "\nEquipment Required: [Equipment]"
                + "\nDetection: [%]"
                + "\nChance of Success: [%]"
                + "\nTime Cost: [# Days]");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.doAttack1();
                break;
            case "2":
                this.doAttack2();
                break;
            case "3":
                this.doAttack3();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
        }
        return false;
    }

    private void doAttack1() {
        System.out.println("doAttack1() Called");
    }

    private void doAttack2() {
        System.out.println("doAttack2() Called");
    }

    private void doAttack3() {
        System.out.println("doAttack3() Called");
    }
    
}