/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.control.GameControl.Courses;
import byui.cit260.ransomhacker.control.GameControl.Items;
import byui.cit260.ransomhacker.control.GameControl.Jobs;
import static byui.cit260.ransomhacker.control.ViewMapControl.locations;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Job;
import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.model.SkillDevelopment;
import java.awt.Point;
import ransomhacker.RansomHacker;

/**
 *
 * @author tylertucker
 */
public class ViewMapControl {

    public static Location locations[][];

    public static Map createMap() {

        Map map = new Map(7, 9);

        ViewMapControl.assignScenesToLocations(map);
        return map;
    }

    private static void assignScenesToLocations(Map map) {

        Location[][] locations = map.getLocations();

        locations[0][0].setScene(Scene.Seattle);
        //smallCites[0] = RansomHacker.getCurrentGame().getItems()[Items.computer.ordinal()];
        //locations[0][0].setItems(smallCities[]);
        locations[1][0].setScene(Scene.Portland);
        locations[2][0].setScene(Scene.Oakland);
        locations[3][0].setScene(Scene.LosAngeles);
        locations[4][0].setScene(Scene.SanDiego);
        locations[0][1].setScene(Scene.Spokane);
        locations[1][1].setScene(Scene.Rexburg);
        locations[2][1].setScene(Scene.SaltLakeCity);
        locations[3][1].setScene(Scene.LasVegas);
        locations[4][1].setScene(Scene.Phoenix);
        locations[0][2].setScene(Scene.Helena);
        locations[1][2].setScene(Scene.Cheyenne);
        locations[2][2].setScene(Scene.Denver);
        locations[3][2].setScene(Scene.Albuquerque);
        locations[4][2].setScene(Scene.Lubbock);
        locations[5][2].setScene(Scene.ElPaso);
        locations[0][3].setScene(Scene.Bismark);
        locations[1][3].setScene(Scene.RapidCity);
        locations[2][3].setScene(Scene.KansasCity);
        locations[3][3].setScene(Scene.Amarillo);
        locations[4][3].setScene(Scene.Austin);
        locations[5][3].setScene(Scene.SanAntonio);
        locations[6][3].setScene(Scene.McAllen);
        locations[0][4].setScene(Scene.Minneapolis);
        locations[1][4].setScene(Scene.DesMoines);
        locations[2][4].setScene(Scene.StLouis);
        locations[3][4].setScene(Scene.Tulsa);
        locations[4][4].setScene(Scene.Dallas);
        locations[5][4].setScene(Scene.Houston);
        locations[0][5].setScene(Scene.Milwaukee);
        locations[1][5].setScene(Scene.Chicago);
        locations[2][5].setScene(Scene.Indianapolis);
        locations[3][5].setScene(Scene.LittleRock);
        locations[4][5].setScene(Scene.BatonRouge);
        locations[5][5].setScene(Scene.NewOrleans);
        locations[0][6].setScene(Scene.Detroit);
        locations[1][6].setScene(Scene.Cleveland);
        locations[2][6].setScene(Scene.Cincinnati);
        locations[3][6].setScene(Scene.Louisville);
        locations[4][6].setScene(Scene.Nashville);
        locations[5][6].setScene(Scene.Jackson);
        locations[0][7].setScene(Scene.NewYork);
        locations[1][7].setScene(Scene.Philidelphia);
        locations[2][7].setScene(Scene.Baltimore);
        locations[3][7].setScene(Scene.Richmond);
        locations[4][7].setScene(Scene.Knoxville);
        locations[5][7].setScene(Scene.Montgomery);
        locations[0][8].setScene(Scene.Boston);
        locations[1][8].setScene(Scene.Trenton);
        locations[2][8].setScene(Scene.WashingtonDC);
        locations[3][8].setScene(Scene.Raleigh);
        locations[4][8].setScene(Scene.Charleston);
        locations[5][8].setScene(Scene.Atlanta);
        locations[6][8].setScene(Scene.Miami);

    }
    
    private void initializeLocations(Location[][] locations) {
        //create Stores
        Item[] itemList = RansomHacker.getCurrentGame().getItems();
        Item[] smallCityItems = {
            itemList[Items.computer.ordinal()],
            itemList[Items.emailserver.ordinal()],
            itemList[Items.wificard.ordinal()],
            itemList[Items.intermediatehackingsoftware.ordinal()]};
        Item[] mediumCityItems = {
            itemList[Items.computer.ordinal()],
            itemList[Items.emailserver.ordinal()],
            itemList[Items.wificard.ordinal()],
            itemList[Items.intermediatehackingsoftware.ordinal()],
            itemList[Items.supercomputer.ordinal()]};
        Item[] largeCityItems = {
            itemList[Items.computer.ordinal()],
            itemList[Items.emailserver.ordinal()],
            itemList[Items.wificard.ordinal()],
            itemList[Items.intermediatehackingsoftware.ordinal()],
            itemList[Items.supercomputer.ordinal()],
            itemList[Items.advancedhackingsoftware.ordinal()],
            itemList[Items.botnet.ordinal()],
            itemList[Items.vpnservice.ordinal()]};
        Item[] hugeCityItems = {
            itemList[Items.computer.ordinal()],
            itemList[Items.emailserver.ordinal()],
            itemList[Items.wificard.ordinal()],
            itemList[Items.intermediatehackingsoftware.ordinal()],
            itemList[Items.supercomputer.ordinal()],
            itemList[Items.advancedhackingsoftware.ordinal()],
            itemList[Items.botnet.ordinal()],
            itemList[Items.vpnservice.ordinal()],
            itemList[Items.proxynetwork.ordinal()]};
        Item[] massiveCityItems = {
            itemList[Items.computer.ordinal()],
            itemList[Items.emailserver.ordinal()],
            itemList[Items.wificard.ordinal()],
            itemList[Items.intermediatehackingsoftware.ordinal()],
            itemList[Items.supercomputer.ordinal()],
            itemList[Items.advancedhackingsoftware.ordinal()],
            itemList[Items.botnet.ordinal()],
            itemList[Items.vpnservice.ordinal()],
            itemList[Items.proxynetwork.ordinal()],
            itemList[Items.experthackingsoftware.ordinal()],
            itemList[Items.zerodayattacks.ordinal()]};
        
        //create Job Lists
        Job[] jobList = RansomHacker.getCurrentGame().getJobs();
        Job[] smallCityJobs = {
            jobList[Jobs.wifiPasswords.ordinal()],
            jobList[Jobs.stealCreditCards.ordinal()]};
        Job[] mediumCityJobs = {
            jobList[Jobs.wifiPasswords.ordinal()],
            jobList[Jobs.stealCreditCards.ordinal()],
            jobList[Jobs.setUpScam.ordinal()],
            jobList[Jobs.stealPasswords.ordinal()]};
        Job[] largeCityJobs = {
            jobList[Jobs.wifiPasswords.ordinal()],
            jobList[Jobs.stealCreditCards.ordinal()],
            jobList[Jobs.setUpScam.ordinal()],
            jobList[Jobs.stealPasswords.ordinal()],
            jobList[Jobs.sabotageDatabase.ordinal()],
            jobList[Jobs.stealIntel.ordinal()]};
        Job[] hugeCityJobs = {
            jobList[Jobs.wifiPasswords.ordinal()],
            jobList[Jobs.stealCreditCards.ordinal()],
            jobList[Jobs.setUpScam.ordinal()],
            jobList[Jobs.stealPasswords.ordinal()],
            jobList[Jobs.sabotageDatabase.ordinal()],
            jobList[Jobs.stealIntel.ordinal()],
            jobList[Jobs.crashBank.ordinal()]};
        Job[] massiveCityJobs = {
            jobList[Jobs.wifiPasswords.ordinal()],
            jobList[Jobs.stealCreditCards.ordinal()],
            jobList[Jobs.setUpScam.ordinal()],
            jobList[Jobs.stealPasswords.ordinal()],
            jobList[Jobs.sabotageDatabase.ordinal()],
            jobList[Jobs.stealIntel.ordinal()],
            jobList[Jobs.crashBank.ordinal()],
            jobList[Jobs.robExchange.ordinal()]};
        
        //create Skill Development Classes
        SkillDevelopment[] skillsList = RansomHacker.getCurrentGame().getSkills();
        SkillDevelopment[] smallCitySkills = {
            skillsList[Courses.selfStudy.ordinal()],
            skillsList[Courses.pyschologyClass.ordinal()],
            skillsList[Courses.hackerBootCamp.ordinal()]};
        SkillDevelopment[] mediumCitySkills = {
            skillsList[Courses.selfStudy.ordinal()],
            skillsList[Courses.pyschologyClass.ordinal()],
            skillsList[Courses.hackerBootCamp.ordinal()]};
        SkillDevelopment[] largeCitySkills = {
            skillsList[Courses.selfStudy.ordinal()],
            skillsList[Courses.pyschologyClass.ordinal()],
            skillsList[Courses.hackerBootCamp.ordinal()]};
        SkillDevelopment[] hugeCitySkills = {
            skillsList[Courses.selfStudy.ordinal()],
            skillsList[Courses.pyschologyClass.ordinal()],
            skillsList[Courses.hackerBootCamp.ordinal()]};
        SkillDevelopment[] massiveCitySkills = {
            skillsList[Courses.selfStudy.ordinal()],
            skillsList[Courses.pyschologyClass.ordinal()],
            skillsList[Courses.hackerBootCamp.ordinal()]};
       
       //Set Store Items, Job Lists, Course List to each location based on size
        for (int row = 0; row < locations.length; row++) {
            for (int col = 0; col < locations[row].length; col++) {
                // get size of city in scene in location
                int citySize = locations[row][col].getSize();
                switch (citySize) {
                    case 1:  
                        locations[row][col].setItems(smallCityItems);
                        locations[row][col].setJobs(smallCityJobs);
                        locations[row][col].setCourses(smallCitySkills);
                        break;
                    case 2:
                        locations[row][col].setItems(mediumCityItems);
                        locations[row][col].setJobs(mediumCityJobs);
                        locations[row][col].setCourses(mediumCitySkills);
                        break;
                    case 3:
                        locations[row][col].setItems(largeCityItems);
                        locations[row][col].setJobs(largeCityJobs);
                        locations[row][col].setCourses(largeCitySkills);
                        break;
                    case 4:
                        locations[row][col].setItems(hugeCityItems);
                        locations[row][col].setJobs(hugeCityJobs);
                        locations[row][col].setCourses(hugeCitySkills);
                        break;
                    case 5:
                        locations[row][col].setItems(massiveCityItems);
                        locations[row][col].setJobs(massiveCityJobs);
                        locations[row][col].setCourses(massiveCitySkills);
                        break;
                    default:
                        System.out.println("City Size invalid");
                        break;
                }
                
                
            }
            
        }
        
        
        
    }
}

