package com.gdufe.builderpattern;

import lombok.Data;

/**
 * @Author: laichengfeng
 * @Description: 产品类 套餐类
 * @Date: 2018/7/29 17:23
 */
public class Meal {
    // food 和 drink 部件
    private String food;

    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
