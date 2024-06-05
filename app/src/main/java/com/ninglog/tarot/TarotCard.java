package com.ninglog.tarot;

import java.util.Random;

public class TarotCard {
    private String name; // 塔罗牌名称
    private int number; // 塔罗牌序号
    private int imageResourceId; // 塔罗牌图片资源ID
    private String uprightDescription; // 正位解读
    private String reversedDescription; // 逆位解读
    private boolean isReversed; // 是否逆位

    // 构造函数，初始化塔罗牌属性
    public TarotCard(String name, int number, int imageResourceId, String uprightDescription, String reversedDescription) {
        this.name = name;
        this.number = number;
        this.imageResourceId = imageResourceId;
        this.uprightDescription = uprightDescription;
        this.reversedDescription = reversedDescription;
        this.isReversed = new Random().nextBoolean(); // 随机设置是否逆位
    }

    // 获取塔罗牌名称
    public String getName() {
        return name;
    }

    // 获取塔罗牌序号
    public int getNumber() {
        return number;
    }

    // 获取塔罗牌图片资源ID
    public int getImageResourceId() {
        return imageResourceId;
    }

    // 获取正位解读
    public String getUprightDescription() {
        return uprightDescription;
    }

    // 获取逆位解读
    public String getReversedDescription() {
        return reversedDescription;
    }

    // 根据是否逆位返回相应的解读
    public String getDescription() {
        return isReversed ? reversedDescription : uprightDescription;
    }

    // 获取是否逆位
    public boolean isReversed() {
        return isReversed;
    }

    // 设置是否逆位
    public void setReversed(boolean reversed) {
        isReversed = reversed;
    }
}
