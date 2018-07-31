package com.gdufe.builderpattern;

import lombok.Getter;

/**
 * @Author: laichengfeng
 * @Description: 抽象建造者
 * @Date: 2018/7/29 17:25
 */
 public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
