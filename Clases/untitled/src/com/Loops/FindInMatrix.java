package com.Loops;

import java.awt.*;

public class FindInMatrix {
    public static void main(String[] args) {
        int[][] list={{1,13},{5,2},{2,2}};
        //2,1*

        int searchValue=2;
        int positionX=-1;
        int positionY=-1;



         for(int i=0;i<list.length;i++){
                    ETIQUETA1: for(int j=0;j<list[i].length;j++){
                        if(list[i][j]==searchValue){
                            positionX=i;
                            positionY=j;
                            System.out.println("i= "+positionX);
                            System.out.println("j = " + positionY);
                            break ETIQUETA1;
                        }
                    }
        }

    }
}
