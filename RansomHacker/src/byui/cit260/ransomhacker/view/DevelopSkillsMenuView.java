/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

/**
 *
 * @author Hansen
 */
public class DevelopSkillsMenuView {
   
    private String menu;
    
    public DevelopSkillsMenuView() {
        this.menu = "\n"
                    + "\n----------------------------"
                    + "\n|     Develop Skills        |"
                    + "\n----------------------------"
                    + "\n1 - Self-Study"
                    + "\n2 - Certification Boot Camp"
                    + "\n3 - Psychology class"
                    + "\n----------------------------";
        System.out.println(menu);
    }
    
     public void displayDevelopSkillsMenuView() {
        System.out.println("This is the Develop Skill function");
       
     }
}
