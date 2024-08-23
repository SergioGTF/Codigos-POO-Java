public class Gota extends App {
    public int x;
    public int y;

    
    public Gota() {
        this.x = 0;
        this.y = 0;
    }

    public Gota(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void mover(int direçao){
        if (direçao ==0){
            x+=1;
        } else if (direçao == 1){
            y+=1;
        } else if (direçao ==2){
            x-=1;
        } else if (direçao ==3){
            y-=1;
        }
    }

    public void verificar(int direçao){

    }
}
