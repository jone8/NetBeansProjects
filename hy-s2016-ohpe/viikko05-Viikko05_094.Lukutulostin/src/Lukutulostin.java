/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kari
 */
public class Lukutulostin {

    public void lukuporras(int luku) {
        int rivit = 0;
        int riviluku = 1;
        while (rivit <= luku) {

            while (riviluku <= rivit) {
                System.out.print(riviluku + " ");
                riviluku++;
            }
            System.out.println("");
            riviluku = 1;
            rivit++;
        }
    }

    public void jatkuvaLukuporras(int luku) {
        int rivit = 1;
        int riviluku = 1;
        int i = 1;
        while (rivit <= luku) {
            while (i <= rivit) {
                System.out.print(riviluku + " ");
                riviluku++;
                i++;
            }

            System.out.println("");
            i = 1;
            rivit++;
        }
    }

    public void kertokolmio(int luku) {
        int rivineka = 1;
        int i = 1;
        int rivit = 1;
        int rivinmuut = 1;
        int joku = 1;
        while (rivit <= luku) {
            while (i <= rivit) {
                System.out.print(rivinmuut + " ");
                i++;
                rivinmuut = rivinmuut + joku;
                rivineka++;
            }
            System.out.println("");
            i = 1;
            rivit++;
            rivinmuut = rivineka;
            joku = rivineka;
            rivineka = 1;
        }

    }



 
   
}
