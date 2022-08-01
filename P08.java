
public class P08{

    /**
     * @param args
     */
    public static void main (String[] args){
        /*===pg08===
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.print("x `is " + x);
        double d = Math.random();
        int x = 0;
        while(x > 12){
            x = x - 1;
        }
         
        for(int x = 0; x < 10; x = x + 1){
            System.out.print("x is now" + x);

        }=== 
        
        ===pg09===
        int x = 100;
        while(x >= 3){
            x = x - 1;
            System.out.println(x);

        }
        ************************
        APONTE SEU LÁPIS
        ************************
        int x = 1;
        while( x < 3 ){
            System.out.print("Doo");
            System.out.print("Bee");
            x=x+1;
        }
        if(x == 3){
            System.out.print("Do");

        }
        ************************/
        /**
         * Codificando um aplicativo real pg 11
         */
        /* 
        int beerNum = 99;
        String word = "boottles";

        while(beerNum > 0 ){

            if(beerNum == 1 ){

                word = "boottlle";

            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum -1;

            if(beerNum < 0){
                System.out.println("No more bottlles osf beer on the wall");
            }
        }
   */

    /*==============================================
     * pagina 13 PhaseMatic
     */
    /* 
     String[] wordListOne = {"24/7", "agora vai", "ola mundo", "estou aprendendo Java", "este é um exercício"};
     String[] wordListTwo = {"programação", "férias", "cerveja", "barulho", "nervoso"};
     String[] wordListTree = {"atenção", "militar", "foco", "sargento", "acabou", "beber"};

     int oneLength = wordListOne.length;
     int twoLength = wordListTwo.length;
     int treeLength = wordListTree.length;

     int rand1 = (int) (Math.random() * oneLength );
     int rand2 = (int) (Math.random() * twoLength );
     int rand3 = (int) (Math.random() * treeLength );

     String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListTree[rand3];


     System.out.println("Precisamos de " + phrase);*/


 /*==============================================
     * pagina 16 Imã de Geladeira
     
    int x = 3;

    while(x > 0){
        if(x > 2){
            System.out.print("a");
        }
        x = x - 1;
        System.out.print("-");

        if(x == 2){
            System.out.print("b c");
        }
         if(x == 1){
            System.out.print("d");
            x = x -1;
         }

    }*/

    /************************
    testando classe Dog
    ***********************
    Dog d = new Dog();

    d.bark();*/


 /************************
    testando classe Movie
    ************************/
    Movie one = new Movie();
    one.title = "Gone with tehe Stock";
    one.genre = "Tragic";
    one.rating = -2;

    Movie two = new Movie();
    two.title = "Lost in Cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();

    Movie three = new Movie();
    three.title = "Byte Club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;







}



}
