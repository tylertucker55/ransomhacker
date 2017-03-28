/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author muhile
 */
public enum Scene {
    Seattle(4, "[WA]", 1, 1),
    Portland(3, "[OR]", 2, 1),
    Oakland(4, "[CA]", 3, 1),
    LosAngeles(5, "[CA]", 4, 1),
    SanDiego(4, "[CA]", 5, 1),
    Spokane(2, "[WA]", 1, 2),
    Rexburg(1, "[ID]", 2, 2),
    SaltLakeCity(3, "[UT]", 3, 2),
    LasVegas(3, "[NV]", 4, 2),
    Phoenix(5, "[AZ]", 5, 2),
    Helena(2, "[MT]", 1, 3),
    Cheyenne(1, "[WY]", 2, 3),
    Denver(4, "[CO]", 3, 3),
    Albuquerque(3, "[NM]", 4, 3),
    Lubbock(3, "[TX]", 5, 3),
    ElPaso(4, "[TX]", 6, 3),
    Bismark(1, "[ND]", 1, 4),
    RapidCity(1, "[SD]", 2, 4),
    KansasCity(3, "[KS]", 3, 4),
    Amarillo(2, "[TX]", 4, 4),
    Austin(4, "[TX]", 5, 4),
    SanAntonio(4, "[TX]", 6, 4),
    McAllen(3, "[TX]", 7, 4),
    Minneapolis(4, "[MN]", 1, 5),
    DesMoines(2, "[IA]", 2, 5),
    StLouis(4, "[MO]", 3, 5),
    Tulsa(3, "[OK]", 4, 5),
    Dallas(4, "[TX]", 5, 5),
    Houston(5, "[TX]", 5, 6),
    Milwaukee(3, "[WI]", 1, 6),
    Chicago(5, "[IL]", 2, 6),
    Indianapolis(3, "[IN]", 3, 6),
    LittleRock(2, "[AR]", 4, 6),
    BatonRouge(2, "[LA]", 5, 6),
    NewOrleans(3, "[LA]", 6, 6),
    Detroit(4, "[MI]", 1, 7),
    Cleveland(3, "[OH]", 2, 7),
    Cincinnati(3, "[OH]", 3, 7),
    Louisville(2, "[KY]", 4, 7),
    Nashville(3, "[TN]", 5, 7),
    Jackson(2, "[MS]", 6, 7),
    NewYork(5, "[NY]", 1, 8),
    Philidelphia(5, "[PA]", 2, 8),
    Baltimore(4, "[MD]", 3, 8),
    Richmond(3, "[VA]", 4, 8),
    Knoxville(1, "[TN]", 5, 8),
    Montgomery(1, "[AL]", 6, 8),
    Boston(5, "[MA]", 1, 9),
    Trenton(2, "[NJ]", 2, 9),
    WashingtonDC(5, "[DC]", 3, 9),
    Raleigh(2, "[NC]", 4, 9),
    Charleston(2, "[SC]", 5, 9),
    Atlanta(5, "[GA]", 6, 9),
    Miami(2, "[FL]", 7, 9);

    private Point coordinates;
    private String symbol;
    private int size;

    Scene(int size, String symbol, int row, int column) {
        this.coordinates = new Point(row, column);

        this.symbol = symbol;
        this.size = size;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getSize() {
        return size;
    }

}
