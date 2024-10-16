//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower();

        flower1.flowerName = "Rose";
        flower1.freshness = 3;
        flower1.price = 140;

        Flower flower2 = new Flower();

        flower2.flowerName = "Tulip";
        flower2.freshness = 2;
        flower2.price = 130;

        Flower flower3 = new Flower();

        flower3.flowerName = "Orchid";
        flower3.freshness = 4;
        flower3.price = 200;

        Flower flower4 = new Flower();

        flower4.flowerName = "Jasmine";
        flower4.freshness = 1;
        flower4.price = 150;

        Flower[] blossom = new Flower[]{flower1, flower2, flower3, flower4,};
        for(Flower flow: blossom){

              System.out.println("Name: " + flow.flowerName + "\n" +
           "Freshness: " + flow.freshness + "\n" + "Price: " + flow.price);
          }


        int maxPrice = flower1.getMaxPrice(blossom);
        System.out.println("\n Эң кымбат гүлдүн баасы: " + maxPrice);

         int freshFlower = flower1.sortFresh(blossom);
        System.out.println("\n Эң свежий гүл канча кун мурда келген: " + freshFlower);

    }
}