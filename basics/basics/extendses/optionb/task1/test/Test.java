package basics.extendses.optionb.task1.test;

import basics.extendses.optionb.task1.abstractflower.TypeFlower;
import basics.extendses.optionb.task1.accessories.Accessory;
import basics.extendses.optionb.task1.bouquet.Bouquet;
import basics.extendses.optionb.task1.chamomile.Chamomile;
import basics.extendses.optionb.task1.cornflower.Cornflower;
import basics.extendses.optionb.task1.rosa.Rosa;

public class Test {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Cornflower(TypeFlower.CORNFLOWER, 10, "Василек", 15),  new Chamomile(TypeFlower.CHAMOMILE, 5, "Ромашка", 17), new Rosa(TypeFlower.ROSA, 7, "Роза", 18));
        bouquet.addAccessory(new Accessory("Лента", 10), new Accessory("Открытка", 20));
        bouquet.setFresh(10);
        bouquet.sortFlowers();
        bouquet.showBouquetWithAccessory();
        bouquet.showPriceBouquet();

        System.out.println();
        Cornflower cornflower = new Cornflower(TypeFlower.CORNFLOWER, 10, "Василек", 15);
        System.out.println(cornflower.getNameFlower());
        cornflower.setNameFlower("dfdf");
        System.out.println(cornflower.getNameFlower());

    }


}
