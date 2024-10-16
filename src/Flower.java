public class Flower {


        // Task 5 Session

        String flowerName;
        int freshness;
        int price;

        public int getMaxPrice(Flower[] blossom){
            int maxPrice = 0;
            for(Flower flowers: blossom){
                if(flowers.price > maxPrice){
                    maxPrice = flowers.price;

                }
            }
            return maxPrice;
        }

        public int sortFresh(Flower[] blossom){
            int freshFlower = 3;
            for(Flower Fresh: blossom){
                if(Fresh.freshness < freshFlower){
                    freshFlower = Fresh.freshness;
                }
            }return freshFlower;
        }
    }

