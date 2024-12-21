package basics.extendses.optionb.task1.bouquet;

import basics.extendses.optionb.task1.abstractflower.Flower;
import basics.extendses.optionb.task1.accessories.Accessory;
import basics.extendses.optionb.task1.additionflower.Additionable;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bouquet implements Additionable {
    private final List<Flower> flowers;
    private final List<Accessory> accessories;


    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    @Override
    public void addFlower(Flower...flower) {
        flowers.addAll(List.of(flower));
    }

    @Override
    public void addAccessory(Accessory...accessory) {
        accessories.addAll(List.of(accessory));
    }

    public void showBouquetWithAccessory() {
        List<Object> bouquet = new ArrayList<>(flowers);
        bouquet.addAll(accessories);
        bouquet.forEach(System.out::println);

    }

    public void sortFlowers() {
        Collections.sort(flowers);
    }

    public void showPriceBouquet() {
        int result = 0;
        for (Flower flower : flowers) {
            result += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            result += accessory.getPrice();
        }
        System.out.println(result);
    }

    public void setFresh(int days){
        for(Flower flower : flowers){
            flower.getTypeFlower().setDays(new Random().nextInt(days));
        }
    }
    public void setHierarchy(Flower flower){
        switch (flower.getTypeFlower()){
            case ROSA -> System.out.println("Наивысшее растение");
            case CHAMOMILE -> System.out.println("среднее растение");
            case CORNFLOWER -> System.out.println("низшее");
        }
    }



}

