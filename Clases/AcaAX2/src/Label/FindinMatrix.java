package Label;

public class FindinMatrix {
    public static void main(String[] args) {
        int[][] list={{1,13},{5,2},{2,2},{6,5}};

        int searchValue=2;
        int positionX=-1;
        int positionY=-1;

        ETIQUETASEGUNDOFOR:for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length;j++){
                if(list[i][j]==searchValue){
                    positionX=i;
                    positionY=j;
                    break ETIQUETASEGUNDOFOR;
                }
            }
        }

        if(positionX==-1 || positionY==-1){
            System.out.println("value "+searchValue+" not found");
        }else{
            System.out.println("valor encontrado en ("+positionX+" , "+positionY+")");
        }
    }
}
